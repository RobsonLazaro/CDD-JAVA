package Fundamentos;
import java.util.Scanner;
public class mediaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nota1, nota2;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1 = ler.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = ler.nextFloat();
		
		float media = (nota1+nota2)/ 2;
		
		System.out.println("Média do aluno foi: " + media);
		
		ler.close();
		
	}

}
