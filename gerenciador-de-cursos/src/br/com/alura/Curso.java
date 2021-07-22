package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new LinkedHashMap<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}

	@Override
	public String toString() {
		return "Nome Curso: " + this.nome + ", Nome Instrutor: " + this.instrutor + ", Nome das aulas: " + this.aulas
				+ ", Tempo total do curso: " + getTempoTotal() + ", Alunos: " + getAlunos();
	}

	public void matricula(Aluno a1) {
		this.alunos.add(a1);
		this.matriculaParaAluno.put(a1.getNumeroMatricula(), a1);

	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno a1) {
		return this.alunos.contains(a1);
	}

	public Aluno buscaMatriculado(int numero) {
		if (!matriculaParaAluno.containsKey(numero)) {
			throw new NoSuchElementException("Numero de matricula inexistente");
		}
		return matriculaParaAluno.get(numero);

	}

}
