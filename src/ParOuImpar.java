/**
 * Classe respons�vel para verificar se um n�mero � par ou �mpar
 * /**
* Este � o met�do inicial do programa ParOuImpar. Aqui tamb�m estamos
 * verificando a divisibilidade de outros n�meros Nesta aula o professer
 * apresentou o MOD. Ou seja, o operador percent, com ele d� pra saber o resto
 * de uma divis�o � o suficiente para sabermos se um n�mero � para ou �mpar e
 * tamb�m para saber a divisibilidade dos n�meros
 * 
 * @param args
 * 
 * @author Alexandra
 *
 */
public class ParOuImpar {
	final static int NUMERO_PARA_TESTE = 1500; // Numero fixo, nao pode alterar, � constante


	public static void main(String[] args) {

		System.out.println(NUMERO_PARA_TESTE + 1);

		if (NUMERO_PARA_TESTE % 2 == 0) { // O percent d� o resto da divis�o
			System.out.println("PAR");

		} else {
			System.out.println("IMPAR");
		}

		if (NUMERO_PARA_TESTE % 3 == 0) {
			System.out.println(" Divisivel  por 3");
		} else {
			System.out.println("N�o � divisivel por 3");
		}

		if (NUMERO_PARA_TESTE % 5 == 0) {
			System.out.println(" Divisivel  por 5");
		} else {
			System.out.println("N�o � divisivel por 5");
		}

	}

}
