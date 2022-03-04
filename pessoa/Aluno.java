package pessoa;

public class Aluno extends Pessoa {
	// atributos
	private int matricula;
	private String curso, curso2;
	private boolean novamatricula;

	// metodos
	public void cancelarMatricula() {
		System.out.println();
		System.out.println(
				"Olá " + this.getNome() + ", a sua matricula no curso de " + this.getCurso() + " será cancelada!");
		System.out.println();
		this.setMatricula(0);
		this.setCurso(null);
	}

	public void pagNovaMatricula() {
		if (this.getNovaMatricula() != true)
			System.out.println("Pagamento efetuado com sucesso! Pode matricular-se em um novo curso!");
		else
			System.out.println("Não poderá mudar de curso até o pagamento da matrícula ser efetuado");
		System.out.println();
	}

	public void mudarCurso() {
		this.getNovaMatricula();
		System.out.println(
				"Parabéns, " + this.getNome() + "!" + " Seu novo curso escolhido é  " + this.getCurso2() + "!");
		System.out.println();
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public boolean getNovaMatricula() {
		return novamatricula;
	}

	public void setNovaMatricula(boolean novamatricula) {
		this.novamatricula = novamatricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getCurso2() {
		return curso2;
	}

	public void setCurso2(String curso2) {
		this.curso2 = curso2;
	}

}
