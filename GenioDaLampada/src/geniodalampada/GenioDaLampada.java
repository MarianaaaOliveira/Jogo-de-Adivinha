package geniodalampada;

import javax.swing.JOptionPane;

public class GenioDaLampada {

	public static void main(String[] args) {

		boolean continuar = true;

		// MENSAGEM INICIAL
		JOptionPane.showMessageDialog(null, "<html> Vou pensar em um n�mero entre 0 e 9. Tente adivinhar!<html>");

		// CONDI��O DE REPETI��O ENTRE 0 E 9
		while (continuar) {
			double n = 0 + Math.random() * (9 - 1);
			int valor = (int) n;

			String input = JOptionPane.showInputDialog(null, "<html> Digite o n�mero: <html>");

			// TECLA X PARA SAIR DO LOOP
			if (input != null && (input.equalsIgnoreCase("x"))) {
				JOptionPane.showInternalMessageDialog(null, "<html> Voc� precionou para sair! At� mais! <html>");
				return;
			}

			// TRATAMENTO PARA RECEBER APENAS 1 NUMERAL

			if (input != null && (input.length() > 1 || !Character.isDigit(input.charAt(0)))) {
				JOptionPane.showMessageDialog(null,
						"<html> Por favor, insira um numeral com apenas 1 dig�to, entre 0 � 9! <html>");
			} else {
				String f1 = "ACERTOU";
				String f2 = "ERROU! Eu pensei no valor " + valor;

				int num = Integer.parseInt(input);
				String resultado = (valor == num) ? f1 : f2;

				JOptionPane.showMessageDialog(null, resultado);
			}
		}

	}
}
