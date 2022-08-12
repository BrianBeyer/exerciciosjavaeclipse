package lambdas;

public class CalculoTeste2 {
	public static void main(String[] args) {
		// express�o em lambda
		//a assinatura com esses 
		//parametros � buscada na classe calculo
		Calculo calc = (x, y) -> {
			return x + y;
		};
		System.out.println(calc.executar(4, 6));
		
		//calc recebe uma nova expressao lambda
		calc = (x, y) -> x * y;//o return fica implicito 
		System.out.println(calc.executar(4, 6));
		
		System.out.println(calc.legal());
		
		System.out.println(Calculo.muitoLegal());
		//aqui � um metodo static, � acessado pela interface e nao
		//pela instancia
	}
}
