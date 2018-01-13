package teste;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		/* 
		 * EX:
		 * "Um pequeno jabuti xereta viu dez cegonhas felizes"
		 * Opção Com JoptionPane
		 * */
		String string = JOptionPane.showInputDialog(null, 
				"Digite a Frase que deseja quebrar");
		int coluna = Integer.parseInt(JOptionPane.showInputDialog(null, 
				"Digite a quantidade de colunas"));
		//aux - resgata a coluna inserindo novamente no if o valor original.
		int aux = coluna;
		//Inicia um contador que confere a coluna para menos e quebra a linha.
		int contador = 0;
		// um array para ler a string e separar no for
		char[] charArray = string.toCharArray();
		//StringBuilder para refazer a frase quebrando em linhas.
		StringBuilder stb = new StringBuilder();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i] == ' ' & contador > coluna) {				
				stb.insert(0, "\n");
				contador = 0;
				coluna = aux;
			}else {
				coluna--;
				contador++;
				stb.insert(0, charArray[i]);
			}
		}
		System.out.println(stb.reverse());	
	}
}