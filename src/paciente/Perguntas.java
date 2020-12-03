package paciente;

public class Perguntas {
	
	private String pergunta1;
	private String pergunta2;
	private String pergunta3;
	private String pergunta4;
	private String pergunta5;
	private String pergunta6;
	private String pergunta7;
	private String pergunta8;
	private String pergunta9;
	private String pergunta10;
	private String pergunta11;
	private String pergunta12;
	private String pergunta13;
	private String pergunta14;
	
	
	
	public Perguntas(String pergunta1, String pergunta2, String pergunta3, String pergunta4, String pergunta5,
			String pergunta6, String pergunta7, String pergunta8, String pergunta9, String pergunta10,
			String pergunta11, String pergunta12, String pergunta13, String pergunta14) {
		this.pergunta1 = pergunta1;
		this.pergunta2 = pergunta2;
		this.pergunta3 = pergunta3;
		this.pergunta4 = pergunta4;
		this.pergunta5 = pergunta5;
		this.pergunta6 = pergunta6;
		this.pergunta7 = pergunta7;
		this.pergunta8 = pergunta8;
		this.pergunta9 = pergunta9;
		this.pergunta10 = pergunta10;
		this.pergunta11 = pergunta11;
		this.pergunta12 = pergunta12;
		this.pergunta13 = pergunta13;
		this.pergunta14 = pergunta14;
	}
	public String getPergunta1() {
		return pergunta1;
	}
	public void setPergunta1(String pergunta1) {
		this.pergunta1 = pergunta1;
	}
	public String getPergunta2() {
		return pergunta2;
	}
	public void setPergunta2(String pergunta2) {
		this.pergunta2 = pergunta2;
	}
	public String getPergunta3() {
		return pergunta3;
	}
	public void setPergunta3(String pergunta3) {
		this.pergunta3 = pergunta3;
	}
	public String getPergunta4() {
		return pergunta4;
	}
	public void setPergunta4(String pergunta4) {
		this.pergunta4 = pergunta4;
	}
	public String getPergunta5() {
		return pergunta5;
	}
	public void setPergunta5(String pergunta5) {
		this.pergunta5 = pergunta5;
	}
	public String getPergunta6() {
		return pergunta6;
	}
	public void setPergunta6(String pergunta6) {
		this.pergunta6 = pergunta6;
	}
	public String getPergunta7() {
		return pergunta7;
	}
	public void setPergunta7(String pergunta7) {
		this.pergunta7 = pergunta7;
	}
	public String getPergunta8() {
		return pergunta8;
	}
	public void setPergunta8(String pergunta8) {
		this.pergunta8 = pergunta8;
	}
	public String getPergunta9() {
		return pergunta9;
	}
	public void setPergunta9(String pergunta9) {
		this.pergunta9 = pergunta9;
	}
	public String getPergunta10() {
		return pergunta10;
	}
	public void setPergunta10(String pergunta10) {
		this.pergunta10 = pergunta10;
	}
	public String getPergunta11() {
		return pergunta11;
	}
	public void setPergunta11(String pergunta11) {
		this.pergunta11 = pergunta11;
	}
	public String getPergunta12() {
		return pergunta12;
	}
	public void setPergunta12(String pergunta12) {
		this.pergunta12 = pergunta12;
	}
	public String getPergunta13() {
		return pergunta13;
	}
	public void setPergunta13(String pergunta13) {
		this.pergunta13 = pergunta13;
	}
	public String getPergunta14() {
		return pergunta14;
	}
	public void setPergunta14(String pergunta14) {
		this.pergunta14 = pergunta14;
	}
	@Override
	public String toString() {
		return "Você faz uso de bebida alcóolica? " + pergunta1 + "\n"
				+"É fumante? " + pergunta2 + "\n"
				+ "Pratica atividade física?" + pergunta3+ "\n"
				+ "Tem pressão alta? " + pergunta4 + "\n"
				+ "Possui problemas cardíacos ? " + pergunta5 + "\n"
				+"Sua taxa de colesterol é alta? " + pergunta6 + "\n"
				+ "É diabético? "+ pergunta7  + "\n"
				+ "Você possui doença pulmonar? " + pergunta8 + "\n"
				+ "Usa algum tipo de medicação para o tratamento de alguma doença? " + pergunta9 + "\n"
				+ "É gestante de alto risco ? " + pergunta10+ "\n"
				+ "Possui doenças renais? " + pergunta11 + "\n"
				+ "Possui doenças hepáticas? " + pergunta12 + "\n"
				+ "É obeso? " + pergunta13 + "\n"
				+ "Já fez ou faz quimioterapia? " + pergunta14 + "\n";
	}
	
}