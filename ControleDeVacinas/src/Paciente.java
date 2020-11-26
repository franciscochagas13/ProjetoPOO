import java.util.Date;

import entidades.Endereco;
import entidades.Pessoa;

public class Paciente extends Pessoa {
	
	private String sexo;
	private String estado;
	private Endereco endereco;
	private String email;
	private String telefone;
	
	public Paciente(String nome, Date dataDeNascimento, String sexo, String estado, 
			Endereco end, String email, String telefone) {
		super(nome, dataDeNascimento);
		this.sexo = sexo;
		this.estado = estado;
		this.endereco = end;
		this.email = email;
		this.telefone = telefone;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
