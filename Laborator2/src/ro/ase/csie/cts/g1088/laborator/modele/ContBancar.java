package ro.ase.csie.cts.g1088.laborator.modele;

public abstract class ContBancar extends Cont{
	
	protected double balanta;
	protected String iban;

	// Supraincarcare metode getBalnata din clasa Cont
	@Override
	public double getBalanta() {
		return this.balanta;
	}
}
