package fundamentos;

public class ConversaoNumString {
	public static void main(String[] args) {
		//convertendo de numero para string
		Integer num1 = 10000; //(wrapper)
		System.out.println(num1.toString().length());
		//convertido em string, é possivel usar funcionalidades so de string como o length
		
		int num2 = 110000;
		System.out.println(Integer.toString(num2).length());//convertendo numero primitivo
	}
}
