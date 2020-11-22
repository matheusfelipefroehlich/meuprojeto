package Teste;

import java.util.ArrayList;

public class Produto {
	private static int id = 1;
	private String descricao;
	private double precoProduto;
	private boolean servico;
	private int quantidade;
	
	
	
		
	public Produto(int id, String descricao, double precoProduto, boolean servico, int quantidade) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.precoProduto = precoProduto;
		this.servico = servico;
		this.quantidade = quantidade;
	}

	public int getId() {
		
		 return id;
	}
	public int setId() {
		return id++;
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}
	public String getServico() {
		if(servico = true) {
			return "Produto";
			}else{
			return "Serviço";
		}
	}
	public void setServico(boolean servico) {
		this.servico = servico;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void ListaPedidos() {
		
	}
	public void criaListaProdutos(Produto prod) {	
		/*ArrayList<Produto> listaProd = new ArrayList<>();
		listaProd.add(prod);
		for (int i = 0; i < listaProd.size(); i++) {
			System.out.println(prod.descricao);
			System.out.println(prod.precoProduto);
			System.out.println(prod.quantidade);
			System.out.println(prod.servico);
		}*/
	}
	
	public void ListarProduto() {
		
	}
	
	
}
