package fundamentos.operadores;

public class DesafioAritimetico {
	public static void main(String[] args) {
		
		double p1 = (double) Math.pow(6*(3+2), 2);
	    double p2 = p1/(3*2);
		double p3 = ((1-5)*(2-7))/2;
		double p4 = Math.pow(p3, 2);
		double p5 = Math.pow(p2-p4, 3);
		double pfinal = p5/Math.pow(10, 3);
		
		System.out.println(pfinal);
		
	}
}
