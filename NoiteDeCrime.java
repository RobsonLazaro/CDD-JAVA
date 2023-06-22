package Fundamentos;
import java.util.Scanner;
public class NoiteDeCrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		int contador = 0 ;
		System.out.println("Você está sendo interrogado, responda com sinceridade!");
		
		System.out.println("Telefonou para a vitima? ");
		char p1 = ler.next().charAt(0);
		if (p1 == 's' || p1 == 'S') {
			contador++;
		}
		
		System.out.println("Esteve no local do crime? ");
		char p2 = ler.next().charAt(0);
		if (p2 == 's'|| p2 == 'S'){
			contador++;
		}
		
		System.out.println("Mora perto da vitima? ");
		
		char p3 = ler.next().charAt(0);
		if (p3 == 's' || p3 == 'S') {
			contador++;
		}
		
		System.out.println("Devia para a vitima? ");
		char p4 = ler.next().charAt(0);
		if (p4 == 's' || p4 == 'S') {
			contador++;
		}
		
		System.out.println("Já trabalhou com a vitima? ");
		char p5 = ler.next().charAt(0);
		if (p5 == 's' || p5 == 'S') {
			contador++;
		}
		
		if (contador == 5 ) {
			System.out.println("Assassino!");
		}
		else if (contador >=3) {
			System.out.println("Cumplice!");
		}
		else if (contador > 1) {
			System.out.println("Suspeito!");
		}
		else {
			System.out.println("Inocente!");
		}
		
		ler.close();
	}

}
