package teste;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		/* 
		 * Opção Com JoptionPane
		 * */
		// String string = JOptionPane.showInputDialog(null, "Digite a Frase que deseja quebrar");
		// int coluna = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de colunas"));
		
		
		String string = "Um pequeno jabuti xereta viu dez cegonhas felizes teste teste teste teste teste teste teste teste";
		/*
		 * Opção Direta Inserindo os Valores diretamente
		 */
		int coluna = 20;
		
		int aux = coluna;
		int contador = 0;
		char[] charArray = string.toCharArray();
		StringBuilder stb = new StringBuilder();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i] == ' ' & contador > coluna) {				
				stb.insert(0, "\n");
				contador = 0;
				coluna = aux;
			}else {
				//System.out.println(charArray[i]);
				coluna--;
				contador++;
				stb.insert(0, charArray[i]);
				//System.out.println(stb);
			}
			
		}
		System.out.println(stb.reverse());	
	}
}


