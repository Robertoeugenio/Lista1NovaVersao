//autor Roberto Eugenio 
// Construa uma classe para representar um circulo que tem um raio
//adicione � classe Circulo os m�todos
//� M�todo que calcula e retorna a �rea do c�rculo 
//� M�todo que calcula e retorna a circunfer�ncia do c�rculo 
package Lista1Ex2;

public class Circulo {
	double raio;

	public double calculaArea() {
		return 2*3.14*raio*raio;
		// 3 adicionar os m�todos;
	}
	public double calculaPerimetro() {
		return 3.14*raio*2;
	}
}
