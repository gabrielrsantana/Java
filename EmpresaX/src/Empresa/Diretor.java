package Empresa;

public class Diretor extends Funcionario{
	
	
	
	@Override
	public double getBonificacao() {
	
		return this.getSalario() +50000;
	}

}
