package Fundamentos;
import java.util.Scanner;
public class FemininoMasculino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		
		String letra_digitada = ler.nextLine();
		if (letra_digitada == "F" || letra_digitada == "f") {
			System.out.println("Feminino");
		}
		else if (letra_digitada == "M" || letra_digitada == "m") {
			System.out.println("Masculino");
		}
		else {
			System.out.println("Comando incorreto!");
		}
		ler.close();
	}

}
