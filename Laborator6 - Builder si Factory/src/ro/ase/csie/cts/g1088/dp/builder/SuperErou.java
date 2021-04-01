package ro.ase.csie.cts.g1088.dp.builder;

public class SuperErou {

	String nume;
	int puncteViata;

	boolean esteErouNegativ;
	boolean esteRanit;

	// SOLID D- - DIP - avem dependenta de alta clasa
	// Arma armaStanga;
	InterfataArma armaStanga;
	InterfataArma armaDreata;

	InterfataSuperPutere superPutere;
	InterfataSuperPutere superPuterePutere;

	public SuperErou(String nume, 
			int puncteViata, 
			boolean esteErouNegativ, 
			boolean esteRanit, 
			InterfataArma armaStanga,
			InterfataArma armaDreata, 
			InterfataSuperPutere superPutere, 
			InterfataSuperPutere superPuterePutere) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
		this.esteErouNegativ = esteErouNegativ;
		this.esteRanit = esteRanit;
		this.armaStanga = armaStanga;
		this.armaDreata = armaDreata;
		this.superPutere = superPutere;
		this.superPuterePutere = superPuterePutere;
	}
}
