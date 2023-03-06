package fr.solutec;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.solutec.entities.Abonnement;
import fr.solutec.entities.Client;
import fr.solutec.entities.Objet;
import fr.solutec.entities.Utilisateur;
import fr.solutec.repository.AbonnementRepository;
import fr.solutec.repository.ClientRepository;
import fr.solutec.repository.ObjetRepository;

@SpringBootApplication
public class PrimoSpDev220231Application implements CommandLineRunner {

	@Autowired
	private AbonnementRepository abonnementRepos;
	@Autowired
	private ClientRepository clientRepos;
	@Autowired
	private ObjetRepository objetRepos;
	
	public static void main(String[] args) {
		SpringApplication.run(PrimoSpDev220231Application.class, args);
		System.out.println("Terminé");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("En cours");
		
		Utilisateur u1 = new Utilisateur(null, "liam", "le goffic", "118 218", "moi@mail.fr", "123", null);
		Client c1 = new Client(0, 0, null, u1);
		clientRepos.save(c1);
		
		DateFormat d = new SimpleDateFormat("dd/MM/yyyy");
				
		Abonnement a1 = new Abonnement(null, null, null, d.parse("14/12/2022"), "points", c1);
		Abonnement a2 = new Abonnement(null, null, null, d.parse("18/12/2022"), "argent", c1);
		Abonnement a3 = new Abonnement(null, null, null, d.parse("19/12/2022"), "points", c1);
		
		abonnementRepos.save(a1);
		abonnementRepos.save(a2);
		abonnementRepos.save(a3);
		
		Objet o1 = new Objet(null, "Tournevis","https://pimdatacdn.bahco.com/media/sub637/16a10be11fad9b3f.png", "Ceci est un tournevis des plus classiques del classico de Madrid", 5, 25, null,c1);
		Objet o2 = new Objet(null, "Elden Ring","https://i.goopics.net/zjtwki.jpg", "Elden Ring masterclass bababaaaa", 10, 80, null,c1);
		Objet o3 = new Objet(null, "Berserk", "https://i.goopics.net/imjoge.jpg", "Berserk Tome 1 j'adore la bagarre", 2, 20, null,c1);
		objetRepos.save(o1);
		objetRepos.save(o2);
		objetRepos.save(o3);
		
	}
}
