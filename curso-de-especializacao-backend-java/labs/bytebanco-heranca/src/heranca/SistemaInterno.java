package heranca;

public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(FuncionarioAutenticavel funcionarioAutenticavel) {
		boolean autenticou = funcionarioAutenticavel.autentica(this.senha);
		
		if (autenticou) {
			System.out.println("Pode entrar no sistema!");
		} else {
			System.out.println("Nao pode entrar no sistema!");
		}
	}

}
