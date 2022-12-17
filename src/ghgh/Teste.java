package ghgh;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Cliente jorge = new Cliente(1, "Jorge");
		PessoaFisica Igor = new PessoaFisica(2, "Igor", "565656");
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
		
		String nome = "";
		String cidade = "";
		String estado = "";
		String rua = "";
		String cep = "";
		int numCasa = 0;
		int idCliente = 0;

		UC[] uc = new UC[100];
		Cliente cliente = new Cliente(idCliente, nomePF[]);
		Endereco endereco = new Endereco(rua, numCasa, cidade, estado, cep);
		
		while (cont != 1) {
			cont2 = 0;
			System.out.println("------------------------");
			System.out.println("Escolha uma op��o: ");
			System.out.println("1) Op��es de Cliente.");
			System.out.println("2) Informações dos clientes.");
			System.out.println("3) Sair do Sistema.");
			System.out.println("------------------------");
			
			contEscolha = entrada.nextInt();
			
			switch (contEscolha) {
			case 1:
				while (cont2 != 1) {
					System.out.println("------------------------");
					System.out.println("Escolha uma op��o: ");
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
				System.out.println("Pessoa Física");
				
				for(int i = 0; i < )
				
				break;
				
			case 3:
				cont = 1;
			}
		}
		
		System.out.println("voc~e saiu do sistema");

	}

}
