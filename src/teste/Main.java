package teste;

public class Main {

	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstancia(); //criar do objeto
		Singleton s2 = Singleton.getInstancia();
		Singleton s3 = Singleton.getInstancia();
		
	
		s2.retornarInformacao();
		s3.retornarInformacao();
		s1.retornarInformacao();
		//System.out.println("\n");
	
		for(int i=0;i<2;i++) {
			Incremental  inc = Incremental.getInstancia();
			System.out.println(inc);	
		}
	
		
		System.out.println("\n-------------");
		
		Usuario u1 = new Usuario("Alice");
		Usuario u2 = new Usuario("Bruno");
		Usuario u3 = new Usuario("Carla");

		Usuario[] usuarios = { u1, u2, u3 };

		for (int i = 0; i < usuarios.length; i++) {
		    System.out.println(usuarios[i]);
		}
		
		Logger.getInstance().log("Fim do programa.");
	}

}
