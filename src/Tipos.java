
public class Tipos {
	public static void main(String[] args) {
	    
		// variáveis para número inteiros
		byte tamanhoMinimoByte = Byte.MIN_VALUE;     //2^8 o Byte maiusculo é uma classe
		byte tamanhoMaximoByte = Byte.MAX_VALUE;
		
		short tamanhoMinimoShort = Short.MIN_VALUE;
		short tamanhoMaximoShort = Short.MAX_VALUE;  //2^16
		
		int tamanhoMinimoInt = Integer.MIN_VALUE;
		int tamanhoMaximoInt = Integer.MAX_VALUE;    //2^32
		
		long tamanhoMinimoLong = Long.MIN_VALUE;
		long tamanhoMaximoLong = Long.MAX_VALUE;     //2^64  elevado
		
		
		//números de pontos flutuantes
		
		float tamanhoMinimoFloat = Float.MIN_NORMAL;
		float tamanhoMaximoFloat = Float.MAX_VALUE;
		
		double tamanhoMinimoDouble = Double.MIN_NORMAL;
		double tamanhoMaximoDouble = Double.MAX_VALUE;
		
		boolean verdadeiro = true; //ou false se não for iniciado false é o valor padrão.
				
		char caractere = 'a'; // com aspas simples
		
		String texto = "Este aqui recebe textos entre aspas duplas";
		
		
		System.out.println("*******Números Inteiros*******");
		System.out.println("byte cabe de:" + tamanhoMinimoByte + " até " + tamanhoMaximoByte);
		System.out.println("short cabe de:" + tamanhoMinimoShort + " até " + tamanhoMaximoShort);
		System.out.println("int cabe de:" + tamanhoMinimoInt +" até "+ tamanhoMaximoInt);
		System.out.println("long cabe de:" + tamanhoMinimoLong + " até "+ tamanhoMaximoLong);
		
		System.out.println("****** Números Reais******");
		System.out.println(" O float cabe de " + tamanhoMinimoFloat + " até " + tamanhoMaximoFloat);
		System.out.println(" O double cabe de " + tamanhoMinimoDouble + " até " + tamanhoMaximoDouble);
		
		
	}

}
