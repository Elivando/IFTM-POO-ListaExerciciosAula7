package state;

public class PortaFechada implements PortaState {

	@Override
	public PortaAbrindo abrir() {
		System.out.println("Abrindo porta.");
		return new PortaAbrindo();
	}

	@Override
	public PortaFechando fechar() {
		return null;
	}

	@Override
	public PortaAberta manterAberta() {
		return null;
	}

	@Override
	public PortaFechada manterFechada() {
		System.out.println("Porta Fechada.");
		return this;
	}

	@Override
	public PortaAberta manterPermanente() {
		return null;
	}
}
