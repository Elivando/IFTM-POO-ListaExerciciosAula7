package state;

public interface PortaState {
	PortaAbrindo abrir();

	PortaFechando fechar();

	PortaAberta manterAberta();

	PortaFechada manterFechada();

	PortaAberta manterPermanente();
}
