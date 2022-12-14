

/**
 * programa pra saber velocidade da via e velocidade do carro para atribuição de multa
 * @author Alexandra
 *
 */

import java.util.Scanner;

public class Exercicio_1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe a velocidade do seu carro: ");
		int velocidadeDoCarro = scanner.nextInt();
		
		System.out.println("Informe a velocidade máxima da via :");
		int velocidadeDaVia = scanner.nextInt();
		
		double multa = 0;
		int velocidade = velocidadeDoCarro - velocidadeDaVia;
		
		if (velocidade >31) { //velocidade 32km/h acima do estabelecido
			multa=300;
			System.out.println(multa); 
			
		} else if (velocidade >=11) { // velocidade acima do estabelecido entre 11 a 30
			multa= 100;
			System.out.println(multa);
			
		} else if (velocidade > 0) { // velocidade 10km acima do estabelecido
			multa= 50;
			System.out.println(multa);
			
		} else {
			System.out.println(" Sem multas ");
		}
		
		
	
	// segunda forma, mas foi mais complexo.
		
		if (velocidadeDoCarro > velocidadeDaVia + 10 && velocidadeDoCarro < velocidadeDaVia +11) {
			System.out.println(" O valor da multa é R$50,00");
			
		} else if (velocidadeDoCarro > velocidadeDaVia + 10 && velocidadeDoCarro < velocidadeDaVia + 30 ){ // 100 > 60
			System.out.println(" O valor da multa é de R$100,00");
			
		} else if (velocidadeDoCarro > velocidadeDaVia + 30 ) { // 100 > 110
		System.out.println("O valor da multa é de R$300,00");
		
		} else {
			System.out.println("Tudo certo!");
		}
		
		
		scanner.close();
		
		
		
	}

}





