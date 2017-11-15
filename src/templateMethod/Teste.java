package templateMethod;

public class Teste {

	public static void main(String[] args) {
		Banco banco = new Banco("Banco Itaú", "(34) 3232-3232", "Av. João Naves de Avila 1400", "itau@itau.com.br");
		ContaCorrente conta = new ContaCorrente("João Borges", "1234-5", "123456-7");
		conta.insereSaldo(100.00);
		banco.addContaCorrente(conta);

		conta = new ContaCorrente("Maria Silva", "0101-1", "098770-2");
		conta.insereSaldo(55.99);
		banco.addContaCorrente(conta);

		conta = new ContaCorrente("Jose Medeiros", "3242-X1", "09876-9");
		conta.insereSaldo(890.70);
		banco.addContaCorrente(conta);

		Relatorio relatorioSimples = new RelatorioSimples(banco);
		relatorioSimples.imprimir();

		Relatorio relatorioComposto = new RelatorioComposto(banco);
		relatorioComposto.imprimir();
	}

}
