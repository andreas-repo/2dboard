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
        Assertions.assertFalse(main.exists(new String[][]{{"A"},{"B"}}, null));
    }

    @Test
    void whenInputArrayDimensionsMismatch_thenFalse() {
        Assertions.assertFalse(main.exists(new String[][]{{"A"},{"C","D"}}, "A"));
    }

    @Test
    void whenInputArrayDimensionsMatch_andWordExists_thenTrue() {
        Assertions.assertTrue(main.exists(new String[][]{{"A"},{"C"}}, "A"));
    }

    @Test
    void whenInputWordIsMatched_thenTrue() {
        Assertions.assertTrue(main.exists(new String[][]{{"A"},{"C"}}, "A"));
    }

    @Test
    void whenInputIsMatched_thenTrue() {
        Assertions.assertFalse(main.exists(null,null));
    }

    @Test
    void whenInputWordIsLongerThanArraySpaces_thenFalse() {
        Assertions.assertFalse(main.isNotTooLong(new String[][]{{"A"},{"B"}}, "ABC"));
    }
    @Test
    void whenInputWordIsSameThanArraySpaces_thenTrue() {
        Assertions.assertTrue(main.isNotTooLong(new String[][]{{"A"},{"B"}}, "AB"));
    }
    @Test
    void whenInputWordIsShorterThanArraySpaces_thenTrue() {
    Assertions.assertTrue(main.isNotTooLong(new String[][]{{"A"},{"B"}}, "B"));
    }

    @Test
    void whenWordMatchesBoard_thenTrue() {
        Assertions.assertTrue(main.match(new String[][]{{"A"},{"B"}}, "B"));
    }

    @Test
    void whenWordDoesntMatchBoard_thenFalse() {
        Assertions.assertFalse(main.match(new String[][]{{"A"},{"B"}}, "C"));
    }

    @Test
    void whenWordExistInBoard_thenTrue() {
        Assertions.assertTrue(main.exists(new String[][]{{"A"},{"B"}}, "B"));
    }

    @Test
    void whenWordDoesntExistInBoard_thenFalse() {
        Assertions.assertFalse(main.exists(new String[][]{{"A"},{"B"}}, "C"));
    }

    @Test
    void whenLowerCaseLetterInWord_thenFalse() {
        Assertions.assertFalse(main.exists(new String[][]{{"A"},{"B"}}, "c"));
    }

    @Test
    void whenLowerCaseLetterInWord_thenTrue() {
        Assertions.assertEquals(main.wordToUpperCase(new String("sausage")),"SAUSAGE");
    }

    @Test
    void whenGameExists_ThenTrue(){
        Assertions.assertNotNull(main.game(new String[][]{{"A"},{"B"}}, "c"));
    }

    @Test
    void whenGameFinishesWithIncorrectParameters_ThenFalse(){
        Assertions.assertFalse(main.game(new String[][]{{"A"},{"B"}}, "c"));
    }

    @Test
    void whenGameFinishesWithCorrectParameters_ThenTrue(){
        Assertions.assertTrue(main.game(new String[][]{{"A"},{"B"}}, "A"));
    }

    @Test
    void whenUniversalMatcherNoStartPoint_ThenFalse(){
        Assertions.assertFalse(main.match(new String[][]{{"A"},{"B"}}, "Z"));
    }

    @Test
    void whenUniversalMatcherStartPoint_ThenTrue(){
        Assertions.assertTrue(main.match(new String[][]{{"A"},{"B"}}, "A"));
    }

    @Test
    void whenUniversalMatcherSecondLetter_ThenTrue(){
        Assertions.assertTrue(main.match(new String[][]{{"A"},{"B"}}, "AB"));
    }

}