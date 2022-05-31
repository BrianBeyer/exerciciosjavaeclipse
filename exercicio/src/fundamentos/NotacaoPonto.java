package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "bom dia x";
		s = s.replace("x", "senhora");// substituir uma coisa por outra
		s = s.toUpperCase();// tudo maiusculo
		s = s.concat("!!!");// concatenar algo
		System.out.println(s);
		
		System.out.println("Leo".toUpperCase());//outra forma de criar 
		
		String y = "bom dia x".replace("x","kiko").toUpperCase().concat("###");
		System.out.println(y);
	}
}
