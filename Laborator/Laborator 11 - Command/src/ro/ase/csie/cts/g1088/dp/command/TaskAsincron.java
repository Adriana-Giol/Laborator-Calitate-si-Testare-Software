package ro.ase.csie.cts.g1088.dp.command;

public class TaskAsincron implements ITaskAsincron{

	private IModulJoc modul = null;
	private String detalii;
   int prioritati;
   
   
   
public TaskAsincron(IModulJoc modul, String detalii, int prioritati) {
	super();
	this.modul = modul;
	this.detalii = detalii;
	this.prioritati = prioritati;
}



@Override
public void startTaskAsincron() {
	this.modul.executaTask(detalii);
	
	}
}
