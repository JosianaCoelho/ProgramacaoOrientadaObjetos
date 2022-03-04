package pessoa;

public class Application {

	public static void main(String[] args) {

		Aluno a = new Aluno();

		a.setNome("Carlos");
		a.setIdade(21);
		a.setSexo("M");
		a.setCurso("Informatica");
		a.setCurso2("SI");
		System.out.println("");
		a.mostrar();
		a.cancelarMatricula();
		a.pagNovaMatricula();
		a.mudarCurso();
		System.out.println("-------------------------------------------------");

		Professor p = new Professor();

		p.setNome("João");
		p.setIdade(37);
		p.setSexo("M");
		p.setSalario(5000);
		p.mostrar();
		p.receberAumento(1000);
		p.setEspecialidade("Pós-Graduado");
		p.bonificacao(75);
		System.out.println("-------------------------------------------------");

		Funcionario f = new Funcionario();

		f.setNome("Rosa");
		f.setIdade(40);
		f.setSexo("M");
		f.setSetor("TI");
		f.mostrar();
		f.mudarSetor();
		f.mudarTrabalho();
		f.mostrar();
	}

}
