package com.saraya;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//count the letter
//		String str1 = "Moudou is fasting, Modou is sleeping in class";
//			
//		Map <String ,Integer> map = new HashMap<>();
//		for(String d,str1) {
//			Integer count = map.get(d);
//			if(count == null) {
//				map.put(d,1);
//			}else {
//				map.put(d, count+1);
//			}
//		}
//		
//		System.out.println(map);
		
		//count the  word
		String str = "Moudou is sleeping in class,Modou is fasting";
		String [] strT = str.split(" ");
		Map <String, Integer> m = new HashMap<>();
		for(String s : strT) {
			if(m.get(s)==null) {
				m.put(s,1);
			}else {
				m.put(s, m.get(s)+1);
			}
		}
			System.out.println(m);
	}

}
