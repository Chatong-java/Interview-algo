package com.chatong;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class AlgoTest {
    private ParseString parseString;

    @Before
    public void setup(){
        parseString = new ParseString();
    }

    @Test
    public void String을_입력하면_정수형_리턴(){
        String input = "1234567890";
        String input2 = "-1237890";
        Long expected = 1234567890l;
        Long expected2 = -1237890l;

        String wrong = "123gg3434";
        String wrong2 = "1!2@3gg3434";
//        long result = parseString.change(wrong2);


        assertThat(expected, is(parseString.change(input)));
        assertThat(expected2, is(parseString.change(input2)));
    }

}
