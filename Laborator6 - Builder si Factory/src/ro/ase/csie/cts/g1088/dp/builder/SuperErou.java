package ro.ase.csie.cts.g1088.dp.builder;

public class SuperErou {

	private String nume;
	private int puncteViata;

	private boolean esteErouNegativ;
	private boolean esteRanit;

	// SOLID D- - DIP - avem dependenta de alta clasa
	// Arma armaStanga;
	private InterfataArma armaStanga;
	private InterfataArma armaDreata;

	private InterfataSuperPutere superPutere;
	private InterfataSuperPutere superPuterePutere;

	private SuperErou() {
		
	}

	private SuperErou(String nume, 
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
	
	//
	
	public static class SuperErouBuilder{
		SuperErou superErou = null; //trebuie sa o punem chiar daca nu apare in diagrama
		
		/*fara referinta de mai sus
		private String nume;
		private int puncteViata;

		private boolean esteErouNegativ;
		private boolean esteRanit;

		private InterfataArma armaStanga;
		private InterfataArma armaDreata;

		private InterfataSuperPutere superPutere;
		private InterfataSuperPutere superPuterePutere;*/
		
		public SuperErouBuilder(String nume, int puncteViata) {
			superErou = new SuperErou();
			superErou.nume = nume;
			superErou.puncteViata = puncteViata;
			
		}
		
		public SuperErouBuilder esteNegativ() {
			this.superErou.esteErouNegativ = true;
			return this;
		}
		
		public SuperErouBuilder esteRanit() {
			this.superErou.esteRanit = true;
			return this;
		}
		
		public SuperErouBuilder setArmaStanga(InterfataArma arma) {
			this.superErou.armaStanga = true;
			return this;
		}
		public SuperErouBuilder setArmaDreapta(InterfataArma arma) {
			this.superErou.armaDreapta = true;
			return this;
		}
		
		public SuperErouBuilder setSuperPutere(InterfataSuperPutere superPutere) {
			this.superErou.superPutere = superPutere;
			return this;
		}
		public SuperErouBuilder setSuperSuperPutere(InterfataSuperPutere superPutere) {
			this.superErou.superSuperPutere = superSuperPutere;
			return this;
		}
		public SuperErou build() {
			return superErou;
			
		}
	}
}
