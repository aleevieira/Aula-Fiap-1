
public class Para {
	public static void main(String[] args) {
		
		
		// este laço de repetição
		for(int i = 0; i<10; i=i+1) { // só vale o i dentro do bloco do for
			System.out.println("Oi  " + i);
			
		}
		// é equivalente as linhas abaixo
		int i = 0;
		
		while (i < 10) {
			System.out.println("Oi " + i);
			i = i +1;
		}
		
		
		
	}

}
