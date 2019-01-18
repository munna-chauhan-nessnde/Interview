package com.vm.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveWordFromSentence {

    public static void main(String[] args) {
        String s = "I am a java programmer in Infosys india limited";
        String t = "a Infosys limited";
        /*Approach: 1*/
        System.out.println("Approach: 1");
        for (String word : wordMissing(s, t)) {
            System.out.println(word);
        }
        /*Approach: 2*/
        List<String> sList = new ArrayList<>(Arrays.asList(s.split("\\ ")));
        List<String> tList = new ArrayList<>(Arrays.asList(t.split("\\ ")));
        sList.removeAll(tList);
        System.out.println("Approach: 2");
        sList.forEach(System.out::println);
    }

    private static String[] wordMissing(String s, String t) {
        /*
        List implementation returned by Arrays.asList(),
        which returns a fixed-length collection,
        therefore a removeAll is unsupported.
         */
        for (String word : t.split("\\s")) {
            /* \\b is boundary and \\s is single space*/
            String regex = "\\b" + word.trim() + "\\b\\s*";
            s = s.replaceAll(regex, "");
        }

        return s.split(" ");
    }
}

/*
  OutPut:
  I
  am
  java
  programmer
  in
  india
* */