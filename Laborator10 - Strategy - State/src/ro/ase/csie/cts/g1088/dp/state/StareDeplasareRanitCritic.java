package ro.ase.csie.cts.g1088.dp.state;

public class StareDeplasareRanitCritic implements IModDeplasare{

	@Override
	public void seMisca(SuperErou erou) {
		System.out.println(erou.nume + " nu se poate deplasa deoarece este ranit grav.");
		
	}

}
