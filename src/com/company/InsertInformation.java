package com.company;

import com.company.ChainTextWorker;

public class InsertInformation implements TextProcessable {
    int index;
    String str;

    public InsertInformation(int index, String str) {
        this.index = index;
        this.str = str;
    }
//    String insertInf (StringBuilder input) {
//        input.insert(index,str);
//        return input.toString();
//    }

    @Override
    public void processText(StringBuilder input) {
        input.insert(index,str);
    }
}
