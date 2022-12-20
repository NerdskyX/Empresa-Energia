package ghgh;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cont = 0;
		int cont2 = 0;
		int contEscolha = 0;
		int contU = 0;
		int id_PF = -1;
		int[] idPF = new int[100];
		String[] nomePF = new String[100];
		String[] cpf = new String[100];
		int uc;
		int contLeitura = 0;
		int limite;
		int id_PJ = -1;
		int[] idPJ = new int[100];
		String[] nomePJ = new String[100];
		String[] cnpj = new String[100];
		int[] ucid = new int[100];
		String cidade;
		int leituraAnterior;
		int leituraAtual;
		  
		while (cont != 1) {
			cont2 = 0;
			System.out.println("------------------------");
			System.out.println("Escolha uma opção: ");
			System.out.println("1) Opções de Cliente.");
			System.out.println("2) Informações dos clientes.");
			System.out.println("3) Sair do Sistema.");
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
				System.out.println("1) Pessoa física.");
				System.out.println("2) Pessoa jurídica.");
				System.out.println("3) Cadastrar Unidade Consumidora.");
				System.out.println("4) Voltar.");
				
				System.out.println("------------------------");
				
				contEscolha = entrada.nextInt();
				
				switch (contEscolha) {
				
				case 1:
					System.out.println("");
					System.out.println("Pessoa Física");
					
					for(int i = 0; i < (id_PF + 1); i++) {
						System.out.println("");
						System.out.println("ID: " + idPF[i]);
						System.out.println("Nome: " + nomePF[i]);
						System.out.println("CPF: " + cpf[i]);
					}
					break;
				
				case 2:
					System.out.println("");
					System.out.println("Pessoa Jurídica");
					
					for(int i = 0; i < (id_PJ + 1); i++) {
						System.out.println("");
						System.out.
						println("ID: " + idPJ[i]);
						System.out.println("Nome: " + nomePJ[i]);
						System.out.println("CPF: " + cnpj[i]);
					}
					break;
					
				case 3:

					
					while(contLeitura < 100 && limite !=4) {
					
					System.out.println("Entre com o ID da Unidade Consumidora: ");
					ucid[contLeitura] = entrada.nextInt();
					
					System.out.println("Insira a leituraAnterior ");
					leituraAnterior = entrada.nextInt();
				   
					System.out.println("Insira a leituraAtual: ");
				    leituraAtual = entrada.nextInt();
					
					
					contLeitura++;
					}
					 break;
					}
				
					
				case 4:
					break;
				}
				
			break;
			
			case 4:
				cont = 1;
			}
		
		
		System.out.println("você saiu do sistema");

	}
}
