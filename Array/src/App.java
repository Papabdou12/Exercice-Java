


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numbers = {8,6,3,4};
		
		System.out.println("avant tri");
		for(int i : numbers) {
			System.out.println(i);
		}
		
		for(int i =0;  i < numbers.length; i++) {
			for(int j =0;  j< numbers.length; j++) {
				if(numbers[i]> numbers[j]) {
					
					int tmp= numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=tmp;
					
					
				}
				
			}
			
			
			
		}
		System.out.println("apres tri");
		for(int i : numbers) {
			System.out.println(i);
		}
			
		
	}

}
