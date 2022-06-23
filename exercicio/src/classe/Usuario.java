package classe;

public class Usuario {// correspondente da classe EqualsHashcode
	String nome;
	String email;

	// aqui se escolhe as condi�oes para comparar os elementos
	public boolean equals(Object objeto) {
		
		if(objeto instanceof Usuario) {//se o parametro objeto que for passado 
		//� instancia de usuario
			
		Usuario outro = (Usuario) objeto;//objeto � convertido para usuario
		
		boolean nomeIgual = outro.nome.equals(this.nome);
		boolean emailIgual = outro.email.equals(this.email);
			return nomeIgual && emailIgual ;
		}else {
			return false;
		}
}
}