import java.util.Scanner;

public class Conversao {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Informe seu nome:");
		 String nome = scanner.nextLine(); // quando é texto usamos o nextline
		
		
		System.out.println("Informe o ano de nascimento:");
		int anoNascimento = scanner.nextInt();
		
		int resultado = 2022 - anoNascimento;
		
		if (resultado >= 18) {
			System.out.println("Nome: " + nome + " Idade: " + resultado + " você pode dirigir");
		} else if (resultado >16) {
			System.out.println("Nome: " + nome + " Idade: " + resultado + " você pode votar");
		}	else {
			System.out.println("Você é totalmente incapaz");
		}
		scanner.close();
		
		
		
		
		
		
		
	}
	


}
