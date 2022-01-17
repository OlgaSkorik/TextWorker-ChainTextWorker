package com.company;

public class ReverseInformation implements TextProcessable {

    public ReverseInformation() {
    }
//    String reverseInf (StringBuilder input) {
//        input.reverse();
//        return input.toString();
//    }

    @Override
    public void processText(StringBuilder input) {
        input.reverse();
    }
}
