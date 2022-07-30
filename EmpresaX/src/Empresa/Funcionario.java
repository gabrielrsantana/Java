package Empresa;

public class Funcionario {
	//priva so encher dentro da propria classe,tem que mudar
	//para protected para outras classe dentro do pacote verem
	protected double salario;
	private String nome;
	public static int contador;
	
	Funcionario(){
		//cada vez que criar um funcionario,incrementa
		contador = contador+1;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getBonificacao() {
		return this.salario + 1000; 
	}
}
//gerar Getter e Setter ALT+SHIFT+S
