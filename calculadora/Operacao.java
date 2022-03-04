package calculadora;

public class Operacao {
	
	float resultado;
	
	public float soma(float num1, float num2) {
		this.resultado = num1 + num2;
		return resultado;
	}
	 
	public float subtrai(float num1, float num2) {
		this.resultado = num1 - num2;
		return resultado;
	}
	
	public float multiplica(float num1, float num2) {
		this.resultado = num1 * num2;
		return resultado;
	}

	public float dividi(float num1, float num2) {
		this.resultado = num1 / num2;
		return resultado;
	}	

}
