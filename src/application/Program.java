package application;

import java.util.Locale;
import java.util.Scanner;
import entities.DadosEstudantes;

public class Program {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DadosEstudantes[] vect = new DadosEstudantes[10];
		
		System.out.println("Quantos quartos serão alugados: ");
		int quartosAlugados = sc.nextInt();
		
		for (int i=1; i <= quartosAlugados; i++) {
			System.out.println();
			System.out.println("Aluguel #" + i + ": ");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			
			vect[quarto] = new DadosEstudantes (nome, email);
		}
		
		System.out.println();
		System.out.println("Quartos Alugados: ");
		for (int i = 0; i < 10; i++) {
			if(vect[i] != null)
			System.out.println(i + ": " + vect[i]);
		}
		
		
		sc.close();
	}

}
