package aulas;

import java.util.Scanner;

public class Aula_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigo;
		
		System.out.println("digite uma opçao de 1 a 5:");
		codigo = sc.nextInt();
		
		switch (codigo) {
		case 1:
			System.out.println("cachorro quente");
			System.out.println("R$ 4.00");
			break;
		case 2:
			System.out.println("X-salada");
			System.out.println("R$ 4.50");
			break;
		case 3:
			System.out.println("X-Bacon");
			System.out.println("R$ 5.00");
			break;
		case 4:
			System.out.println("Torrada Simples");
			System.out.println("R$ 2.00");
			break;
		case 5:
			System.out.println("Refrigerante");
			System.out.println("R$ 1.50");
			break;
		default:
			System.out.println("Opção Invalida");
		}
	}	
}
// ORENATOBARBOSA
