import java.util.Scanner;

public class Conversao {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Informe seu nome:");
		 String nome = scanner.nextLine(); // quando � texto usamos o nextline
		
		
		System.out.println("Informe o ano de nascimento:");
		int anoNascimento = scanner.nextInt();
		
		int resultado = 2022 - anoNascimento;
		
		if (resultado >= 18) {
			System.out.println("Nome: " + nome + " Idade: " + resultado + " voc� pode dirigir");
		} else if (resultado >16) {
			System.out.println("Nome: " + nome + " Idade: " + resultado + " voc� pode votar");
		}	else {
			System.out.println("Voc� � totalmente incapaz");
		}
		scanner.close();
		
		
		
		
		
		
		
	}
	


}
