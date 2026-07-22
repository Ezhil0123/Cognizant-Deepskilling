import React from "react";
import EmployeeCard from "./EmployeeCard";

function EmployeeList(props) {
  return (
    <div>
      <h2>Employees List</h2>

      {props.employees.map((employee) => (
        <EmployeeCard
          key={employee.id}
          employee={employee}
        />
      ))}
    </div>
  );
}

export default EmployeeList;