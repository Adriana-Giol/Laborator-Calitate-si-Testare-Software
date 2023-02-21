package ro.ase.csie.cts.g1088.dp.strategy;

public class StrategieZiuaCopilului implements IStrategieMarketing{

	@Override
	public void aplicaStategieBonus(Jucator jucator) {
		if(jucator.getClasaJucator() >5) {
			jucator.clasaJucator *= 2;
		}	System.out.println("Aplica strategie speciala");
		
	}

}
