package controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe o n�mero: ");//cria caixa de dialogo
		//o valor retornado vai ser string, e sera necessario uma conversao
		int numero = Integer.parseInt(valor);
		
		if(numero%2==0) {
			System.out.println("O n�mero � par");
		}else {
			System.out.println("O n�mero � impar");
		}

	}
}
