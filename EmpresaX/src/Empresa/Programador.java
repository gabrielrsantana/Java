package Empresa;

public class Programador extends Funcionario {
	private String linguagem;

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	
	@Override
	public double getBonificacao() {
		return this.salario + 3000; 
	}

}
