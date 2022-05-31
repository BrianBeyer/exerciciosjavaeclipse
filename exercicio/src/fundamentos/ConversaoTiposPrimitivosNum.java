package fundamentos;

public class ConversaoTiposPrimitivosNum {
	public static void main(String[] args) {
		
		double a = 1; //implicita
		System.out.println(a);
		
		float b = (float) 1.12345678888;// conversao explicita
		//aqui pode fazer a conversao colocando o F no final do numero
		System.out.println(b);
		
		int c = 12;
		byte d = (byte) c;//explicita (cast)
		System.out.println(d);
		//aqui convertendo um tipo que armazena mais dado para um que armazena menos dado
		
		double e = 1.9999;
		int f = (int) e;
		System.out.println(f);
		//aqui um valor com virgula vai ser convertido para um sem e sera truncado
		//aqui ha perda de informação
		
		int ff = 123;
		double ww = ff;
		System.out.println(ww);
		//aqui nao precisa ser explicito na conversao de um numero sem virgula para um tipo com virgula
				
	}
}
