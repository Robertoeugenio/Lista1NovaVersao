//autor Roberto Eugenio 
// Construa uma classe para representar um circulo que tem um raio
//adicione á classe Circulo os métodos
//• Método que calcula e retorna a área do círculo 
//• Método que calcula e retorna a circunferência do círculo 
package Lista1Ex2;

public class Circulo {
	double raio;

	public double calculaArea() {
		return 2*3.14*raio*raio;
		// 3 adicionar os métodos;
	}
	public double calculaPerimetro() {
		return 3.14*raio*2;
	}
}
