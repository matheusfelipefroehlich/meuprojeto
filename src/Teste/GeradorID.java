package Teste;

public class GeradorID {

	public static int ID = 0;
	
	public int getId() {
		 return ID;
	}
	public int setId() {
		return ID++;
	}
}
