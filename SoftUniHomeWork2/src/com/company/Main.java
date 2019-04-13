package com.company;

		import java.util.*;
		import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();

		for(int i=0;i<text.length();i++){
			char in = text.charAt(i);
			if(in == ' '){
				continue;
			}
			if(!(map.containsKey(in))){
				map.put(in,1);
			}
			else{
				map.put(in,map.get(in) + 1);
			}
		}
		map.forEach((k,v) -> System.out.println(k + " -> " + v));
	}
}
