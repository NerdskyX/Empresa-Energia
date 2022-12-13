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
		int idPF = 0;
		int[] id = new int[100];
		String[] nome = new String[100];
		String[] cpfCnpj = new String[100];

		while (cont != 1) {
			cont2 = 0;
			System.out.println("------------------------");
			System.out.println("Escolha uma opção: ");
			System.out.println("1) Opções de Cliente.");
			System.out.println("2) Sair do Sistema.");
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
						idPF = idPF + 1;
						id[idPF] = idPF;
						System.out.println("Insira o nome: ");
						nome[idPF] = entrada.next();
						System.out.println("Insira o CPF: ");
						cpfCnpj[idPF] = entrada.next();
						break;
					case 2:
						idPF = idPF + 1;
						id[idPF] = idPF;
						System.out.println("Insira o nome: ");
						nome[idPF] = entrada.next();
						System.out.println("Insira o Cnpj: ");
						cpfCnpj[idPF] = entrada.next();
						break;
					case 3:
						cont2 = 1;
						break;
					}
				}
				break;
			case 2:
				cont = 1;
			}
		}

		System.out.println("voc~e saiu do sistema");

	}

}
