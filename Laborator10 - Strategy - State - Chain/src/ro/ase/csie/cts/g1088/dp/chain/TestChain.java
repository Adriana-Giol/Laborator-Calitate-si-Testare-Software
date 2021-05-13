package ro.ase.csie.cts.g1088.dp.chain;

public class TestChain {

	public static void main(String[] args) {
		ModulProcesareMesajAbstract modulFiltru = new ModulFiltruRomana();
		ModulProcesareMesajAbstract modulPrivat = new ModulMesajePrivate();
	    ModulProcesareMesajAbstract modulGrup = new ModulMesajeGrup();
	    
	    modulFiltru.setNext(modulPrivat);
	    modulPrivat.setNext(modulGrup);
	    
	    ModulProcesareMesajAbstract serverChat = modulFiltru;
	    serverChat.procesareMesaj(new MesajChat("Salut", 3, "@gigel"));
	    serverChat.procesareMesaj(new MesajChat("Esti un jucator rau", 0, "@gigel"));
	    serverChat.procesareMesaj(new MesajChat("Salut tuturor!", 0, "@everyone"));

	}

}
