package Teste;

public class GeradorID {

	public static int ID = 0;
	public static  int IDPedidos;
	public static int IDItens = 0;
	
	public int getId() {
		 return ID;
	}
	public int setId() {
		return ID++;
	}

	public static int getIDPedidos() {
		return IDPedidos;
	}
	public int setIDPedidos() {
		return IDPedidos++;
	}
	public static int getIDItens() {
		return IDItens;
	}
	public int setIDItens() {
		return IDItens++;
	}
	
	
	

}
