package com.company;

public class ChainTextWorker implements TextProcessable {
    TextProcessable[] processes;

    public ChainTextWorker(TextProcessable[] processes) {
        this.processes = processes;
    }

    static String processText(String text) {
        StringBuilder input = new StringBuilder(text);

        return input.toString();
    }
}
