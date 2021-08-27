import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RangeTest {

    @Test
    public void isStartWithInclusiveWithKampooShouldBeTrue() {
        // Arrange
        Range range = new Range("[1,5]");

        // Act
        boolean actualResult = range.isStartWithInclusive();

        // Assert
        assertTrue(actualResult);
    }

    @Test
    public void isStartWithInclusiveWithBracketShouldBeFalse() {
        // Arrange
        Range range = new Range("(1,5]");

        // Act
        boolean actualResult = range.isStartWithInclusive();

        // Assert
        assertFalse(actualResult);
    }

    @Test
    public void getStartInputShouldbe1() {
        // Arrange
        Range range = new Range("[1,5]");

        // Act
        int actualResult = range.getStartInput();

        // Assert
        assertEquals(1, actualResult);
    }

    @Test
    public void isEndWithInclusiveWithKampooShouldBeTrue() {
        // Arrange
        Range range = new Range("[1,5]");

        // Act
        boolean actualResult = range.isEndWithInclusive();

        // Assert
        assertTrue(actualResult);
    }
}