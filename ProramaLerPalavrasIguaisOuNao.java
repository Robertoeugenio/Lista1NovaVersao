package Lista1Ex5;

import java.util.Scanner;

public class ProramaLerPalavrasIguaisOuNao {

	public static void main(String[] args) {
		Scanner  sc = new Scanner (System.in);
		
		System.out.println("digite a primeira palavra = ");
		String palavra1 = sc.next();
		System.out.print("digite a segunda palavra = ");
		String palavra2 = sc.next();
		
		if(palavra1.equals(palavra2)) {
			System.out.println("iguais");
		}else {
			System.out.println("diferente");
		}
		
	}

}
