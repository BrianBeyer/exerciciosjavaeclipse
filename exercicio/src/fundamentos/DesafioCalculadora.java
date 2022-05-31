package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		double num1 = ler.nextDouble();
			
		System.out.print("Digite o segundo numero: ");
		double num2 = ler.nextDouble();
		
		System.out.print("Qual operação fazer? (+ - / * %) ");
		String op = ler.next(); 
		
		double res = "+".equals(op)?num1+num2:0; //se o operador escolhido for igual a + faça a soma senao 0 e passa para a proxoma linha
		res = "-".equals(op)?num1-num2:res;
		res = "*".equals(op)?num1*num2:res;
		res = "/".equals(op)?num1/num2:res;
		res = "%".equals(op)?num1%num2:res;
		System.out.println(num1+" "+op+" "+num2+" = "+res);
		//outra forma de representar
		//System.out.printf("%.2f %s %.2f = %2.f",num1,op,num2,res); //colocar o f depois do print
		
		
	
	ler.close();
	}
	
}
