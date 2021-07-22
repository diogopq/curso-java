package br.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {

		
		
		Set<String> alunos = new HashSet<>(); 
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		alunos.add("Mauricio Aniche"); // nao aceita elementos repetidos
		
		System.out.println(alunos.size());
		System.out.println(alunos);
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		alunos.forEach(aluno -> { // lambda
			System.out.println(aluno);
		});
	
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		alunos.remove("Sergio Lopes");
		alunos.forEach(aluno -> { // lambda
			System.out.println(aluno);
		});
		System.out.println(pauloEstaMatriculado);
		List<String> alunosEmLista = new ArrayList<>(alunos);
		
	}

}
