package Teste;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.UUID;


public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Produto> prod =new ArrayList();
		ArrayList<ItensPedido> ListaItens = new ArrayList();
		int codigoIntes = 0;
		int opcao = 0;
		int servico;
		int finalizaPed = 0;
		String lixo;
		try {
		do {
			
			System.out.println("--------------------------------SISTEMA DE PEDIDOS-------------------------------");
			System.out.println("| 1 - Cadastrar produto | 2 - Fazer Pedido | 3 - Ver itens do pedido | 4 - Sair |");
			System.out.println("---------------------------------------------------------------------------------");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1: {
				
				System.out.println("CADASTRO DE PRODUTO");
				lixo = sc.nextLine(); 
				GeradorID.ID++;
				System.out.println("Código do produto: " +GeradorID.ID);
				int codigoProduto = GeradorID.ID;
				System.out.println("Descrição do produto");
				String descricaoProduto = sc.nextLine();
				System.out.println("Preço unitário");
				Double precoUnitario = sc.nextDouble();

					System.out.println("Informe: 1 - Para Produto | 2 - Para Serviço");
					servico = sc.nextInt();
					boolean isService;
					if (servico == 1) {
						isService = false;
					}else { 
						isService = true;
					}
				
				System.out.println("Quantidade de produtos");
				int qtd = sc.nextInt();
				Produto product = new Produto(codigoProduto,descricaoProduto, precoUnitario, isService, qtd);
				prod.add(product);
				for(int i = 0; i < prod.size(); i++) {
				//	AJUSTAR CÓDIGO PRODUTO
				System.out.println("Código do Produto: " + prod.get(i).getId() + " | Descrição do Produto: " +prod.get(i).getDescricao()+
						" | Preço Unitário: " +prod.get(i).getPrecoProduto()+ " | Tipo de Cadastro: "+prod.get(i).getServico()+" | Quantidade de produtos: "+prod.get(i).getQuantidade());
			    //produto.criaListaProdutos(produto);
				}
				break;				
			}
			case 2:{
				GeradorID.IDPedidos++;
				System.out.println("Número do pedido: " +GeradorID.IDPedidos);
				int codigoPedido = GeradorID.IDPedidos;
				System.out.println("----------------------------------");
					ArrayList<Pedidos> produtos = new ArrayList();
				System.out.println("PRODUTOS DISPONÍVEIS:             |");
					for(int i = 0; i < prod.size(); i++) {
						//	AJUSTAR CÓDIGO PRODUTO
						System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
						System.out.println("Código do Produto: " + prod.get(i).getId() + " | Descrição do Produto: " +prod.get(i).getDescricao()+
								" | Preço Unitário: " +prod.get(i).getPrecoProduto()+ " | Tipo de Cadastro: "+prod.get(i).getServico()+" | Quantidade de produtos: "+prod.get(i).getQuantidade());
						System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

						System.out.println("FAÇA SEU PEDIDO:                  |");
						System.out.println("----------------------------------");
						}

					
					//Escrever codigo para a opcao  2 - Fazer Pedido
					System.out.println("Insira o código do produto: ");
					int codigoProduto = sc.nextInt();
					System.out.println("Quantidade de produtos");
					int qtd = sc.nextInt();
					codigoProduto= codigoProduto - 1;
					double valorProduto =  prod.get(codigoProduto).getPrecoProduto();
					if (prod.get(codigoProduto).getServico() == "Produto") {
						System.out.println("Por se tratar de um produto, insira a porcentagem de desconto:");
						double porcentagemDesconto = sc.nextInt();
						porcentagemDesconto = porcentagemDesconto / 100;
						double valorDesconto =valorProduto * qtd * porcentagemDesconto;
						valorProduto = valorProduto-valorDesconto;
						System.out.println("Valor Produto: "+valorProduto);
						
						GeradorID.IDItens++;
						System.out.println("Código Item do pedido: " +GeradorID.IDItens);
						codigoIntes = GeradorID.IDItens;
					
					}
					break;
			}
			case 3:{
				System.out.println("ITENS DO PEDIDO: ");
							
				}
				
			case 4:{
				System.exit(0);
			}
			default:
				
			}
		} while (opcao != 3);
	}catch(Exception e){
		System.out.println("Inserção de dados inválido: "+e.getMessage()+" - "+e.getCause());
	}
		
	}

}
