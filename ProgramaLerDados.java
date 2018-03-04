//Autor Roberto Eugenio 
//1. Programa para lerDados das classes, Pessoa, Endereço e casa
package Lista1Ex1;

import java.util.Scanner;

public class ProgramaLerDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Casa casa = new Casa();
		System.out.printf("Por favor digite o nome do proprietário da casa:");
		casa.proprietario.nome = sc.nextLine();
		System.out.printf("Por favor digite o endereço; ");
		casa.endereco.endereco = sc.nextLine();
		System.out.printf("Por favor digite numero;");
		casa.endereco.numero = sc.nextLine();
		System.out.printf("Por favor digite a cidade; ");
		casa.endereco.cidade = sc.nextLine();
		System.out.printf("Por favor digite a estado; ");
		casa.endereco.estado = sc.nextLine();
		System.out.printf("Por favor digite o CEP;");
		casa.endereco.cep = sc.next();
		System.out.println("\n");
		System.out.println("Nome " + casa.proprietario.nome);
		System.out.println("Endereço " + casa.endereco.endereco);
		System.out.println("Numero " + casa.endereco.numero);
		System.out.println("Cidade " + casa.endereco.cidade);
		System.out.println("Estado " + casa.endereco.estado);
		System.out.println("Cep " + casa.endereco.cep);

	}

}
