package teste;

public class novoTeste {

	public static void main(String[] args) {
		Integer contador = 7;

		String frase = "Teste teste teste bolacha";

		String[] arrayFrase = frase.split(" ");

		String novaFrase = "";

		if(arrayFrase != null && arrayFrase.length > 0){
			
			for(int i = 0;i < arrayFrase.length ;i++){
				
				if(arrayFrase[i].length() == contador){
					novaFrase = novaFrase.concat("\n").concat(arrayFrase[i]);
				}else{
					novaFrase = novaFrase.concat(" ").concat(arrayFrase[i]);
				}			
			}
		}
		System.out.println(novaFrase);
	}
}
