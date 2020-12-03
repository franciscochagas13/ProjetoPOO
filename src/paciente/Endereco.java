package paciente;

public class Endereco {

	private String cidade;
	private String rua;
	private String estado;
	private Integer cep;
	
	public Endereco(String cidade, String rua, String estado, Integer cep) {
		this.cidade = cidade;
		this.rua = rua;
		this.estado = estado;
	}
	
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}
}
