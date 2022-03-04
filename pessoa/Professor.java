package pessoa;

public class Professor extends Pessoa {
//atributos
	private String especialidade;
	private float salario, aum, bonus;
	
	//metodos
	public void receberAumento(float aum) {
		this.salario += aum;
		System.out.println("Teve aumento, seu salário agora eh: " + this.salario);
		System.out.println();
	}
	
	public void bonificacao(float bonus) {
		this.bonus = ((salario+aum)*bonus/100);
		System.out.println("com a conclusao da sua " + this.especialidade + " seu salario com bonus eh: " +((this.bonus)+salario+aum));
		System.out.println();
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public float getAum() {
		return aum;
	}

	public void setAum(float aum) {
		this.aum = aum;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	
	
}
