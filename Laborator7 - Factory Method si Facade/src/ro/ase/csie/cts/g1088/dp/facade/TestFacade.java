package ro.ase.csie.cts.g1088.dp.facade;

public class TestFacade {

	public static void main(String[] args) {
		
		//1. Creacre conexiune
		ConexiuneServerJoc conexiune = new ConexiuneServerJoc();
		conexiune.conectare();
		
		//2. login player
		
		Player player = new Player();
		player.login(conexiune);
		
		//3. Obtinem profilul
		ProfilPlayer profil = player.getProfil();
		
		//4. obtinem datele
		String dateProfil = profil.getProfil();
		
		//prin Facade
		String dateProfil2 =FacadeAPIJoc.getProfil("palyer1","1234");

	}
}
