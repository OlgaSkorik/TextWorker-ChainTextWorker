package com.company;

import java.util.Arrays;

public class ChainTextWorker implements TextProcessable {
    TextProcessable[] processes;

    public ChainTextWorker(TextProcessable[] processes) {
        this.processes = processes;
    }

    String processText(String text) {
        StringBuilder input = new StringBuilder(text);
        return input.toString();
    }
}
