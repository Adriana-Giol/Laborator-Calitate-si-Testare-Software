package ro.ase.csie.cts.g1088.dp.strategy;

public class StrategieJucatorNou implements IStrategieMarketing {

	
	@Override
	public void aplicaStategieBonus(Jucator jucator) {
		if(jucator.getTotalOreJucate()>100) {
			jucator.clasaJucator +=1;
			System.out.println("Aplica strategie jucator nou");
		}
	}
}
