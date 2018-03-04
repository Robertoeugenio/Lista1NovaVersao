// autor Roberto Eugenio 
// 4. Escreva um programa Java para ler uma palavra e exibi-la em caracteres maiúsculos.  

package Lista1Ex4;

import java.util.Scanner;

public class MinúsculoParaMaiúsculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite qualquer palavra minúscula = ");
		String palavra = sc.next();
		palavra = palavra.toUpperCase();
		System.out.println("Transformada para maiúscula = " + palavra);
		
		
	}
	
	
}