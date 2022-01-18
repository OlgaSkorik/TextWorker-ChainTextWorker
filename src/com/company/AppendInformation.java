package com.company;

public class AppendInformation implements TextProcessable {
    String insertAtTheEnd;

    public AppendInformation(String insertAtTheEnd) {
        this.insertAtTheEnd = insertAtTheEnd;
    }

    @Override
    public void processText(StringBuilder input) {
        input.append(insertAtTheEnd);
    }
}
