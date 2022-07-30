package Empresa;

public class ControleDeBonificacao {
	private double totalizador;
	
	
	//soma as bonificacoes de todos os funcionarios
	
	public double getTotalizador() {
		return totalizador;
	}


	//trocar as 3 implementacoes do metodo calcular,por uma so aplicando Polimorfismo
	/* ao inves de ter 3 metodos para cada Classe, usa-se classe Generica Funcionario
	para implementar
	
	public void calcular(Gerente g1) {
		// TODO Auto-generated method stub
		
	}
	public void calcular(Programador p1) {
		// TODO Auto-generated method stub
		
	}
	public void calcular(Secretario s1) {
		// TODO Auto-generated method stub
		
	}
	*/
	
	//substitui um metodo generico ao inve das 3 acima
	public void calcular(Funcionario f) {
		// overriding //sobreescrita
		this.totalizador +=f.getBonificacao();
	}
	
	
}
