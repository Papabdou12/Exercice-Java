package Com.Saraya;

public class Exojava {

	//Exercice 1
	void ChekPasssFail(int mark) {
		
		if (mark >= 50)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		System.out.println("Done");
	}
	
	//Exercice 2
	
	void Product1toN(int N) {
		
		int fact = 1;
		for(int i= 2; i<=N; i++) {
			fact= fact * i;
			System.out.println("The Factoraial of "+ N + " is:"+fact);
		}
	}
	
	//Exercie 3
	void Swap2Integers(int a, int b) {
		
		int temp;
		   a = 15;
		   b = 27;
		   System.out.println("Before swapping : a, b = "+a+", "+ + b);
		   temp = a;
		   a = b;
		   b = temp;   
		  System.out.println("After swapping : a, b = "+a+", "+ + b);
		 }
	//Exercice 4
	void sumDigits(int n) {
		int result = 0;
		
		while(n > 0) {
			result += n % 10;
			n /= 10;
			 
		}
		System.out.println("The Sumdigit is:"+result);
	}
	
	//Exercice 5
	/*void leapyear(int year) {
		
		if(year % 4 == 0  && year % 100 == 0 && ( year % 400 == 0 &&  year % 100 != 0))
			System.out.println(year + " is a leap year");
		else
			System.out.println(year + " is not a leap year");
	}**/
	
	void leapyear(int year) {
		

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z))
        {
            System.out.println(year + " is a leap year");
        }
        else
        {
            System.out.println(year + " is not a leap year");
        }
	}
	
	//exo6
	double area;
	void circlearea(double r) {
		
		 area = (r * r *22)/7;
		 System.out.println("Area of Circle is: " + area);
	}
	
	
	int Anglestri(int angle1, int angle2) {
		
	int angle3 = 180 - (angle1 +angle2);
	System.out.println(""+ angle3);
	return angle3;
	
	}
}
	
	
	
	
	
	
	


