package SeleniumPractice.SeleniumPractice;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int number = 11;
        int count =0;
        
        for(int i=2;i<=number;i++) {
        	if(number%i==0) {
        		count++;
        	}
        }
        	if(count>0) {
        		System.out.println("Given number is prime");
        	}
        	else {
        		System.out.println("Given number is not prime");
        	}
	}

}
