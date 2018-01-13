package teste;

public class Testadora {

	public static void main(String[] args) {
		String frase = "TESTE TESTE TESTE";
		String novaFrase = " ";
		int contador = 0;
		int coluna = 5;
		for (int i = 0; i < frase.length(); i++) {	
			contador = i;
			if( contador == coluna & frase.charAt(i) == ' ') {
				System.out.println(frase.charAt(i));
				contador = 0;				
			}else {
				System.out.println("Não deu para quebrar a linha");
			}
			novaFrase += "\n";
		}
		System.out.println(novaFrase);
	}

}
