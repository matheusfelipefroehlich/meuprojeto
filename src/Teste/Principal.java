package Teste;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.UUID;


public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Produto> prod =new ArrayList();
		int opcao = 0;
		int servico;
		String lixo;
		//UUID uuid = UUID.generateUUID();
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
				//produto.setId(uuid.toString());
				GeradorID.ID++;
				System.out.println("C�digo do produto: " +GeradorID.ID);
				int codigoProduto = GeradorID.ID;
				//produto.setCodigo(sc.nextLine());
				System.out.println("Descri��o do produto");
				//lixo = sc.nextLine(); 
				String descricaoProduto = sc.nextLine();
				//produto.setDescricao(sc.nextLine());
				System.out.println("Pre�o unit�rio");
				Double precoUnitario = sc.nextDouble();
				//produto.setPrecoProduto(sc.nextDouble());
				
				//do {
					System.out.println("Informe: 1 - Para Produto | 2 - Para Servi�o");
					servico = sc.nextInt();
					boolean isService;
					if (servico == 1) {
						isService = false;
						//produto.setServico(false);
					}else { 
						isService = true;
					}
				//} while ((servico < 1) && (servico > 2));
				
				System.out.println("Quantidade de produtos");
				int qtd = sc.nextInt();
				//produto.setQuantidade(sc.nextInt());
				Produto product = new Produto(codigoProduto,descricaoProduto, precoUnitario, isService, qtd);
				prod.add(product);
				//System.out.println(prod.size());
				for(int i = 0; i < prod.size(); i++) {
				//	AJUSTAR C�DIGO PRODUTO
				System.out.println("C�digo do Produto: " + prod.get(i).getId() + " | Descri��o do Produto: " +prod.get(i).getDescricao()+
						" | Pre�o Unit�rio: " +prod.get(i).getPrecoProduto()+ " | Tipo de Cadastro: "+prod.get(i).getServico()+" | Quantidade de produtos: "+prod.get(i).getQuantidade());
			    //produto.criaListaProdutos(produto);
				}
				break;				
			}
			case 2:{
				System.out.println("----------------------------------");
					ArrayList<Pedidos> produtos = new ArrayList();
				System.out.println("PRODUTOS DISPON�VEIS:             |");
					for(int i = 0; i < prod.size(); i++) {
						//	AJUSTAR C�DIGO PRODUTO
						System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
						System.out.println("C�digo do Produto: " + prod.get(i).getId() + " | Descri��o do Produto: " +prod.get(i).getDescricao()+
								" | Pre�o Unit�rio: " +prod.get(i).getPrecoProduto()+ " | Tipo de Cadastro: "+prod.get(i).getServico()+" | Quantidade de produtos: "+prod.get(i).getQuantidade());
						System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

						System.out.println("FA�A SEU PEDIDO:                  |");
						System.out.println("----------------------------------");
						//produto.criaListaProdutos(produto);
						}
					/*for (Produto produto : prod) {
						System.out.println("Produto:"+ prod);
					}*/
					
					//Escrever codigo para a opcao  2 - Fazer Pedido
					System.out.println("Insira o c�digo do produto: ");
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
		System.out.println("Inser��o de dados inv�lido: "+e.getMessage()+" - "+e.getCause());
	}
		/*public void ListaProdutos(ArrayList prod) {
			for(int i = 0; i < prod.size(); i++) {
				//	AJUSTAR C�DIGO PRODUTO
				System.out.println("C�digo do Produto: " + prod.get(i).getId() + " | Descri��o do Produto: " +prod.get(i).getDescricao()+
						" | Pre�o Unit�rio: " +prod.get(i).getPrecoProduto()+ " | Tipo de Cadastro: "+prod.get(i).getServico()+" | Quantidade de produtos: "+prod.get(i).getQuantidade());
			    //produto.criaListaProdutos(produto);
				}*/
	}

}
