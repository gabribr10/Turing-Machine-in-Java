package turingmachine;

import java.util.ArrayList;
import java.util.List;

public class State {
	String nome;
	List<AcaoEntrada> acoesPorEntrada;

	public void addAcaoesPorEntrada(AcaoEntrada acaoEntrada) {
		
		this.acoesPorEntrada.add(acaoEntrada);
	}
	
	public State() {
		acoesPorEntrada =  new ArrayList<AcaoEntrada>();
	}

	public State(String nome, List<AcaoEntrada> acoesPorEntrada) {
		super();
		this.nome = nome;
		this.acoesPorEntrada = acoesPorEntrada;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<AcaoEntrada> getAcoesPorEntrada() {
		return acoesPorEntrada;
	}

	public void setAcoesPorEntrada(List<AcaoEntrada> acoesPorEntrada) {
		this.acoesPorEntrada = acoesPorEntrada;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "nome: " + this.nome + "acoes " + this.acoesPorEntrada.toString();
	}
	
}
