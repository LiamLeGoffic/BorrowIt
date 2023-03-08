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
		
		DateFormat d = new SimpleDateFormat("dd/MM/yyyy");	
		
		Utilisateur u1 = new Utilisateur(null, "Liam", "Le Goffic", "118 218", "moi@mail.fr", "123",  d.parse(null));
		String p1 = "https://images.unsplash.com/photo-1575936123452-b67c3203c357?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8aW1hZ2V8ZW58MHx8MHx8&auto=format&fit=crop&w=400&q=60";
		Client c1 = new Client(p1, 0, 0, null, u1);
		clientRepos.save(c1);
		
		Utilisateur u2 = new Utilisateur(null, "Clark", "Kent", "688 553", "super@mail.fr", "123", d.parse(null));
		String p2 = "data:image/png;base64,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";
		Client c2 = new Client(p2, 0, 0, null, u2);
		clientRepos.save(c2);
			
		Abonnement a1 = new Abonnement(null, null, null, d.parse("14/12/2022"), "points", c1);
		Abonnement a2 = new Abonnement(null, null, null, d.parse("18/12/2022"), "argent", c1);
		Abonnement a3 = new Abonnement(null, null, null, d.parse("19/12/2022"), "points", c1);
		
		abonnementRepos.save(a1);
		abonnementRepos.save(a2);
		abonnementRepos.save(a3);
		
		Objet o1 = new Objet(null, "Tournevis","https://pimdatacdn.bahco.com/media/sub637/16a10be11fad9b3f.png", "Ceci est un tournevis des plus classiques del classico de Madrid", 5, 25, "outil", null,c1);
		Objet o2 = new Objet(null, "Elden Ring","https://i.goopics.net/zjtwki.jpg", "Elden Ring masterclass bababaaaa", 10, 80, "jeu", null,c1);
		Objet o3 = new Objet(null, "Berserk", "https://i.goopics.net/imjoge.jpg", "Berserk Tome 1 j'adore la bagarre", 2, 20,"livre", null,c1);
		objetRepos.save(o1);
		objetRepos.save(o2);
		objetRepos.save(o3);
		
	}
}
