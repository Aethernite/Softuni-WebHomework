package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String big = scanner.nextLine();
        int num = Integer.parseInt(scanner.nextLine());
        Stack<Integer> number = new Stack<Integer>();
        int start = big.length()-1;
        int end = 0;
        int next = 0;
        int digit;
        boolean minus = false;
        if(big.charAt(0)== '-' && num<0){
            if(big.charAt(0)== '-'){
                end = 1;
            }
        }
        else if(big.charAt(0) == '-' || num<0){
                minus=true;
                if(big.charAt(0) == '-'){
                    end = 1;
                }
            }

        if(num == 0){
            System.out.print("0");
            return;
        }
        num = Math.abs(num);
        for(int i = start; i>=end; i--){
            int cur = big.charAt(i)-48;
            int result = 0;

            result = cur * num + next;
            digit = result%10;
            next = result/10;
            number.push(digit);
        }
        if(next>0){
            number.push(next);
        }

        if(minus){
            System.out.print("-");
        }
       while(true){
           try {
               System.out.print(number.pop());
           } catch(Exception e){
               break;
           }
       }
    }
}
