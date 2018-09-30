package com.vm.program;

import java.util.ArrayList;
import java.util.List;

public class CheckBalancedParentheses {

    public static void main(String[] args) {

        Boolean flag = true;
        String str = "{[(])}";
        char[] characters = str.toCharArray();
        List<Character> characterList = new ArrayList<>();
        for (char chr : characters) {
            if (chr == '{' || chr == '}' || chr == '(' || chr == ')' || chr == '[' || chr == ']')
                characterList.add(chr);
        }
        System.out.println(characterList);
        //System.out.println(characterList.size());
        if (characterList.size() % 2 == 0) {
            int size = characterList.size();
            for (char chr : characterList) {
                --size;
                System.out.println(chr + "===" + characterList.get(size));
                System.out.println(chr == characterList.get(size).toString().charAt(0));
  /*              if((chr!=characterList.get(size))){
                    System.out.println(chr+"==="+characterList.get(size));
                    flag = false;
                    //break;
                }*/
            }
            if (flag)
                System.out.println("YES");
            else
                System.out.println("No");
        } else {
            System.out.println("No");
        }
        //Collections.sort(characterList);
        //System.out.println(characterList);
    }
}
