package observer;

public interface Subject {
	
	public Boolean getAlerta();
	
	public void adicionarObservador(Observer o);

	public void removerObservador(Observer o);

	public void notificarObservadores();
}
