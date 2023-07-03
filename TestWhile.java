package Fundamentos;
import java.util.Scanner;
public class TestWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		System.out.println("Quantos alunos tem na sala?");
		int alunos = ler.nextInt();
		int contador =  1;
		double total = 0;
		while ( contador <= alunos) {
			System.out.println("Qual a "+ contador +"º nota");
			double nota = ler.nextDouble();
			total += nota; 
			contador ++;
		}
		double media = total/ alunos;
		
		System.out.println("Média da sala: " + media);
		ler.close();
	}

}
