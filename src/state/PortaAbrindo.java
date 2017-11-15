package state;

public class PortaAbrindo implements PortaState {

	@Override
	public PortaAbrindo abrir() {
		System.out.println("Abrindo porta.");
		return this;
	}

	@Override
	public PortaFechando fechar() {
		return null;
	}

	@Override
	public PortaAberta manterAberta() {
		System.out.println("Porta Aberta.");
		return new PortaAberta();
	}

	@Override
	public PortaFechada manterFechada() {
		return null;
	}

	@Override
	public PortaAberta manterPermanente() {
		return null;
	}

}
