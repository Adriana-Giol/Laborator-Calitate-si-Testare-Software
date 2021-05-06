package ro.ase.csie.cts.g1088.dp.strategy;

public abstract class TestStrategy {

	public static void main(String[] args) {
		Jucator jucator = new Jucator(150,"Adriana",7);
				jucator.setStrategieMk(new StrategieJucatorNou());
				
				jucator.acordatPuncteBonus();
				
				jucator.setStrategieMk(new StrategieZiuaCopilului());
				
				jucator.acordatPuncteBonus();

	}

}
