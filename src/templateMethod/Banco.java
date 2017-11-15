package templateMethod;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome, telefone, endereco, email;
	private List<ContaCorrente> listContaCorrentes;

	public Banco(String nome, String telefone, String endereco, String email) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
		this.listContaCorrentes = new ArrayList<ContaCorrente>();
	}

	public String getNome() {
		return nome;
	}
	
	public String getTelefone() {
		return telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getEmail() {
		return email;
	}

	public List<ContaCorrente> getListContaCorrentes() {
		return listContaCorrentes;
	}

	public void addContaCorrente(ContaCorrente conta) {
		this.listContaCorrentes.add(conta);
	}

}
