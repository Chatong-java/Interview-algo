package com.chatong;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class AlgoTest {
    private ParseString parseString;
    private FindWrongBracket findWrongBracket;

    @Before
    public void setup(){
        parseString = new ParseString();
        findWrongBracket = new FindWrongBracket();
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


        assertThat(parseString.change(input), is(expected));
        assertThat(parseString.change(input2), is(expected2));
    }

    @Test
    public void 잘못된_괄호_찾기(){
        String input  = "{())}";
        String input2  = "({({{}{}{}}{}{}})})";
        int expectedIndex = 3;
        int expectedIndex2 = 15;

        assertThat(findWrongBracket.find(input), is(expectedIndex));
        assertThat(findWrongBracket.find(input2), is(expectedIndex2));
    }

}
