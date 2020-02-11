package br.com;

import br.com.tarefas.Tarefas;

public class Principal {
	
	public static void main(String[] args) {
		
		System.out.println("Minhas tarefas");
		System.out.println("-------------------------");
		Tarefas tarefa1 = new Tarefas("Regar as plantas");
		
		tarefa1.exibirTarefa();
		System.out.println("Essa tarefa possui " + tarefa1.tamanhoTarefa() + " caracteres");
		
	}
}
