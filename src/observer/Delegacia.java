package observer;

public class Delegacia implements Observer {

	@Override
	public void atualizar(Subject s) {
		System.out.println("[INFO - DELEGACIA NOTIFICADA]");
		System.out.println("O alarme mudou seu estado para: " + s.getAlerta());
	}

}
