ALTER TABLE Customers ADD IsVIP CHAR(1);

SET SERVEROUTPUT ON;

DECLARE
    CURSOR c_customers IS
        SELECT CustomerID, DOB, Balance
        FROM Customers;

    CURSOR c_loans IS
        SELECT LoanID, CustomerID, EndDate
        FROM Loans
        WHERE EndDate BETWEEN SYSDATE AND SYSDATE + 30;

    v_age NUMBER;
BEGIN

    FOR cust IN c_customers LOOP

        v_age := FLOOR(MONTHS_BETWEEN(SYSDATE, cust.DOB) / 12);

        IF v_age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = cust.CustomerID;
        END IF;

    END LOOP;

    DBMS_OUTPUT.PUT_LINE('Scenario 1 Completed.');

    FOR cust IN c_customers LOOP

        IF cust.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'Y'
            WHERE CustomerID = cust.CustomerID;
        ELSE
            UPDATE Customers
            SET IsVIP = 'N'
            WHERE CustomerID = cust.CustomerID;
        END IF;

    END LOOP;

    DBMS_OUTPUT.PUT_LINE('Scenario 2 Completed.');

    FOR loan IN c_loans LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Customer ID ' || loan.CustomerID ||
            ' | Loan ID: ' || loan.LoanID ||
            ' | Due Date: ' || TO_CHAR(loan.EndDate, 'DD-MON-YYYY')
        );

    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Exercise 1 Completed Successfully.');

EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/