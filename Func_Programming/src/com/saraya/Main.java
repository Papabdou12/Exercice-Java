package com.saraya;

import java.util.List;
import java.util.stream.Collectors;

import javax.print.attribute.IntegerSyntax;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Functionnal Programming
		List<Integer> number = List.of(1,2,5,6,36,45,8,46,25);
//				number.stream().filter(e -> e%5==0).forEach(System.out::println);
//				//nombres premiers
//				number.stream().filter(a -> {
//					int cpt = 2;
//					for(int i= 2;i< a;i++) {
//						if(a%i==0) {
//							cpt++;
//							break;
//						}
//					}
//					return cpt++;
//					}).forEach(System.out::println);
		//Somme des nombres
//		number.stream().filter(a -> {
//			int som = 0;
//			for(int i= 0;i< a;i++) {
//				if(a%i==0) {
//					som+=i;
//					break;
//				}
//			}
//			return som;
//			}).forEach(System.out::println);
		
//		MyInterface my = () ->{};
//		printHello( name->{
//			System.out.println("Hello"+name);
//		});
		
		//methode somme
//		int somme  = number.stream().reduce(0,(n1,n2) -> n1+ n2);
//		System.out.println(somme);
		//methode  max et min
//		int min = number.stream().min((n1,n2)-> Integer.compare(n1,n2)).get();
//		System.out.println(min);
//		int max = number.stream().max((n1,n2)-> Integer.compare(n1,n2)).get();
//		System.out.println(max);
//		number.stream().map(e -> e*2).forEach(System.out::println);
//		printHello( name->
//			"Hello "+ name);
			
		//method short & method distinct & method collect
		
		//
		
		List<Integer> evens= number.stream().filter(e -> e%2 ==0).distinct().sorted().collect(Collectors.toList());
		for(Integer i: evens) {
			System.out.println(i);
		}
		//
		
		
	}
	
	public static void printHello(MyInterface myinterface) {
		System.out.println(myinterface.sayHello("Ali"));
	}
}
