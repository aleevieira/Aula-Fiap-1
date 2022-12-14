/**
 * Classe responsável para verificar se um número é par ou ímpar
 * /**
* Este é o metódo inicial do programa ParOuImpar. Aqui também estamos
 * verificando a divisibilidade de outros números Nesta aula o professer
 * apresentou o MOD. Ou seja, o operador percent, com ele dá pra saber o resto
 * de uma divisão é o suficiente para sabermos se um número é para ou ímpar e
 * também para saber a divisibilidade dos números
 * 
 * @param args
 * 
 * @author Alexandra
 *
 */
public class ParOuImpar {
	final static int NUMERO_PARA_TESTE = 1500; // Numero fixo, nao pode alterar, é constante


	public static void main(String[] args) {

		System.out.println(NUMERO_PARA_TESTE + 1);

		if (NUMERO_PARA_TESTE % 2 == 0) { // O percent dá o resto da divisão
			System.out.println("PAR");

		} else {
			System.out.println("IMPAR");
		}

		if (NUMERO_PARA_TESTE % 3 == 0) {
			System.out.println(" Divisivel  por 3");
		} else {
			System.out.println("Não é divisivel por 3");
		}

		if (NUMERO_PARA_TESTE % 5 == 0) {
			System.out.println(" Divisivel  por 5");
		} else {
			System.out.println("Não é divisivel por 5");
		}

	}

}
