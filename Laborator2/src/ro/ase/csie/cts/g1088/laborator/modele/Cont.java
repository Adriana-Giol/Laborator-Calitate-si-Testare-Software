package ro.ase.csie.cts.g1088.laborator.modele;

public abstract class Cont {
	public abstract double getBalanta();
	public abstract void alimenteaza(Double valoare);
	public abstract void extrage(Double valoare)throws ExceptieFonduriInsuficiente;
	public abstract void transfer(Cont destinatie, Double valoare);
	
}
