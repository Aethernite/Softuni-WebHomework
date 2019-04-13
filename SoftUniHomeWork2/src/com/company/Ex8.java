package com.company;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

import static java.util.stream.Collectors.toMap;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, ArrayList<String>> map = new LinkedHashMap<String,ArrayList<String>>();

        while(true){
            String[] input = scanner.nextLine().split(" -> ");
            if(input[0].equals("End")){
                break;
            }
            if(!map.containsKey(input[0])){
                ArrayList<String> list = new ArrayList<String>();
                list.add(input[1]);
                map.put(input[0],list);
            }
            else if(map.containsKey(input[0])){
                ArrayList<String> list = map.get(input[0]);
                if(!list.contains(input[1])){
                    list.add(input[1]);
                    map.put(input[0], list);
                }
            }
        }

        LinkedHashMap<String,ArrayList<String>> sorted = map.entrySet().stream()
                .sorted((e1,e2) -> e1.getKey().compareTo(e2.getKey()))
                .collect(toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
                        LinkedHashMap::new));

        sorted.forEach((k,v) -> {
            System.out.println(k);
            for(String str: v){
                System.out.println("-- " + str);
            }
        });

    }
}
