package com.company;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class MinersTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
        String resource = null;
        int i=1;
        while(true){
            String input = sc.nextLine();
            if(input.equals("stop")){
                break;
            }
            if(i%2==0){
                int quantity = Integer.parseInt(input);
                map.put(resource,map.get(resource) + quantity);
            }
            else{
                resource = input;
                if(!(map.containsKey(resource))) {
                    map.put(resource, 0);
                }
            }
            i++;
        }

        map.forEach((k,v) -> System.out.println(k + " -> " + v));
    }
}
