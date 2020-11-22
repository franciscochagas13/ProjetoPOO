package gerenciadorVacinas;

import javax.swing.JOptionPane;


public class Main {
public static void main(String[]args) {
		
		Usuario u = new Usuario();
		Endereco e = new Endereco();
		
		int opcao = 3;
		
		while(opcao!=0) {
			
			opcao = Integer.parseInt(JOptionPane.showInputDialog("[1] Cadastrar\n"
					+ "[0] Sair"));
			
			if(opcao==1) {
			u.setNome(JOptionPane.showInputDialog("Digite seu nome completo"));
			e.setRua(JOptionPane.showInputDialog("Digite sua rua"));
			e.setNumeroCasa(JOptionPane.showInputDialog("Digite o numero da casa"));
			e.setCidade(JOptionPane.showInputDialog("Digite sua cidade"));
			e.setCep(Integer.parseInt(JOptionPane.showInputDialog("Digite seu CEP")));
			u.setRG(Integer.parseInt(JOptionPane.showInputDialog("Digite seu RG")));
			JOptionPane.showMessageDialog(null, "Cadastrado!");
			
			JOptionPane.showMessageDialog(null, "----------INFORMAÇÕES DO USUÁRIO---------- \n" 
			+ "Nome: "+ u.getNome() +"\n"
			+ "RG: "+ u.getRG() + "\n"
			+ "Rua: "+ e.getRua() +"\n"
			+ "Num: "+ e.getNumeroCasa() + "\n"
			+ "Cidade: "+ e.getCidade() + "\n"
			+ "CEP: "+ e.getCep() + "\n");
			
			}
			
			
		}
		
	}

}


}
