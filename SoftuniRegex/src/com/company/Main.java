package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        Pattern p = Pattern.compile("^([\\w-_]{3,16})$");
        Matcher m;

        for(int i=0; i<input.length; i++){
           m = p.matcher(input[i]);
           if(m.find()){
               System.out.println(m.group());
           }
        }
    }
}
