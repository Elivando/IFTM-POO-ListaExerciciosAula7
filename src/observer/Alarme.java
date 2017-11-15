package observer;

import java.util.ArrayList;

public class Alarme implements Subject {

	private Boolean disparado = false;
	private ArrayList<Observer> observadores = new ArrayList<Observer>();

	public void alterarAlerta() {
		if (disparado)
			disparado = false;
		else
			disparado = true;
		notificarObservadores();
	}

	public Boolean getAlerta() {
		return disparado;
	}

	public void adicionarObservador(Observer o) {
		observadores.add(o);
	}

	public void removerObservador(Observer o) {
		observadores.remove(o);
	}

	public void notificarObservadores() {
		for (Observer o : observadores)
			o.atualizar(this);
	}
	
}
