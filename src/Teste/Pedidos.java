package Teste;

public class Pedidos {
	private String id;
	private Produto[] produto;
	private double valorTotal;
	
	
	
	public Pedidos(String id, Produto[] produto, double valorTotal) {
		super();
		this.id = id;
		this.produto = produto;
		this.valorTotal = valorTotal;
	}
	public Pedidos() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Produto[] getProduto() {
		return produto;
	}
	public void setProduto(Produto[] produto) {
		this.produto = produto;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	

}
