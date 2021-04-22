package ro.ase.csie.cts.g1088.dp.flyweight.clase;
import java.util.List;
import java.util.ArrayList;

public class FlyweightModel3D implements InterfataFlyweightModel3D{

	public String numeModel;
	List<Integer>puncteMode = new ArrayList<>();
	


	public FlyweightModel3D(String numeModel) {
		super();
		this.numeModel = numeModel;
	}

	@Override
	public void afisareEcran(DateEcran date) {
		System.out.println(String.format("Afisare %s la coordonatele %d, %d, %d cu %s", 
					numeModel,date.x,date.y,date.z,date.textura));
		
	}
}
