
public class Para {
	public static void main(String[] args) {
		
		
		// este la�o de repeti��o
		for(int i = 0; i<10; i=i+1) { // s� vale o i dentro do bloco do for
			System.out.println("Oi  " + i);
			
		}
		// � equivalente as linhas abaixo
		int i = 0;
		
		while (i < 10) {
			System.out.println("Oi " + i);
			i = i +1;
		}
		
		
		
	}

}
