package service;

import java.util.List;
import java.util.Scanner;

import models.Produto;
import utils.GerenciadorEstoque;

public class HandleMenuP {
	Scanner sc = new Scanner(System.in);
	GerenciadorEstoque ge = new GerenciadorEstoque();

	public HandleMenuP() {
		ge.verificaECria("estoque.txt");
	}

	public void criar() {
		
		System.out.println("Digite o nome do Produto: ");
		String nome = sc.next();

		System.out.println("Digite o preço do Produto:");
		double preco = sc.nextDouble();

		System.out.println("Digite a quantidade de Produtos:");
		int quantidade = sc.nextInt();

		long id = getNextId();

		Produto p = new Produto(id, nome, preco, quantidade);
		
		ge.adicionarProduto(p);
		
		

	}
	

	public void editar() {
		System.out.println("Digite o ID do usuario:");
		long id = sc.nextLong();

		System.out.println("Digite o novo nome do produto:");
		String nome = sc.next();

		System.out.println("Digite o novo preço do produto:");
		double preco = sc.nextDouble();

		System.out.println("Digite a nova quantidade de produtos:");
		int quantidade = sc.nextInt();

		ge.editarProduto(id, nome, preco, quantidade);
	}

	public void deletar() {
		System.out.println("Digite o ID do usuario a ser deletado:");
		long id = sc.nextInt();
		ge.deletarProduto(id);
	}

	public void listar() {
		ge.listarProdutos();
	}

	private long getNextId() {
		List<Produto> produtos = ge.lerProdutos();
		long maxId = 0;

		for (Produto produto : produtos) {
			long id = produto.getId();
			if (id > maxId) {

				maxId = id;

			}
		}

		return maxId + 1;
	}

	public void listUnico() {
		System.out.println("Digite o ID do usuário");
		long id = sc.nextLong();
		ge.locUsuario(id);
	}
	public void estoquePreco() {
	
		 System.out.println("Calculando soma dos preços de cada produto");
		    ge.valorEstoque();
	}
	public void estoqueQuantidade() {
		ge.estoque(); 

		}

	}

	

	


