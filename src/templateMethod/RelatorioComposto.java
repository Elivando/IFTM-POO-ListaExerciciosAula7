package templateMethod;

import java.text.SimpleDateFormat;

public class RelatorioComposto extends Relatorio {

	public RelatorioComposto(Banco banco) {
		super(banco);
	}

	@Override
	public void imprimir() {
		StringBuilder sb = new StringBuilder();

		// CABE�ALHO
		sb.append(String.format("%60s%n", "RELAT�RIO BANCARIO COMPOSTO"));
		sb.append(String.format("%60s%n", "---------------------------"));
		sb.append(String.format("%s %s %n", "BANCO: ", banco.getNome()));
		sb.append(String.format("%s %s %n", "ENDRE�O: ", banco.getEndereco()));
		sb.append(String.format("%s %s %n", "TELEFONE: ", banco.getTelefone()));
		sb.append(String.format("%s%n",
				"---------------------------------------------------------------------------------------------"));
		sb.append(String.format("%s%n",""));

		// CORPO
		sb.append(String.format("%-20s %-20s %-20s %-20s%n", "TITULAR", "AG�NCIA", "CONTA", "SALDO"));

		for (ContaCorrente conta : banco.getListContaCorrentes()) {
			sb.append(String.format("%-20s %-20s %-20s %-20s%n", "--------------", "--------------", "--------------",
					"--------------"));
			sb.append(String.format("%-20s %-20s %-20s %-20s%n", conta.getTitular(), conta.getAgencia(),
					conta.getNumeroConta(), conta.getSaldo()));
		}

		// RODAPE
		sb.append(String.format("%s%n",""));
		sb.append(String.format("%s%n",
				"---------------------------------------------------------------------------------------------"));
		sb.append(String.format("%s %s %n", "E-MAIL: ", banco.getEmail()));
		sb.append(String.format("%s %s %n", "DATA ATUAL: ",
				new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(dataAtual)));

		System.out.println(sb.toString());
	}

}
