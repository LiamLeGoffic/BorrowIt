package fr.solutec;

import java.util.ArrayList;
import java.util.Arrays;

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
		
		Abonnement a1 = new Abonnement(null, null, null, "points");
		Abonnement a2 = new Abonnement(null, null, null, "argent");
		Abonnement a3 = new Abonnement(null, null, null, "points");
		
		abonnementRepos.save(a1);
		abonnementRepos.save(a2);
		abonnementRepos.save(a3);
		
		Utilisateur u1 = new Utilisateur(null, "liam", "le goffic", "118 218", "moi@mail.fr", "123", null);
		Client c1 = new Client(0, 0, null, new ArrayList<Abonnement>(Arrays.asList(a1, a2, a3)), null, u1);
		clientRepos.save(c1);
		
		Objet o1 = new Objet(null, "Outil", 5, 25, null,c1);
		Objet o2 = new Objet(null, "Jeu", 10, 80, null,c1);
		Objet o3 = new Objet(null, "Livre", 2, 20, null,c1);
		objetRepos.save(o1);
		objetRepos.save(o2);
		objetRepos.save(o3);
		
	}
}
