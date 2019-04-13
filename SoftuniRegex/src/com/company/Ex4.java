package com.company;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<input.length();i++){
            sb.append((char)((int)input.charAt(i)-3));
        }
        System.out.println(sb.toString());
    }
}
