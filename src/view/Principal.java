package view;

import javax.swing.JOptionPane;

import controller.ConverteController;

public class Principal {

	public static void main(String[] args) {
		ConverteController cc = new ConverteController();
		int decimal = Integer.parseInt(JOptionPane.showInputDialog("Insira o número a ser traduzido em binário: "));
		if (decimal >1000) {
			while (decimal>1000) {
				JOptionPane.showMessageDialog(null, "Valor Inválido (maior que 1000)");
				decimal = Integer.parseInt(JOptionPane.showInputDialog("Insira o número a ser traduzido em binário novamente: "));
			}
			
		}
		try {
			System.out.println("O valor de "+ decimal + " em binário é: "+ cc.decToString(decimal));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
