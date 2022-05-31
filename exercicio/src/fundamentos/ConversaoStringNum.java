package fundamentos;
import javax.swing.JOptionPane;
public class ConversaoStringNum {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");//para criar uma janela 
		String valor2 = JOptionPane.showInputDialog("Digite o segundo numero: ");
		
		double num1 = Double.parseDouble(valor1);// para converter o calor string(valor1)em double
		double num2 = Double.parseDouble(valor2);
		
		double soma = num1+num2;
				
		System.out.println("A soma é "+soma);
		System.out.println("A media é "+soma/2);
				
				
	}
}
