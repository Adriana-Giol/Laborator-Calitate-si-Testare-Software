package ro.ase.csie.cts.g1088.laborator.modele;

public abstract class ContBancar extends Cont{
	
	protected double balanta;
	protected String iban;
	
	// Implementare Constructor cu Parametri
	public ContBancar(double balanta, String iban) {
		this.balanta = balanta;
		this.iban = iban;
	}

	// Supradefinirea metodei getBalanta din clasa Cont
	@Override
	public double getBalanta() {
		return this.balanta;
	}
}
