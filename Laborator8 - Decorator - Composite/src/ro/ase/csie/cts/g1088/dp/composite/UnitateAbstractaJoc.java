package ro.ase.csie.cts.g1088.dp.composite;

public abstract class UnitateAbstractaJoc implements InterfataNPC{

	//Interfata nodurilor frunza este mostenita
	//Definim interfta specifica nodurilor copil
	
	public  void adaugaCaracter(UnitateAbstractaJoc unitate) {
			throw new UnsupportedOperationException();
	}
	
	public void stergeCaracter(UnitateAbstractaJoc unitate) {
		throw new UnsupportedOperationException();
	}
	
	public  UnitateAbstractaJoc getCaracter(int index) {
		return null;
		
	}
}
