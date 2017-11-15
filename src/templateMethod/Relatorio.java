package templateMethod;

import java.util.Date;

public abstract class Relatorio {
	Date dataAtual = new Date();
	Banco banco;

	public Relatorio(Banco banco) {
		super();
		this.banco = banco;
	}

	protected abstract void imprimir();
}
