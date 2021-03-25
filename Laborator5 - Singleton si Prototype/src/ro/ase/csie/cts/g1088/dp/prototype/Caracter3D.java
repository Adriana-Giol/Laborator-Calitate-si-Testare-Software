package ro.ase.csie.cts.g1088.dp.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Caracter3D implements Cloneable{
	String fisierModel3D;
	String culoare;
	int inaltime;
	ArrayList<Integer> puncteGrafic = null;
	
	
	//Simulam ce e consumator de timp
	public Caracter3D(String fisierModel3D) {
		System.out.println("Se incarca modelul 3D din " + fisierModel3D);
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		this.fisierModel3D = fisierModel3D;
		
		Random random = new Random();
		puncteGrafic = new ArrayList<>();
		for(int i =0; i < 10; i++) {
			puncteGrafic.add(random.nextInt(1000));
		}
	
	}
	private Caracter3D() {
		
	}

	//Supradefinim ToString
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Puncte caracter 3D:");
		for(int punct: this.puncteGrafic) {
			sb.append(punct + " | ");
		}
		return sb.toString();
	}

	//Supradefinire Clone pentru ca o mostenim doar ca face Shallow Copy
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//return super.clone();				//OBLIGATORIU SCOATEM LINIA ASTA PENTRU CA CLONE FACE SHALLOW COPY
		//Caracter3D copie = new Caracter3D(this.fisierModel3D); //NU APELAM CONSTRUCTORUL ASTA ERA PROBLEMA INITIALA
		
		Caracter3D copie = new Caracter3D();
		copie.culoare = this.culoare;
		copie.fisierModel3D = this.fisierModel3D;
		copie.inaltime = this.inaltime;
		copie.puncteGrafic = (ArrayList<Integer>)this.puncteGrafic.clone();
		
			return copie;
		
	}
	
	
	
	
}
