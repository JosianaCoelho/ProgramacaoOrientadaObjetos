package pessoa;

public class Pessoa {
	//atributos
	private String nome;
	private int idade;
	private String sexo;
	
	//metodos
	public void mostrar() {
		System.out.println("Nome:"+ this.getNome());
		System.out.println("Idade:"+ this.getIdade());
		System.out.println("Sexo:"+ this.getSexo());
		System.out.println("Feliz mais um ano de vida! sua idade agora eh:" + (this.getIdade() + 1)+"anos");
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	

}
