package Fundamentos;
import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite um numero:");
		num1 = ler.nextInt();
		
		System.out.println("Digite um numero:");
		num2 = ler.nextInt();
		
		System.out.println("Digite um numero:");
		num3 = ler.nextInt();
		
		
		if (num1> num2 && num1 >num3) {
			System.out.println("O maior numero é: "+ num1);
		}
		else if (num2>num3) {
			System.out.println("O maior numero é: " + num2);
		}
		else {
			System.out.println("O maior numero é: " + num3);
		}
		ler.close();
	}

}
