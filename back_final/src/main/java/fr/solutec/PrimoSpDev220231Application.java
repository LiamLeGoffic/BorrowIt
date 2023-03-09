package fr.solutec;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.solutec.entities.Abonnement;
import fr.solutec.entities.Administrateur;
import fr.solutec.entities.Client;
import fr.solutec.entities.Location;
import fr.solutec.entities.Objet;
import fr.solutec.entities.Utilisateur;
import fr.solutec.repository.AbonnementRepository;
import fr.solutec.repository.AdminRepository;
import fr.solutec.repository.ClientRepository;
import fr.solutec.repository.LocationRepository;
import fr.solutec.repository.ObjetRepository;

@SpringBootApplication
public class PrimoSpDev220231Application implements CommandLineRunner {

	@Autowired
	private AbonnementRepository abonnementRepos;
	@Autowired
	private ClientRepository clientRepos;
	@Autowired
	private ObjetRepository objetRepos;
	@Autowired
	private LocationRepository locationRepos;
	@Autowired
	private AdminRepository adminRepos;
	
	public static void main(String[] args) {
		SpringApplication.run(PrimoSpDev220231Application.class, args);
		System.out.println("Terminé");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("En cours");
		
		DateFormat d = new SimpleDateFormat("dd/MM/yyyy");	

		Utilisateur u1 = new Utilisateur(null, "Liam", "Le Goffic", "118 218", "moi@mail.fr", "123",  d.parse("21/05/2021"));
		String p1 = "https://imagizer.imageshack.com/img924/2994/mf5U2N.jpg";
		Client c1 = new Client(p1, 0, 0, null, u1);
		clientRepos.save(c1);
		
		Utilisateur u2 = new Utilisateur(null, "Clark", "Kent", "688 553", "super@mail.fr", "123", d.parse("11/08/2020"));
		String p2 = "https://cdn.pixabay.com/photo/2017/07/06/18/48/superman-2478978_1280.jpg";
		Client c2 = new Client(p2, 0, 0, null, u2);
		clientRepos.save(c2);
		
		Utilisateur u3 = new Utilisateur(null, "Super", "Admin", "123 456", "admin@mail.fr", "123", d.parse("11/08/2020"));
		Administrateur adm1 = new Administrateur(u3);
		adminRepos.save(adm1);
		
			
		Abonnement a1 = new Abonnement(null, null, null, d.parse("14/12/2022"), "points", c1);
		Abonnement a2 = new Abonnement(null, null, null, d.parse("18/12/2022"), "argent", c1);
		Abonnement a3 = new Abonnement(null, null, null, d.parse("19/12/2022"), "points", c1);
		
		abonnementRepos.save(a1);
		abonnementRepos.save(a2);
		abonnementRepos.save(a3);
		
		//Outils
		Objet o1 = new Objet(null, "Tournevis","https://pimdatacdn.bahco.com/media/sub637/16a10be11fad9b3f.png", "Ceci est un tournevis des plus classiques del classico de Madrid", 5, 25, "outil", null,c1);
		Objet o2 = new Objet(null, "Tournevis alien","https://m.media-amazon.com/images/I/61HVa9d-NiL._AC_SY879_.jpg", "Ceci est un tournevis alien digne de Krypton", 5, 25, "outil", null,c2);

		//Films
			
		//Livres
		Objet o3 = new Objet(null, "Berserk", "https://i.goopics.net/imjoge.jpg", "Berserk Tome 1 j'adore la bagarre", 2, 20,"livre", null,c1);
		Objet o4 = new Objet(null, "LOTR", "https://i.goopics.net/todedi.jpg", "Berserk Tome 1 j'adore la bagarre", 2, 20,"livre", null,c2);
		Objet o5 = new Objet(null, "Berserk 2", "https://i.goopics.net/56e2h1.jpg", "Berserk Tome 2 encore 1 max 2 bagarre", 2, 20,"livre", null,c2);
		Objet o6 = new Objet(null, "50 Nuances de Grey", "https://i.goopics.net/lif9er.jpg", "Berserk Tome 1 j'adore la bagarre", 2, 20,"livre", null,c1);
		Objet o7 = new Objet(null, "Berserk 25", "https://i.goopics.net/r2laf3.jpg", "Berserk Tome 1 j'adore la bagarre", 2, 20,"livre", null,c1);
		Objet o8 = new Objet(null, "Twilight", "https://i.goopics.net/k5fhfq.jpg", "Berserk Tome 1 j'adore la bagarre", 2, 20,"livre", null,c1);

		//Jeux
		Objet o9 = new Objet(null, "Elden Ring","https://i.goopics.net/zjtwki.jpg", "Elden Ring masterclass bababaaaa", 10, 80, "jeu", null,c1);
		Objet o10 = new Objet(null, "Skyrim","https://i.goopics.net/zjtwki.jpg", "Elden Ring masterclass bababaaaa", 10, 80, "jeu", null,c1);
		Objet o11 = new Objet(null, "Death Stranding","https://i.goopics.net/zjtwki.jpg", "Elden Ring masterclass bababaaaa", 10, 80, "jeu", null,c1);
		Objet o12 = new Objet(null, "Kingdom Hearths II","https://i.goopics.net/zjtwki.jpg", "Elden Ring masterclass bababaaaa", 10, 80, "jeu", null,c2);
		Objet o13 = new Objet(null, "Mario","https://i.goopics.net/zjtwki.jpg", "Elden Ring masterclass bababaaaa", 10, 80, "jeu", null,c2);
		Objet o14 = new Objet(null, "Sonic","https://i.goopics.net/zjtwki.jpg", "Elden Ring masterclass bababaaaa", 10, 80, "jeu", null,c2);
		Objet o15 = new Objet(null, "Sonic","https://pimdatacdn.bahco.com/media/sub637/16a10be11fad9b3f.png", "Elden Ring masterclass bababaaaa", 10, 80, "jeu", null,c2);

		
		objetRepos.save(o1);
		objetRepos.save(o2);
		objetRepos.save(o3);
		objetRepos.save(o4);
		objetRepos.save(o5);
		objetRepos.save(o6);
		objetRepos.save(o7);
		objetRepos.save(o8);
		objetRepos.save(o9);
		objetRepos.save(o10);
		objetRepos.save(o11);
		objetRepos.save(o12);
		objetRepos.save(o13);
		objetRepos.save(o14);
		objetRepos.save(o15);
	
		Location loc1 = new Location(null, d.parse("10/03/2023"), d.parse("12/03/2023"), null, false, o1, c1);
		Location loc2 = new Location(null, d.parse("13/03/2023"), d.parse("18/03/2023"), null, false, o3, c1);
		Location loc3 = new Location(null, d.parse("11/03/2023"), d.parse("14/03/2023"), null, false, o1, c1);
		Location loc4 = new Location(null, d.parse("12/03/2023"), d.parse("16/03/2023"), null, true, o4, c1);
		Location loc5 = new Location(null, d.parse("14/03/2023"), d.parse("19/03/2023"), null, true, o3, c1);
		Location loc6 = new Location(null, d.parse("01/03/2023"), d.parse("24/03/2023"), null, true, o1, c1);
		Location loc7 = new Location(null, d.parse("08/03/2023"), d.parse("11/03/2023"), null, true, o6, c1);
		Location loc8 = new Location(null, d.parse("07/03/2023"), d.parse("12/03/2023"), null, true, o7, c1);
		Location loc9 = new Location(null, d.parse("06/03/2023"), d.parse("06/03/2023"), null, true, o5, c1);
		Location loc10 = new Location(null, d.parse("02/03/2023"), d.parse("04/03/2023"), null, true, o3, c1);
		
		locationRepos.save(loc1);
		locationRepos.save(loc2);
		locationRepos.save(loc3);
		locationRepos.save(loc4);
		locationRepos.save(loc5);
		locationRepos.save(loc6);
		locationRepos.save(loc7);
		locationRepos.save(loc8);
		locationRepos.save(loc9);
		locationRepos.save(loc10);
		
	}
}
