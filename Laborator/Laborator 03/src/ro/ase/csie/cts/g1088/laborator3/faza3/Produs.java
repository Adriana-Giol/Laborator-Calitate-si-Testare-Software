package ro.ase.csie.cts.g1088.laborator3.faza3;

import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptieVechimeClient;
import ro.ase.csie.cts.g1088.laborator3.faza3.servicii.InterfataMarketing;
import ro.ase.csie.cts.g1088.laborator3.faza3.servicii.InterfataValidare;
import ro.ase.csie.cts.g1088.laborator3.faza3.servicii.ServiciuValidari;
import ro.ase.csie.cts.g1088.laborator3.faza3.servicii.StrategieMarketing2021;

public class Produs {
	
	//DEPENDENCY INJECTION ~ Constructor
	
	InterfataMarketing serviciuMk = null;	//new StrategieMarketing2021();
	//Validari de date 
	InterfataValidare serviciuValidare = null;	//new ServiciuValidari();
	
	
	//Varianta valida - Constructor cu parametri - pentru a schimba strategia
	public Produs(InterfataMarketing mk, InterfataValidare validare) {
	
		
		if(validare == null) {
			throw new NullPointerException();
		}
		this.setStrategieMarketing(mk);
		this.serviciuValidare = validare;
	}
	
	//Acest constructor este ascuns in constructorul de baza
	public Produs() {
		for(Object serviciu : TestProdus.servicii) {
			if(serviciu instanceof InterfataMarketing) {
				this.serviciuMk = (InterfataMarketing) serviciu;
			}
		}
		if(this.serviciuMk == null) {
			throw new NullPointerException();
		}
	}
	
	//seter
	//Aceste validari nu se externalizeaza
	public void setStrategieMarketing(InterfataMarketing strategie) {
		if(strategie == null) {
			throw new NullPointerException();
		}
		this.serviciuMk = strategie;
	}

	
	
	public static float getPretCuDiscount(float pretInitial, float discount) {
		return pretInitial - (discount * pretInitial);
	}
	
	public float getPretFinal(TipProdus tipProdus, float pretInitial, int vechimeClientInAni) 
			throws ExceptiePretInvalid, ExceptieVechimeClient
	  {
		
		serviciuValidare.validarePret(pretInitial);
		serviciuValidare.validareVechimeClient(vechimeClientInAni);
		
	    float discountFidelitate = (tipProdus == TipProdus.NOU) ? 0 : serviciuMk.getDiscountFidelitate(vechimeClientInAni); 
	    
		float discount = tipProdus.NOU.getDiscount();
    	float valoareDiscountTipProdus = getPretCuDiscount(pretInitial,discount);
    	float pretFinal = valoareDiscountTipProdus *(1 - discountFidelitate);
	    
	  
	    return pretFinal;
	  }
}