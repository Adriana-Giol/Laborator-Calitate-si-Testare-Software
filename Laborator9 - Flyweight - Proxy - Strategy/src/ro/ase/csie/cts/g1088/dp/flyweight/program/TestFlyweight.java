package ro.ase.csie.cts.g1088.dp.flyweight.program;

import ro.ase.csie.cts.g1088.dp.flyweight.clase.DateEcran;
import ro.ase.csie.cts.g1088.dp.flyweight.clase.InterfataFlyweightModel3D;
import ro.ase.csie.cts.g1088.dp.flyweight.clase.Model3DFactory;
import ro.ase.csie.cts.g1088.dp.flyweight.clase.TipModel3D;

public class TestFlyweight {

	public static void main(String[] args) {
		
		DateEcran soldat1 = new DateEcran(100, 50, 50, "Verde");
		DateEcran soldat2 = new DateEcran(100, 100, 50, "Rosu");
		DateEcran cladire1 = new DateEcran(10, 10, 0, "Gri");
		DateEcran cladire2 = new DateEcran(107, 150, 0, "Roz");
		
		InterfataFlyweightModel3D modelSoldat = Model3DFactory.getModel(TipModel3D.SOLDAT);
		modelSoldat.afisareEcran(soldat1);
		modelSoldat.afisareEcran(soldat2);

		Model3DFactory.getModel(TipModel3D.CLADIRE).afisareEcran(cladire1);
		Model3DFactory.getModel(TipModel3D.CLADIRE).afisareEcran(cladire2);
	}

}
