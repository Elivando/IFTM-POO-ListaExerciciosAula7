package observer;

public class Teste {
	
	public static void main(String[] args) {
		Alarme alarme = new Alarme();		
		alarme.adicionarObservador(new Delegacia());
		alarme.adicionarObservador(new CompanhiaSeguro());		
		alarme.alterarAlerta();
		alarme.alterarAlerta();		
	}
	
}
