package state;

public class PortaFechando implements PortaState {

	@Override
	public PortaAbrindo abrir() {
		return null;
	}

	@Override
	public PortaFechando fechar() {
		System.out.println("Fechando Porta.");
		return this;
	}

	@Override
	public PortaAberta manterAberta() {
		return null;
	}

	@Override
	public PortaFechada manterFechada() {
		System.out.println("Porta Fechada.");
		return new PortaFechada();
	}

	@Override
	public PortaAberta manterPermanente() {
		return null;
	}

}
