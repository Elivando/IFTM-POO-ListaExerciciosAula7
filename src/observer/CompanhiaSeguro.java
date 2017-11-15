package observer;

public class CompanhiaSeguro implements Observer {

	@Override
	public void atualizar(Subject s) {
		System.out.println("[INFO - COMPANHIA DE SEGURO NOTIFICADA] ");
		System.out.println("O alarme mudou seu estado para: " + s.getAlerta());
	}

}
