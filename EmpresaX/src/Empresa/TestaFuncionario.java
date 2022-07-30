package Empresa;

//import java.util.ArrayList;

public class TestaFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// referencia          Objeto
	Funcionario f1 = new Funcionario();
	Programador p1 = new Programador();
	Gerente g1 = new Gerente();
	Secretario s1 = new Secretario();
	Diretor d1 = new Diretor();
	
	//ArrayList<Funcionario>  arr = new ArrayList<Funcionario>(); 
	
	
	//f2 só tem os metodos da referência, set Nome e set salario.não tem metodo do programador
	Funcionario f2 = new Programador();
	//o resultado chama o do objeto criado,no caso Programador,
	//entao o bonificacao retorna a bonificacao de Programador
	//System.out.println(f2.getBonificacao());
	
		
	
	//setando salarios
	f1.setSalario(1000);
	g1.setSalario(5000);
	p1.setSalario(3000);
	s1.setSalario(500);
	d1.setSalario(10);

	ControleDeBonificacao cb = new ControleDeBonificacao();
	cb.calcular(g1);
	cb.calcular(p1);
	cb.calcular(s1);
	cb.calcular(d1);
	System.out.println(cb.getTotalizador());
	
	System.out.println("Funcionarios criados ="+Funcionario.contador);
	//System.out.println(p1.getBonificacao());
	//System.out.println(g1.getBonificacao());
	}

}
