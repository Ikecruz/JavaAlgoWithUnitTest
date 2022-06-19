package com.algo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SwitchCharTest {

    @Test
    public void repeatedCharactersInActualCharShouldReturnRepeatedValue() {
        Assertions.assertEquals("Repeated value", SwitchChar.switchChar("cade", "abacde", "aaaaaa"));
        Assertions.assertEquals("Repeated value", SwitchChar.switchChar("job", "abcdff", "ertyfg"));
    }

    @Test
    public void actualCharAndChangeCharOfDifferentLengthShouldReturnLengthMismatch() {
        Assertions.assertEquals("Length mismatch", SwitchChar.switchChar("cade", "abcdef", "abcd"));
        Assertions.assertEquals("Length mismatch", SwitchChar.switchChar("cade", "abcdef", "abcdedgh"));
    }

    @Test
    public void shouldReturnNegativeValueWhenInputCharLengthIsLongerThanActualCharLength() {
        Assertions.assertEquals("-1", SwitchChar.switchChar("cadet", "abc", "dfr"));
    }

    @Test
    public void shouldReturnNegativeValueWhenTheCharactersInInputCharAreNotContainedInActualChar() {
        Assertions.assertEquals("-1", SwitchChar.switchChar("cade", "jbcdef", "stryuf"));
    }

    @Test
    public void shouldReturnValidString() {
        Assertions.assertEquals("rmacgle", SwitchChar.switchChar("decagon", "lmnbvcxzasdfghjktyrueiwoqp", "zdewsaqxcfrtgvbhyujnmkilop"));
        Assertions.assertEquals("mr", SwitchChar.switchChar("we","wkeap", "mgren"));

        // Extra Tests 😉
    }
}
