package classe;

public class Equals {
	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "Lucas silva e silva";
		u1.email = "lucas.silva@email.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Lucas silva e silva";
		u2.email = "lucas.silva@email.com";
		//comparação de dois objetos
		
		System.out.println(u1==u2);//nesse caso o retorno é falso pois são dois 
		//objetos dostontos na memoria
		System.out.println(u1.equals(u2));// aqui tambem sera falso pois se comporta igual ao ==
		}
}
