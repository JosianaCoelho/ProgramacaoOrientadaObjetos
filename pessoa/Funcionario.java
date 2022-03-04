package pessoa;

public class Funcionario extends Pessoa {
	// atributos
	private String setor;
	private boolean trabalhando;

	// metodos
	public void mudarSetor() {
		System.out.println();
		System.out.println("Notifica��o! seu novo setor �: " + this.getSetor());
		this.setor = this.setor;
		System.out.println();
	}
	
	public void mudarTrabalho() {
		if (this.getTrabalhando() != true)
			System.out.println("Seja Bem Vindo! Este � seu novo local de trabalho!");
		else
			System.out.println("Favor comparecer no RH para receber advert�ncia!");
		System.out.println();
	}
	
	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean getTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
}


