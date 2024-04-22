package sistema;

import java.util.Scanner;

import service.HandleMenu;
import service.HandleMenuP;

public class Sistema {

	public static void main(String[] args) {
		// Criar Scanner para capturar dados
		Scanner sc = new Scanner(System.in);
		HandleMenu hm = new HandleMenu();

		HandleMenuP hmp = new HandleMenuP();
		int opcao = 0;
		do {
			// \n
			System.out.print(
					"\nUSUÁRIOS\n1 - Criar usuário \n2 - Editar usuário \n3 - Deletar usuário \n4 - Listar usuários \n5 - Listar único usuário \n6- Efetuar login \n7- Alterar Senha \n \nPRODUTOS \n8 - Criar Produto  \n9 - Editar Produto \n10 - Deletar Produto \n11 - Listar Produtos \n12 - Listar único produto \n13 - Estoque de produtos \n14 - Valor do estoque de cada produto \n15 - Sair\n");

			opcao = sc.nextInt();

			switch (opcao) {
			case 1: {
				hm.criar();
				break;
			}
			case 2: {
				hm.editar();
				break;
			}
			
			case 3: {
				hm.deletar();
				break;
			}
			case 4: {
				hm.listar();
				break;
			}
			case 5: {
				hm.listUnico();
				break;
			}
			case 6:{
				hm.login();
				break;
			}
			case 7:{
				hm.alterarSenha();
				break;
			}
			case 8: {
				hmp.criar();
				break;
			}
			case 9: {
				hmp.editar();
				break;
			}
			case 10: {
				hmp.deletar();
				break;
			}
			case 11: {
				hmp.listar();
				break;
			}
			case 12: {
				hmp.listUnico();
				break;
			}
			case 13:{
				hmp.estoqueQuantidade();
				break;
			}
			case 14:{
	           hmp.estoquePreco();
	           break;
			}
			case 15:{
				
				System.out.println("Sistema Finalizado");
			}
			default:
				System.out.println("Opção Invalida");
				break;
			}

		} while (opcao != 15);
		sc.close();

	}

}
