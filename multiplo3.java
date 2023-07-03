package Fundamentos;

public class multiplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total3 = 0, total5 = 0;
		
		for(int x = 1; x <= 20 ; x++) {
			if (x%3==0) {
				System.out.println(x);
				total3 += x;
			}
			if (x%5 == 0) {
				System.out.println(x);
				total5 += x;
			}
		}
		System.out.println("Soma total multiplo de 3: "+ total3);
		System.out.println("Soma total multiplo de 5: "+ total5);
	}

}
