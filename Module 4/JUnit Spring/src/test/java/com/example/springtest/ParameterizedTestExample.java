

import com.example.demo.service.CalculatorService;

import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedTestExample {

    CalculatorService service = new CalculatorService();

    @ParameterizedTest

    @CsvSource({
            "2,3,5",
            "10,5,15",
            "4,6,10"
    })

    void testAdd(int a,int b,int result){

        assertEquals(result,service.add(a,b));

    }

}