package com.company;

import java.util.*;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.toMap;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, ArrayList<String>> map = new LinkedHashMap<String,ArrayList<String>>();
        while(true){
            String[] input = scanner.nextLine().split(" : ");
            if(input[0].equals("end")){
                break;
            }
            if(!map.containsKey(input[0])){
                ArrayList<String> list = new ArrayList<String>();
                list.add(input[1]);
                map.put(input[0],list);
            }
            else if(map.containsKey(input[0])){
                ArrayList<String> list = map.get(input[0]);
                list.add(input[1]);
                map.put(input[0], list);
            }
        }
        map.forEach((k,v) -> {
                    Collections.sort(v);
                    map.put(k, v);
                });

        Map<String, ArrayList<String>> sorted = map
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(comparingInt(e->e.getValue().size())))
                .collect(
                        toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
                                LinkedHashMap::new));

        sorted.forEach((k,v) -> {
            System.out.println(k + ":" + " " + v.size());
            for(String str: v){
                System.out.println("-- " + str);
            }
        }
        );

    }
}
