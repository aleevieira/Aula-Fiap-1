
public class Enquanto {
	public static void main(String[] args) {
		
		int idade = 15;
		
		while (idade<18) {
			System.out.println( "Idade: " + idade);
			idade = idade + 1;
			// a variável está do lado de fora, diferente do for, que a variavél fica dentro
		}
		
		byte i = 0;
		
		while(i<=idade) {
			System.out.println(i);
			i = (byte)  (i + 1);
			
		}
		
	}

}
