package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern p = Pattern.compile("^(>>)([A-Za-z]+)(<<)(\\d+(\\.\\d+)?)!(\\d+)$");
        ArrayList<String> list = new ArrayList<String>();
        double total = 0;
        while(true){
            String input = scanner.nextLine();
            if(input.equals("Purchase")){
                break;
            }
            Matcher m = p.matcher(input);
            if(m.matches()) {
                String item = m.group(2);
                int quan = Integer.parseInt(m.group(6));
                double price = Double.parseDouble(m.group(4));
                list.add(item);
                total += price * quan;
            }
        }

        System.out.println("Bought furniture:");
        for(String str: list){
            System.out.println(str);
        }
        System.out.println(String.format("Total money spend: %.2f", total));
    }
}
