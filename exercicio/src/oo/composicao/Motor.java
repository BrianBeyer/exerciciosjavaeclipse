package oo.composicao;

public class Motor {

	boolean ligado = false;
	double fatorInjecao = 1;
	int giros() {
		if(!ligado) {//se nao estiver ligado, retorna zero
			return 0;
		}else {
		return (int) Math.round(fatorInjecao * 3000);//arredonda e retorna um valor inteiro
		}
	
	}
}
