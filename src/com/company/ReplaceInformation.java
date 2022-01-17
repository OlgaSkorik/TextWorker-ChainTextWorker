package com.company;

public class ReplaceInformation implements TextProcessable {
    String objToReplace;
    int indexToReplaceStart;
    int indexToReplaceEnd;

    public ReplaceInformation(String objToReplace, int indexToReplaceStart, int indexToReplaceEnd) {
        this.objToReplace = objToReplace;
        this.indexToReplaceStart = indexToReplaceStart;
        this.indexToReplaceEnd = indexToReplaceEnd;
    }

//    String replaceInf (StringBuilder input) {
//        input.replace(indexToReplaceStart,indexToReplaceEnd,objToReplace);
//        return input.toString();
//    }

    @Override
    public void processText(StringBuilder input) {
        input.replace(indexToReplaceStart,indexToReplaceEnd,objToReplace);
    }
}
