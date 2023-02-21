package ro.ase.csie.cts.g1088.dp.facade;

public class FacadeAPIJoc {
	
	//interfata simplificata pentru a obtine profilul unui jucator
	public static String getProfil(String username, String pass) {
		
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
				
				
				return dateProfil;

			}
	}
