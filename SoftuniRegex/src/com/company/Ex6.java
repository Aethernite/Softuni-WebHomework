package com.company;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int state = 0;
        System.out.print(input.charAt(0));
        for(int i=1; i<input.length(); i++){
            char cur = input.charAt(i);
            if(cur == input.charAt(i-1)){
                continue;
            }
                System.out.print(cur);

        }
    }
}
