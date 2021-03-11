package ro.ase.csie.cts.g1088.laborator3.faza2;

import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptieVechimeClient;

public class Produs {
	public static final int VECHIME_CLIENT_MAXIMA = 10;
	public static final float DISCOUNT_CLIENT_MAXIM = 0.15f;
	
	public static final validarePret(float pretInitial) throw ExceptiePretInvalid{
		if(pretInitial< )
	}
	
	
	public static void getDiscountFidelitate (int vechimeClientInAni) {
		return (vechimeClientInAni > VECHIME_CLIENT_MAXIMA) ? DISCOUNT_CLIENT_MAXIM : (float)vechimeClientInAni/100; 
	}
	
	
	public  float getPretFinal(TipProdus tipProdus, float pretInitial, int vechimeClientInAni) 
			throws ExceptiePretInvalid, ExceptieVechimeClient
	  {


		validarePret(pretInitial);
		validareVechimeClient(vechimeClientiAni);
	
		
	    float pretFinal = 0;
	    float discountFidelitate = (vechimeClientInAni > VECHIME_CLIENT_MAXIMA) ? DISCOUNT_CLIENT_MAXIM : (float)vechimeClientInAni/100; 
	    float discount = TipProdus.NOU.getDiscount();
	    float valoareDiscountTipProdus = 0;
	    
	    switch(tipProdus) {
	    case NOU:
	    	pretFinal = pretInitial;
	    	break;
	    	
	    case DISCOUNT:
	    	 discount = TipProdus.DISCOUNT.getDiscount();
	    	 valoareDiscountTipProdus = getPretCuDiscount(pretInitial, discount);
	    	 pretFinal = valoareDiscountTipProdus * 1(pretInitial - (discount * pretInitial));
	    	 break;
	    	 
	    case VECHI:
	    	 discount = TipProdus.VECHI.getDiscount();
		     pretFinal = (pretInitial - (discount * pretInitial)) - discountFidelitate * (pretInitial - (discount * pretInitial));
		     break;
		   default:
			   	throw new UnsupportedOperationException("Un simbol din enumerare nu este procesat");
	    	
	    }
	    
	    return pretFinal;
	  }
}