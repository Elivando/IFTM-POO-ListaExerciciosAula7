package templateMethod;

public class RelatorioSimples extends Relatorio {

	public RelatorioSimples(Banco banco) {
		super(banco);
	}

	@Override
	public void imprimir() {
		// CABEÇALHO
		StringBuilder sb = new StringBuilder();

		sb.append(String.format("%60s%n", "RELATÓRIO BANCARIO SIMPLES"));
		sb.append(String.format("%60s%n", "--------------------------"));
		sb.append(String.format("%s %s %n", "BANCO: ", banco.getNome()));
		sb.append(String.format("%s %s %n", "TELEFONE: ", banco.getTelefone()));
		sb.append(String.format("%s%n",
				"---------------------------------------------------------------------------------------------"));
		sb.append(String.format("%s%n",""));
		
		// CORPO
		sb.append(String.format("%-20s %-20s%n", "TITULAR", "SALDO"));

		for (ContaCorrente conta : banco.getListContaCorrentes()) {
			sb.append(String.format("%-20s %-20s%n", "--------------", "--------------"));
			sb.append(String.format("%-20s %-20s%n", conta.getTitular(), conta.getSaldo()));
		}

		// RODAPE
		sb.append(String.format("%s%n",""));
		sb.append(String.format("%s%n",
				"---------------------------------------------------------------------------------------------"));
		sb.append(String.format("%s %s %n", "BANCO: ", banco.getNome()));
		sb.append(String.format("%s %s %n", "TELEFONE", banco.getTelefone()));

		System.out.println(sb.toString());
	}

}
