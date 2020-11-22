package Teste;

public class ItensPedido {
	private String id;
	private Produto[] itens;
	
	public ItensPedido() {
		
	}
	
	public ItensPedido(String id, Produto[] itens) {
		super();
		this.id = id;
		this.itens = itens;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Produto[] getItens() {
		return itens;
	}
	public void setItens(Produto[] itens) {
		this.itens = itens;
	}

}

