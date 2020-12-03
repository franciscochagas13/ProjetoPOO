import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

import exceptions.LoginErrorException;
import exceptions.UsuarioNaoExisteException;
import funcionario.Cargo;
import funcionario.Funcionario;
import funcionario.GerenteFuncionarios;
import paciente.Endereco;
import paciente.GerentePacientes;
import paciente.Paciente;
import paciente.Perguntas;

public class Main {

	public static void main(String[] args) throws ParseException, UsuarioNaoExisteException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		GerenteFuncionarios ga = new GerenteFuncionarios();
		GerentePacientes gp = new GerentePacientes();

		/// TESTE
		gp.addPaciente(new Paciente("Xubilau", sdf.parse("03/03/2000"), "M", "PB",
				new Endereco("Rio Tinto", "Rua Luís", "PB", 58246000), 234234,
				new Perguntas("S", "S", "S", "S", "S", "S", "S", "S", "S", "S", "S", "S", "S", "S"), 234));
		ga.addFuncionario(new Funcionario("a", "a", "a", sdf.parse("03/03/2000"), Cargo.valueOf("MÉDICO"), 000));
		///

		boolean sair = false;

		while (!sair) {

			int opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Login\n" + "2 - Sair do Sistema"));

			switch (opc) {
			case 1: {
				String email = JOptionPane.showInputDialog("Digite o login: ");
				String senha = JOptionPane.showInputDialog("Digite a senha: ");
				try {
					String usuario = ga.login(email, senha);
					if (usuario.equals("ADM")) {
						System.out.println("ADMINISTRADOR LOGADO\n");
						int opc1 = 0;
						opc1 = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar Funcionario \n"
								+ "2 - Listar Funcionários \n" + "3 - Deletar Funcionário "));
						switch (opc1) {
						case 1: {
							String login = JOptionPane.showInputDialog("Digite o login do funcionário: ");
							String senha1 = JOptionPane.showInputDialog("Digite a senha do funcionário: ");
							int codigo = Integer.parseInt(
									JOptionPane.showInputDialog("Digite o código do funcionário (apenas números): "));
							String nome = JOptionPane.showInputDialog("Digite o nome do funcionário: ");
							String dataDeNascimento = JOptionPane
									.showInputDialog("Digite a data de nascimento do funcionário (dd/mm/aaaa): ");
							String cargo = JOptionPane.showInputDialog("Digite o cargo do funcionário: ").toUpperCase();
							ga.addFuncionario(new Funcionario(login, senha1, nome, sdf.parse(dataDeNascimento),
									Cargo.valueOf(cargo), codigo));
							break;
						}
						case 2: {
							System.out.println("LISTA DE FUNCIONÁRIOS: \n");
							ga.listarFuncionarios();
							break;
						}
						case 3: {
							int codigo = Integer.parseInt(
									JOptionPane.showInputDialog("Digite o código do funcionário que deseja excluir:"));
							try {
								if (ga.funcionarioExiste(codigo)) {
									System.out.println(ga.delFuncionario(codigo));
								}
							} catch (UsuarioNaoExisteException e) {
								System.out.println(e.getMessage());
							}							
							break;
						}
						}

					} else if (usuario.equals("FUN")) {
						boolean sair2 = false;
						while (!sair2) {
							int opc1 = 0;
							opc1 = Integer.parseInt(JOptionPane
									.showInputDialog("1 - Cadastrar Paciente \n" + "2 - Definir Prioridade \n"
											+ "3 - Ver Prioridades \n" + "4 - Alterar Prioridade \n"
											+ "5 - Ver Todos Os Pacientes \n" + "6 - Deletar Paciente "));
							switch (opc1) {
							case 1: {
								JOptionPane.showMessageDialog(null, "Digite os dados do paciente com atenção!");
								String nome = JOptionPane.showInputDialog("Digite o nome completo do paciente:");
								String dataDeNascimento = JOptionPane
										.showInputDialog("Digite a data de nascimento do paciente (dd/mm/aaaa):");
								String sexo = JOptionPane.showInputDialog("Digite o sexo do paciente (M/F): ");
								int rg = Integer.parseInt(JOptionPane.showInputDialog("Digite o RG do paciente: "));

								JOptionPane.showMessageDialog(null,
										"Agora digite os dados do endereço do paciente com atenção!");
								String rua = JOptionPane.showInputDialog(
										"Digite a rua do paciente junto com o número de sua residência:");
								int cep = Integer.parseInt(JOptionPane.showInputDialog("Digite o cep do paciente:"));
								String cidade = JOptionPane.showInputDialog("Digite a cidade do paciente:");
								String estado = JOptionPane.showInputDialog("Digite o estado do paciente:");
								int telefone = Integer
										.parseInt(JOptionPane.showInputDialog("Digite o telefone do paciente:"));

								JOptionPane.showMessageDialog(null, "Responda ao questionário clínico com atenção!");
								String pergunta1 = JOptionPane.showInputDialog("Você faz uso de bebida alcóolica?");
								String pergunta2 = JOptionPane.showInputDialog("É fumante?");
								String pergunta3 = JOptionPane.showInputDialog("Pratica atividade física?");
								String pergunta4 = JOptionPane.showInputDialog("Tem pressão alta?");
								String pergunta5 = JOptionPane.showInputDialog("Possui problemas cardíacos?");
								String pergunta6 = JOptionPane.showInputDialog("Sua taxa de colesterol é alta?");
								String pergunta7 = JOptionPane.showInputDialog("É diabético?");
								String pergunta8 = JOptionPane.showInputDialog("Você possui doença pulmonar?");
								String pergunta9 = JOptionPane.showInputDialog(
										"Usa algum tipo de medicação para o tratamento de alguma doença?");
								String pergunta10 = JOptionPane.showInputDialog("É gestante de alto risco?");
								String pergunta11 = JOptionPane.showInputDialog("Possui doenças renais?");
								String pergunta12 = JOptionPane.showInputDialog("Possui doenças hepáticas?");
								String pergunta13 = JOptionPane.showInputDialog("É obeso?");
								String pergunta14 = JOptionPane.showInputDialog("Já fez ou faz quimioterapia?");

								gp.addPaciente(new Paciente(nome, sdf.parse(dataDeNascimento), sexo, estado,
										new Endereco(cidade, rua, estado, cep), telefone,
										new Perguntas(pergunta1, pergunta2, pergunta3, pergunta4, pergunta5, pergunta6,
												pergunta7, pergunta8, pergunta9, pergunta10, pergunta11, pergunta12,
												pergunta13, pergunta14),
										rg));

								break;
							}
							case 2: {
								System.out.println("Lista de Pacientes Que Ainda Não Têm Prioridade Definida: \n");
								System.out.println(gp.listarPacientesSemPrioDefi() + "\n");

								int rg = Integer.parseInt(
										JOptionPane.showInputDialog("Digite o RG do paciente a definir prioridade: "));
								if (gp.pacienteExiste(rg)) {
									System.out.println(gp.listarPerguntas(rg));
									String prioridade = JOptionPane.showInputDialog(
											"Qual é o nível de prioridade desse paciente (VERDE/AMARELO/VERMELHO)? ");
									gp.alterarPrioridade(prioridade, rg);
									JOptionPane.showMessageDialog(null, "Prioridade Definida Com Sucesso!");
								} else {
									throw new UsuarioNaoExisteException(
											"NÃO EXISTE PACIENTE REGISTRADO COM ESTE RG!\n");
								}
								break;
							}
							case 3: {
								System.out.println("Lista de Pacientes Com Prioridade Definida: \n");
								gp.listarPacientesComPrioDefi();
								break;
							}
							case 4: {
								System.out.println("Lista de Pacientes Com Prioridade Definida: \n");
								System.out.println(gp.listarPacientesComPrioDefi() + "\n");

								int rg = Integer.parseInt(JOptionPane
										.showInputDialog("Digite o RG do paciente que deseja alterar prioridade: "));
								try {
									if (gp.pacienteExiste(rg)) {

										System.out.println(gp.listarPerguntas(rg));
										String prioridade = JOptionPane.showInputDialog(
												"Qual é o nível de prioridade desse paciente (VERDE/AMARELO/VEMERMEHO)? ");
										gp.alterarPrioridade(prioridade, rg);
										JOptionPane.showMessageDialog(null, "Prioridade Alterada Com Sucesso!");
									}
								} catch (UsuarioNaoExisteException e) {
									System.out.println(e.getMessage());
								}
								break;
							}
							case 5: {
								System.out.println("Lista de Todos Os Pacientes: \n");
								gp.listarPacientes();
								break;
							}
							case 6: {
								int rg = Integer.parseInt(
										JOptionPane.showInputDialog("Digite o RG do paciente que deseja deletar: "));
								try {
									if (gp.pacienteExiste(rg)) {

										gp.deletarPaciente(rg);
										JOptionPane.showMessageDialog(null, "Paciente Excluido Com Sucesso!");
									}
								} catch (UsuarioNaoExisteException e) {
									System.out.println(e.getMessage());
								}
								break;
							}
							case 7: {
								sair2 = true;
								break;
							}
							}
						}
					}
				} catch (LoginErrorException e) {
					System.out.println(e.getMessage());
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
