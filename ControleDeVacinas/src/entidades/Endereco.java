package entidades;

public class Endereco {

	private String cidade;
	private String rua;
	private String estado;
	
	public Endereco(String cidade, String rua, String estado) {
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
}
