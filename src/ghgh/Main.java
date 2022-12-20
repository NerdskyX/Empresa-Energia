package ghgh;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cont = 0;
		int cont2 = 0;
		int contEscolha = 0;
		int contU;
		int id_PF = -1;
		int[] idPF = new int[100];
		String[] nomePF = new String[100];
		String[] cpf = new String[100];
		int id_PJ = -1;
		int[] idPJ = new int[100];
		String[] nomePJ = new String[100];
		String[] cnpj = new String[100];
		int limite;
		int j = 0;
		String[] cidade = new String[100];
		int[] ucid = new int[100];
		String[] nome = new String[100];
		int[] idCliente = new int[100];
		int[] leituraAnterior = new int[100];
		int[] leituraAtual = new int[100];	

		while (cont != 1) {
			cont2 = 0;
			System.out.println("------------------------");
			System.out.println("Escolha uma opção: ");
			System.out.println("1) OpÃ§Ãµes de Cliente.");
			System.out.println("2) Exibir relatórios.");
			System.out.println("3) Cadastrar Unidade Consumidora.");
			System.out.println("4) Sair do Sistema.");
			System.out.println("------------------------");

			contEscolha = entrada.nextInt();

			switch (contEscolha) {

			case 1:

				while (cont2 != 1) {
					System.out.println("------------------------");
					System.out.println("Escolha uma opção: ");
					System.out.println("1) Cadastrar Pessoa Fisica.");
					System.out.println("2) Cadastrar Pessoa Juridica.");
					System.out.println("3) Voltar");
					System.out.println("------------------------");
					contU = entrada.nextInt();

					switch (contU) {
					case 1:
						id_PF = id_PF + 1;
						idPF[id_PF] = id_PF;
						System.out.println("Insira o nome: ");
						nomePF[id_PF] = entrada.next();
						System.out.println("Insira o CPF: ");
						cpf[id_PF] = entrada.next();

						break;

					case 2:
						id_PJ = id_PJ + 1;
						idPJ[id_PJ] = id_PJ;
						System.out.println("Insira o nome: ");
						nomePJ[id_PJ] = entrada.next();
						System.out.println("Insira o Cnpj: ");
						cnpj[id_PJ] = entrada.next();

						break;

					case 3:
						cont2 = 1;

						break;
					}
				}

				break;

			case 2:
				System.out.println("------------------------");
				System.out.println("Escolha uma opção: ");
				System.out.println("1) Informações dos clientes.");
				System.out.println("2) Imprimir faturas.");
				System.out.println("3) Voltar.");
				System.out.println("------------------------");

				contEscolha = entrada.nextInt();

				switch (contEscolha) {

				case 1:
					System.out.println("------------------------");
					System.out.println("Escolha uma opção: ");
					System.out.println("1) Pessoa física.");
					System.out.println("2) Pessoa jurídica.");
					System.out.println("3) Voltar.");
					System.out.println("------------------------");

					contEscolha = entrada.nextInt();

					switch (contEscolha) {

					case 1:
						System.out.println("");
						System.out.println("Pessoa Fisica");

						for (int i = 0; i < (id_PF + 1); i++) {
							PessoaFisica pf = new PessoaFisica(idPF[i], nomePF[i], cpf[i]);
							pf.dadosPF();
						}
						break;

					case 2:
						System.out.println("");
						System.out.println("Pessoa Juridica");

						for (int i = 0; i < (id_PJ + 1); i++) {
							PessoaJuridica pj = new PessoaJuridica(idPJ[i], nomePJ[i], cnpj[i]);
							pj.dadosPJ();
						}

						break;
					}

				case 2:
					System.out.println("------------------------");
					System.out.println("Escolha uma opção: ");
					System.out.println("1) Pessoa física.");
					System.out.println("2) Pessoa jurídica.");
					System.out.println("3) Voltar.");
					System.out.println("------------------------");

					contEscolha = entrada.nextInt();
					
					switch (contEscolha) {
					case 1:
						System.out.println("Pessoas fisicas");
						
						for(int i = 0; i < (id_PF + 1); i++) {
							Fatura fpf = new Fatura(id[i], mesAno, unidadeConsumidora);
						}
						
						break;
					 case 2:
						
						 break;
					}
			case 3:

				Scanner teclado = new Scanner(System.in);	
				

				
				while(j < 100 && limite !=4) {
				System.out.println("Entre com o ID da Unidade Consumidora: ");
				ucid[j] = teclado.nextInt();
				
				System.out.println("Entre com o id do cliente: ");
				idCliente[j] = teclado.nextInt();
				
				
				System.out.println("Entre com a Leitura Anterior: ");
				leituraAnterior[j] = teclado.nextInt();
				
				System.out.println("Entre com a Leitura Atual: ");
				leituraAtual[j] = teclado.nextInt();
				
				
				System.out.println("Digite o valor da conta corrente: ");
				Scanner valorLeitura = new Scanner(System.in);
				
				System.out.println("Se quiser que o looping acabe, digite 4: ");
				limite = teclado.nextInt();
				j++;
				
				}
				break;

			case 4:
				cont = 1;

				System.out.println("vocÃª saiu do sistema");

				break;
			}
		}
	}
	}
}