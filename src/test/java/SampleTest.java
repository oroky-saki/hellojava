import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SampleTest {

    @Test
    void SampleStringTest() {
        // Arrange
        var sampleString = "Hello Jenkins";

        // Act
        var result = sampleString.contains("Jenkins");

        // Assert
        assertTrue(result);
    }

    @Test
    void SampleMathOperationTest() {
        // Arrange
        var one = 1;
        var two = 2;
        var expectedResult = 3;

        // Act
        var actualResult = one + two;

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void SampleCollectionTest() {
        // Arrange
        var list = List.of("Hello, Jenkins!");

        // Act
        var actualResult = list.isEmpty();

        // Assert
        assertFalse(actualResult);
    }
}
