package com.company;

public class ReverseInformation implements TextProcessable {

    public ReverseInformation() {
    }

    @Override
    public void processText(StringBuilder input) {
        input.reverse();
    }
}
