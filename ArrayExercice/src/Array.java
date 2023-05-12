

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Exercice1
		
		int [] number = {5,8,6,15,2};
		int som = 0;
		for(int i= 0; i< number.length; i++) {
			som += number[i];
			
		}
		float Avg = (float) som / number.length;
		//System.out.println("THe Average is :" + Avg);
		
		
		//Exercie 2
		int  [] num  = {15,45,89,4};
	
		for(int i = 0; i < num.length; i++) {
			num[i] *= num[i];
			//System.out.println(num[i]);
		}
		
		//Exercie 3
		
		int prime [] = {4,6,15,6,8,42};
		int reste= 0;
		
		for (int i = 2; i < prime.length; i++) {
			if (prime[i]% i  == 0) {
				//System.out.println("The array is not prime"+prime[i]);
			}else {
				//System.out.println("The array is prime"+prime[i]);
			}
			
		}
		
			//Exercice 4
		
		int [] numbers = {5,47,89,75,23};
		int s=5;
		boolean bool = false;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i]== s) {
				bool= true;
				//System.out.println(numbers[i]+" is a value Specific  "+s);
			}
			else {
				bool = false;
				//System.out.println(numbers[i]+" is not a value Specific "+s);
			}
		
	}
		
		//Exercice 5
		int [] tabIndex = {7,22,-9,45,23};
		int j= -1;
		int position = 3;
		
		for (int i = 0; i < tabIndex.length; i++) {
			if(tabIndex[i] == position)
			j = i;
			
			i++;
			System.out.println(i+ "est l'index de "+j);
		}
		
		//Exercice 6
		
		int []tab = {8,778,4564,123,45};
		
		for (int i : tab) {
			
		
		}
		System.out.println(tab);
		
		
		
		
	}	
}
