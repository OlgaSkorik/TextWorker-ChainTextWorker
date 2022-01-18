package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(TextWorker.isPalindrome("   moffom "));
        System.out.println(TextWorker.getSequance("getSequance",'t','n'));
        System.out.println(TextWorker.createSequance(2,10));
        String[] toInsert = {"first","9"};
        int[] indexes = {2,4};
        System.out.println(TextWorker.insertAll("initial string",toInsert,indexes));
        Arrays.sort(indexes);
        System.out.println(TextWorker.insertAllChange("initial string",toInsert,indexes));
        System.out.println(Arrays.toString(TextWorker.findAllMails("Some text rty@gmail.com and one more phj@company.com mail")));
        System.out.println(TextWorker.indexOutput("texttttat", 't'));
        ChainTextWorker worker = new ChainTextWorker(new TextProcessable[] {new ReverseInformation(),new AppendInformation("d")});
        System.out.println(worker.processText("Text"));
    }
}
