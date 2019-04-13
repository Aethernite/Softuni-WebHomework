package com.company;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String,String> map = new LinkedHashMap<String, String>();


        int n = Integer.parseInt(scanner.nextLine());

        for(int i=0; i<n; i++){
            String[] command = scanner.nextLine().split("\\s+");

            switch(command[0]){
                case "register":
                    if(map.containsKey(command[1])){
                        System.out.println("ERROR: already registered with plate number " + map.get(command[1]));
                    }
                    else{
                        map.put(command[1], command[2]);
                        System.out.println(command[1] +" registered " + command[2] + " successfully");
                    }
                    break;
                case "unregister":
                    if(map.containsKey(command[1])){
                        map.remove(command[1]);
                        System.out.println(command[1] + " unregistered successfully");
                    }
                    else{
                        System.out.println("ERROR: user " + command[1]+ " not found");
                    }
                    break;
            }


        }

        map.forEach((k,v) -> System.out.println(k + " => " + v));
    }
}
