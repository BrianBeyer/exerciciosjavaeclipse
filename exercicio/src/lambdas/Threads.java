package lambdas;

public class Threads {
	public static void main(String[] args) {
		//classe que implementa a interface
		Runnable trabalho1 = new Trabalho1();
		
		//classe anonima
		Runnable trabalho2 = new Runnable() {
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("Tarefa2");
					try {
						Thread.sleep(100);
					}catch(Exception e) {
						
					}
				}

			}
		};
		Runnable trabalho3 = Threads::trabalho3;// :: é referencia 
			
		//thread é um processo que pode ser executado paralelamente
		Thread t1 = new Thread(trabalho1);
		Thread t2 = new Thread(trabalho2);
		Thread t3 = new Thread(trabalho3);
		t1.start();
		t2.start();
		t3.start();
	}
		static void trabalho3() {
			for (int i = 0; i < 100; i++) {
				System.out.println("Tarefa3");
				try {
					Thread.sleep(100);
				}catch(Exception e) {
					
				}
		}
	};
}
