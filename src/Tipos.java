
public class Tipos {
	public static void main(String[] args) {
	    
		// vari�veis para n�mero inteiros
		byte tamanhoMinimoByte = Byte.MIN_VALUE;     //2^8 o Byte maiusculo � uma classe
		byte tamanhoMaximoByte = Byte.MAX_VALUE;
		
		short tamanhoMinimoShort = Short.MIN_VALUE;
		short tamanhoMaximoShort = Short.MAX_VALUE;  //2^16
		
		int tamanhoMinimoInt = Integer.MIN_VALUE;
		int tamanhoMaximoInt = Integer.MAX_VALUE;    //2^32
		
		long tamanhoMinimoLong = Long.MIN_VALUE;
		long tamanhoMaximoLong = Long.MAX_VALUE;     //2^64  elevado
		
		
		//n�meros de pontos flutuantes
		
		float tamanhoMinimoFloat = Float.MIN_NORMAL;
		float tamanhoMaximoFloat = Float.MAX_VALUE;
		
		double tamanhoMinimoDouble = Double.MIN_NORMAL;
		double tamanhoMaximoDouble = Double.MAX_VALUE;
		
		boolean verdadeiro = true; //ou false se n�o for iniciado false � o valor padr�o.
				
		char caractere = 'a'; // com aspas simples
		
		String texto = "Este aqui recebe textos entre aspas duplas";
		
		
		System.out.println("*******N�meros Inteiros*******");
		System.out.println("byte cabe de:" + tamanhoMinimoByte + " at� " + tamanhoMaximoByte);
		System.out.println("short cabe de:" + tamanhoMinimoShort + " at� " + tamanhoMaximoShort);
		System.out.println("int cabe de:" + tamanhoMinimoInt +" at� "+ tamanhoMaximoInt);
		System.out.println("long cabe de:" + tamanhoMinimoLong + " at� "+ tamanhoMaximoLong);
		
		System.out.println("****** N�meros Reais******");
		System.out.println(" O float cabe de " + tamanhoMinimoFloat + " at� " + tamanhoMaximoFloat);
		System.out.println(" O double cabe de " + tamanhoMinimoDouble + " at� " + tamanhoMaximoDouble);
		
		
	}

}
