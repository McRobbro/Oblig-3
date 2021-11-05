import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class LeapYears {
    @Test
    public void Years_Dividable_By_Four_Are_Leap_Years() {
        assertTrue(LeapYear.leapYearCheck(2000));
    }
    @Test
    public void Years_Dividable_By_Hundred_Are_Not_Leap_Years() {
        assertFalse(LeapYear.leapYearCheck(1800));
    }
    @Test
    public void Years_Dividable_By_Four_Hundred_Are_Leap_Years() {
        assertTrue(LeapYear.leapYearCheck(1600));
    }
    @Test
    public void Years_Not_Dividable_By_Four_Are_Not_Leap_Years() {
        assertFalse(LeapYear.leapYearCheck(1867));
    }

    @ParameterizedTest
    @MethodSource("LeapYears")
    public void AreTheyLeapYears(Boolean expected, int input) {
        assertEquals(expected, LeapYear.leapYearCheck(input));
    }

    public static Stream LeapYears() {
        return Stream.of(
                Arguments.of(true, 2020),
                Arguments.of(false, 2021),
                Arguments.of(true, 1964),
                Arguments.of(false, 1850),
                Arguments.of(false, 1200),
                Arguments.of(false, 2002),
                Arguments.of(false, 1700),
                Arguments.of(false, 1800),
                Arguments.of(false, 1900),
                Arguments.of(true, 2000)
        );
    }
}
