package application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main = new Main();

    @Test
    void whenExists_thenReturnValue() {
        Assertions.assertNotNull(main.exists(null,null));
    }

    @Test
    void whenInputBoardNull_thenFalse() {
        Assertions.assertFalse(main.exists(null,"A"));
    }

    @Test
    void whenInputWordNull_thenFalse() {
        Assertions.assertFalse(main.exists(new String[]{"A"}, null));
    }

    @Test
    void whenInputArrayDimensionsMismatch_thenFalse() {
        Assertions.assertFalse(main.exists(new String[]{"A","CD"}, "A"));
    }

    @Test
    void whenInputArrayDimensionsMatch_andWordExists_thenTrue() {
        Assertions.assertTrue(main.exists(new String[]{"A","C"}, "A"));
    }

    @Test
    void whenInputWordIsMatched_thenTrue() {
        Assertions.assertTrue(main.exists(new String[]{"A","C"}, "A"));
    }

    @Test
    void whenInputIsMatched_thenTrue() {
        Assertions.assertFalse(main.exists(null,null));
    }

    @Test
    void whenInputWordIsLongerThanArraySpaces_thenFalse() {
        Assertions.assertFalse(main.isNotTooLong(new String[]{"A","B"}, "ABC"));
    }
}