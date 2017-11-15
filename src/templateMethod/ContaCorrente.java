package templateMethod;

public class ContaCorrente {
	private String titular, agencia, numeroConta;
	private Double saldo = 0.0;
	
	public ContaCorrente(String titular, String agencia, String numeroConta) {
		super();
		this.titular = titular;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void insereSaldo(Double valor) {
		this.saldo += valor;
	}
	
	
	
}
