package com.chatong;

public class ParseString {
    public Long change(String input) {
        double sum = 0;
        int conunter = 0;
        if (input.charAt(0) == '-') conunter = conunter + 1;

        for (int i = conunter; i < input.length(); i++) {
            char character = input.charAt(i);
            int value = input.length() - i - 1;

            try {
                Integer digit = character - '0';
                sum = sum + (digit * Math.pow(10, value));

                if (digit > 9 || 0 > digit) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println(character + "-!");
                System.out.println("알수없는 문자열!!");

                return null;
            }
        }
        if (conunter == 1) sum = sum * -1;
        return (long) sum;
    }
}