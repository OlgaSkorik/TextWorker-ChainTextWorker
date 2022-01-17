package com.company;

public class DeleteInformation implements TextProcessable {
    int indexStart;
    int indexEnd;

    public DeleteInformation(int indexStart, int indexEnd) {
        this.indexStart = indexStart;
        this.indexEnd = indexEnd;
    }
//    String deleteInf (StringBuilder input) {
//        input.delete(indexStart,indexEnd);
//        return input.toString();
//    }

    @Override
    public void processText(StringBuilder input) {
        input.delete(indexStart,indexEnd);
    }
}
