package ro.ase.csie.cts.g1088.dp.strategy;

public class Jucator {
	int totalOreJucate;
	String nume;
    int clasaJucator;
	
	IStrategieMarketing strategieMk = null;

	public Jucator(int totalOreJucate, String nume, int clasaJucator) {
		super();
		this.totalOreJucate = totalOreJucate;
		this.nume = nume;
		this.clasaJucator = clasaJucator;
	}

	public int getTotalOreJucate() {
		return totalOreJucate;
	}



	public String getNume() {
		return nume;
	}



	public int getClasaJucator() {
		return clasaJucator;
	}



	public void setStrategieMk(IStrategieMarketing strategieMk) {
		this.strategieMk = strategieMk;
	}



	public void acordatPuncteBonus() {
		if(this.strategieMk!= null) {
			this.strategieMk.aplicaStategieBonus(this);
		}else {
			throw new UnsupportedOperationException();
		}
	}
}
