import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SumTest {

    @ParameterizedTest
    @MethodSource("validData")
    void sumOfTwoNumbersValidTest(Integer expected,
                                                    Integer a,Integer b) {
        Sum sum = new Sum();
        assertEquals(expected, sum.sumOfTwoNumbers(a,b),
                "Actual result of sum in not correct");
    }
    static Stream<Arguments> validData(){
        return Stream.of(
                arguments(7, 3, 4),
                arguments(11, 5, 6),
                arguments(500, 300, 200),
                arguments(-7, -4, -3)
        );
    }





    @Test
    void sumOfTwoNumbersNegativeTest() {
        Sum sum = new Sum();
        assertNotEquals(11, sum.sumOfTwoNumbers(3,4),
                "Actual result of sum in not correct");
    }

}