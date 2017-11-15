package state;

public class Cliente {

	public static void main(String[] args) {
		Porta porta = new Porta();
		porta.abrir();
		porta.abertaPermanente();
		porta.fechar();		
		porta.abrir();
		porta.fechar();
		//porta.fechar();
		
	}

}
