package application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main= new Main();

    @Test
    void exists_hasInputForBoardAndWord() {
        Assertions.assertNotNull(main.exists(new String[][]{{"ROW1"},{"ROW2"}}, "word"));
    }

//    @Test
//    void parseBoard_whenStringArray_thenBoard() {
//        Assertions.assertEquals(new String[][]{
//                {"R","O","W","1"},
//                {"R","O","W","2"}
//                }
//                ,main.parseBoard(new String[][]{{"ROW1"},{"ROW2"}}));
//    }

    //parseBoard to save on excess brackets when providing boards for testing
    @Test
    void parseBoard_whenStringArray_thenBoard() {
        Assertions.assertArrayEquals(new String[][]{{"R","O","W","1"}}
                ,main.parseBoard(new String[][]{{"ROW1"}}));
    }

    @Test
    void exists_whenBoardNull_thenFalse() {
        Assertions.assertFalse(main.exists(null, "word"));
    }

    @Test
    void exists_whenWordNull_thenFalse() {
        Assertions.assertFalse(main.exists(new String[][]{{"ROW1"},{"ROW2"}}, null));
    }

    @Test
    void exists_whenInputsNull_thenFalse() {
        Assertions.assertFalse(main.exists(null, null));
    }

    @Test
    void validateInput_whenBoardNull_thenFalse() {
        Assertions.assertFalse(main.validateInput(null, "word"));
    }

    @Test
    void validateInput_whenBoard_thenTrue() {
        Assertions.assertTrue(main.validateInput(new String[][]{{"ROW1"},{"ROW2"}}, "word"));
    }

    @Test
    void exists_whenWordIsEmpty_thenFalse() {
        Assertions.assertFalse(main.exists(new String[][]{{"OW1"},{"ROW2"}}, ""));
    }

    @Test
    void exists_whenBoardIsEmpty_thenFalse() {
        Assertions.assertFalse(main.exists(new String[][]{}, "drow"));
    }

    @Test
    void exists_whenBoardDimensionMismatch_thenFalse() {
        Assertions.assertFalse(main.exists(new String[][]{{"OW1"},{"ROW2"}}, "word"));
    }

    @Test
    void findStart_whenLetterMatches_thenTrue() {
        Assertions.assertTrue(main.findStart(new String[][]{{"S"},{"B"}}, "S"));
    }

    @Test
    void findStart_whenNotLetterMatches_thenFalse() {
        Assertions.assertFalse(main.findStart(new String[][]{{"S"},{"B"}}, "C"));
    }
}