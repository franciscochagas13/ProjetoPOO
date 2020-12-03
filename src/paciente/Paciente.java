package paciente;

import java.text.SimpleDateFormat;
import java.util.Date;

import entidades.Pessoa;

public class Paciente extends Pessoa {

	private String sexo;
	private String estado;
	private Endereco endereco;
	private Integer rg;
	private Integer telefone;
	private Perguntas perguntas;
	private GrauDePrioridade grauDePrio;
	
	public Paciente(String nome, Date dataDeNascimento, String sexo, String estado, Endereco end,
			Integer telefone, Perguntas perguntas, Integer rg) {
		super(nome, dataDeNascimento);
		this.sexo = sexo;
		this.estado = estado;
		this.endereco = end;
		this.telefone = telefone;
		this.perguntas = perguntas;
		this.rg = rg;
	}
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public Perguntas getPerguntas() {
		return perguntas;
	}

	public void setPerguntas(Perguntas perguntas) {
		this.perguntas = perguntas;
	}

	public Integer getRg() {
		return rg;
	}

	public void setRG(Integer rg) {
		this.rg = rg;
	}

	@Override
	public String toString() {
		return "Paciente: \n" + "RG: " + this.getRg() + " " +
				"Nome: " + this.getNome() + " " +
				" Data de Nascimento: " + sdf.format(this.getDataDeNascimento()) + " "
						+ "Sexo: " + this.getSexo();
	}

	public GrauDePrioridade getGrauDePrio() {
		return grauDePrio;
	}

	public void setGrauDePrio(GrauDePrioridade grauDePrio) {
		this.grauDePrio = grauDePrio;
	}
	
}
