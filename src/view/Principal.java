package view;

import javax.swing.JOptionPane;

import controller.ConverteController;

public class Principal {

	public static void main(String[] args) {
		ConverteController cc = new ConverteController();
		int decimal = Integer.parseInt(JOptionPane.showInputDialog("Insira o n�mero a ser traduzido em bin�rio: "));
		if (decimal >1000) {
			while (decimal>1000) {
				JOptionPane.showMessageDialog(null, "Valor Inv�lido (maior que 1000)");
				decimal = Integer.parseInt(JOptionPane.showInputDialog("Insira o n�mero a ser traduzido em bin�rio novamente: "));
			}
			
		}
		try {
			System.out.println("O valor de "+ decimal + " em bin�rio �: "+ cc.decToString(decimal));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
