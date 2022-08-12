package oo.encapsulamento;

public class PessoaTeste {
	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Kiko", "Silva", 10);//passando pelo construtor
		p1.setIdade(20);//alterando pelo metodo set
		p1.setNome("Juju");//alterando pelo metodo set
		p1.setSobrenome("Pereira");
		System.out.println(p1.getIdade());
		System.out.println(p1.getNome());
		System.out.println(p1.toString());//usando o metodo toString
		System.out.println(p1.nomeCompleto());
		
	}
}
