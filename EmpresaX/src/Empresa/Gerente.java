package Empresa;

public class Gerente extends Funcionario{

	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public int getSenha() {
		return senha;
	}
	
	//colocar salario em Funcionario como protected,para ser observado pelo mesmo pacote
	
	//mantem o que o metodo faz e altero COMO ele faz, chama-se sobrescrita
	//conceito de polimorfismo,porque alterou como metodo faz em cada classe
	@Override
	public double getBonificacao() {
		return this.salario + 5000; 
	}
}
