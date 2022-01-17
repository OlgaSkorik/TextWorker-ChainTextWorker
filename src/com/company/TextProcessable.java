package com.company;

public interface TextProcessable {

    default void processText(StringBuilder input) {
    }
}
