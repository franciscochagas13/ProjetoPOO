import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

import autenticacao.GerenteAutenticacao;
import entidades.Cargo;
import entidades.Funcionario;

public class Main {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		GerenteAutenticacao ga = new GerenteAutenticacao();
		boolean sair = false;
		
		
		while (!sair) {

			int opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Login\n" + "2 - Sair do Sistema"));

			switch (opc) {
			case 1: {
				String email = JOptionPane.showInputDialog("Digite o login: ");
				String senha = JOptionPane.showInputDialog("Digite a senha: ");
				
				String usuario = ga.login(email, senha);

				if (usuario.equals("ADM")) {
					int opc1 = 0;
					opc1 = Integer.parseInt(
							JOptionPane.showInputDialog("1 - Cadastrar Funcionario \n" 
														+ "2 - Listar Funcionários"));
					switch (opc1) {
						case 1: {
								
								String login = JOptionPane.showInputDialog("Digite o login: ");
								String senha1 = JOptionPane.showInputDialog("Digite a senha: ");
								int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código (apenas números): "));
								String nome = JOptionPane.showInputDialog("Digite o nome: ");
								String dataDeNascimento = JOptionPane.showInputDialog("Digite a data de nascimento (dd/mm/aaaa): ");
								String cargo = JOptionPane.showInputDialog("Digite o cargo: ").toUpperCase();
								ga.addFuncionario(new Funcionario(login, senha1, nome, sdf.parse(dataDeNascimento),
										Cargo.valueOf(cargo), codigo));
						}
						case 2: {
							
						}
					}

				} else if (usuario.equals("FUN")) {
					System.out.println("funcionario logado");
				} else if (usuario.equals("INEXISTENTE")) {
					System.out.println("usuário inexistente");
				}

				break;
			}
			case 2: {
				sair = true;
				break;
			}
			default:
				JOptionPane.showMessageDialog(null, "Você digitou uma opção inválida!");
			}
			sc.close();
		}
	}

}
