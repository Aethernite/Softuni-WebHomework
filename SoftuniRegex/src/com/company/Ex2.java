package com.company;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        System.out.println(sum(input[0], input[1]));
    }


    public static int sum(String str1, String str2){
        int sum = 0;
        int min = Math.min(str1.length(), str2.length());
        for(int i=0; i<min; i++){
            sum+= (int)str1.charAt(i)* (int)str2.charAt(i);
        }
        int max = Math.max(str1.length(), str2.length());
        String temp;
        if(str2.length()>str1.length()){
            for(int i = min; i<max; i++){
                sum+= (int)str2.charAt(i);
            }
        }
        else if(str2.length()<str1.length()){
            for(int i = min; i<max; i++){
                sum+= (int)str1.charAt(i);
            }
        }
        return sum;

    }
}
