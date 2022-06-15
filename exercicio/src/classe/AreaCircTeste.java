package classe;

public class AreaCircTeste {
	public static void main(String[] args) {
		AreaCirc a = new AreaCirc(5.6);
		//a.pi = 5; caso fosse modificar o valor do pi(sem ser static), mas nao é possivel modificar se for static
		//AreaCirc.pi = 3.666;//para modificar a variavel static, digitando o nome da classe ponto a variavel
		System.out.println(a.area());
		System.out.println(AreaCirc.pi);
	}
}
