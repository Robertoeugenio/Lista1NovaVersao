// autor Roberto Eugenio 
// 4. Escreva um programa Java para ler uma palavra e exibi-la em caracteres mai�sculos.  

package Lista1Ex4;

import java.util.Scanner;

public class Min�sculoParaMai�sculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite qualquer palavra min�scula = ");
		String palavra = sc.next();
		palavra = palavra.toUpperCase();
		System.out.println("Transformada para mai�scula = " + palavra);
		
		
	}
	
	
}