package com.chatong;

import java.util.Stack;

public class FindWrongBracket {
    public int find(String input) {
        int index = -1;
        Stack<Character> chars = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char branket = input.charAt(i);

            if (branket == '('||branket == '{'||branket == '['  ) {
                chars.push(branket);
            }

            if (branket=='}'){
                char pop = 0;
                try {
                    pop = chars.pop();
                } catch (Exception e) {
                    return i;
                }

                if (pop != '{') {
                    return i;
                }

            }
            if (branket==')'){
                char pop = 0;
                try {
                    pop = chars.pop();
                } catch (Exception e) {
                    return i;
                }

                if (pop != '(') {
                    return i;
                }

            }
            if (branket==']'){
                char pop = 0;
                try {
                    pop = chars.pop();
                } catch (Exception e) {
                    return i;
                }

                if (pop != '[') {
                    return i;
                }

            }
        }
        return index;
    }
}
