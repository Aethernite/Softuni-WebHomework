package com.company;

import java.security.KeyStore;
import java.util.*;
import java.util.stream.Collectors;

public class Ex3LegendaryItem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, Integer> keyMap = new LinkedHashMap<String, Integer>();
        LinkedHashMap<String, Integer> junkMap = new LinkedHashMap<String, Integer>();
        keyMap.put("motes", 0);
        keyMap.put("shards", 0);
        keyMap.put("fragments", 0);
        boolean hasToBreak = false;

         while(!hasToBreak) {
            String[] input = sc.nextLine().split("\\s+");
            for (int i = 0; i < input.length; i+=2) {
                String item = input[i+1].toLowerCase();
                int quantity = Integer.parseInt(input[i]);
                if (keyMap.containsKey(item)) {
                    keyMap.put(item, keyMap.get(item) + quantity);
                } else if (!junkMap.containsKey(item)) {
                    junkMap.put(item, quantity);
                } else if(junkMap.containsKey(item)){
                    junkMap.put(item, junkMap.get(item) + quantity);
                }

                if (keyMap.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    keyMap.put("shards", keyMap.get("shards") - 250);
                    hasToBreak = true;
                    break;
                } else if (keyMap.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    keyMap.put("fragments", keyMap.get("fragments") - 250);
                    hasToBreak = true;
                    break;
                } else if (keyMap.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    keyMap.put("motes", keyMap.get("motes") - 250);
                    hasToBreak = true;
                    break;
                }
            }

        }
        keyMap.entrySet().stream()
                .sorted((e1,e2) ->{
                    int res = e2.getValue().compareTo(e1.getValue());
                    if(res == 0)
                        res = e1.getKey().compareTo(e2.getKey());
                        return res;})
                .forEach(e -> System.out.println(e.getKey().toLowerCase() + ": " + e.getValue()));

        junkMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByKey())
                .forEach(e -> System.out.println(e.getKey().toLowerCase() + ": " + e.getValue()));
    }

}






