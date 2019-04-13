package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] input = scanner.nextLine().toCharArray();
        ArrayList<Character> list = new ArrayList<Character>();
        for(char ch: input){
            list.add(ch);
        }

        int str = 0;
        for(int i = 0; i<list.size(); i++){
            char ch = list.get(i);
            if(str>0){
                if(!(ch == '>')){
                    list.set(i, '@');
                    str--;
                }
            }
            if(Character.isAlphabetic(ch)){
                continue;
            }
            else if(ch == '>'){
                str = str + (list.get(i+1) - 48) - 1;
                list.set((i++)+1, '@');
            }
            }

        for(char ch: list){
            if(ch=='@'){
                continue;
            }
            System.out.print(ch);
        }





    }
}
