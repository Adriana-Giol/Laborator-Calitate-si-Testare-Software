package ro.ase.csie.cts.g1088.dp.singleton;

public class ConexiuneBD {

	String ip;
	String denumire;
	
	//VERSIUNE EAGER
	//private static ConexiuneBD conexiune = new ConexiuneBD("10.0.0.1","CTS");
	
	private static ConexiuneBD conexiune = null;
	
	private ConexiuneBD(){
		
	}
	
	
	private ConexiuneBD(String ip, String denumire) {
		System.out.println("Apel constructor");
		this.ip = ip;
		this.denumire = denumire;
	}
	
	//veriune lazy
	public static synchronized ConexiuneBD getConexiune() {
		if(conexiune == null) {
			//datele se pot prelua din fisiere de configurare
			conexiune = new ConexiuneBD("10.0.0.1","CTS");
		}
		return conexiune;
	}
}
