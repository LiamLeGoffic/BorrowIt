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

		Utilisateur u1 = new Utilisateur(null, "Liam", "Le Goffic", "118 218 456", "moi@mail.fr", "123",  d.parse("21/05/2021"));
		String p1 = "https://imagizer.imageshack.com/img924/2994/mf5U2N.jpg";
		Client c1 = new Client(p1, 0, 0, null, u1);
		clientRepos.save(c1);

		Utilisateur u2 = new Utilisateur(null, "Clark", "Kent", "688 534 745", "super@mail.fr", "123", d.parse("11/08/2020"));
		String p2 = "https://cdn.pixabay.com/photo/2017/07/06/18/48/superman-2478978_1280.jpg";
		Client c2 = new Client(p2, 0, 0, null, u2);
		clientRepos.save(c2);

		Utilisateur u3 = new Utilisateur(null, "Bruno", "El Bueno", "010 888", "bbueno@mail.fr", "123", d.parse("11/08/2020"));
		String p3 = "https://i.goopics.net/x92s81.png";
		Client c3 = new Client(p3, 0, 0, null, u3);
		clientRepos.save(c3);

		Utilisateur u4 = new Utilisateur(null, "Antoine", "PaGriezmann", "188 458", "APG@mail.fr", "123", d.parse("11/08/2020"));
		String p4 = "https://i.goopics.net/3g1a51.png";
		Client c4 = new Client(p4, 0, 0, null, u4);
		clientRepos.save(c4);

		Utilisateur u5 = new Utilisateur(null, "Victor", "Nappator", "608 451", "nappator@mail.fr", "123", d.parse("11/08/2020"));
		String p5 = "https://i.goopics.net/87drno.png";
		Client c5 = new Client(p5, 0, 0, null, u5);
		clientRepos.save(c5);

		Utilisateur u6 = new Utilisateur(null, "Alice", "Amusebouche", "688 553", "albouche@mail.fr", "123", d.parse("11/08/2020"));
		String p6 = "https://i.goopics.net/3cm2oe.png";
		Client c6 = new Client(p6, 0, 0, null, u6);
		clientRepos.save(c6);

		Utilisateur u7 = new Utilisateur(null, "Bob", "Bricolo", "688 553", "bricolbob@mail.fr", "123", d.parse("11/08/2020"));
		String p7 = "https://i.goopics.net/cn7u25.png";
		Client c7 = new Client(p7, 0, 0, null, u7);
		clientRepos.save(c7);

		Utilisateur u8 = new Utilisateur(null, "Carolaine", "Crocodayle", "688 553", "ccroc@mail.fr", "123", d.parse("11/08/2020"));
		String p8 = "https://i.goopics.net/mi2kbi.png";
		Client c8 = new Client(p8, 0, 0, null, u8);
		clientRepos.save(c8);

		Utilisateur u9 = new Utilisateur(null, "DJ", "DonkeyKong", "688 553", "DDK@mail.fr", "123", d.parse("11/08/2020"));
		String p9 = "https://i.goopics.net/n8bj27.jpg";
		Client c9 = new Client(p9, 0, 0, null, u9);
		clientRepos.save(c9);

		Utilisateur u10 = new Utilisateur(null, "Evelyne", "Evening", "688 553", "Eveve@mail.fr", "123", d.parse("11/08/2020"));
		String p10 = "https://i.goopics.net/rh7kjb.png";
		Client c10 = new Client(p10, 0, 0, null, u10);
		clientRepos.save(c10);

		Utilisateur u11 = new Utilisateur(null, "Frapino", "Frapuccino", "688 553", "frrrra@mail.fr", "123", d.parse("11/08/2020"));
		String p11 = "https://i.goopics.net/k9rv58.png";
		Client c11 = new Client(p11, 0, 0, null, u11);
		clientRepos.save(c11);

		Utilisateur u12 = new Utilisateur(null, "Gwen", "Gullirouge", "688 553", "gg@mail.fr", "123", d.parse("11/08/2020"));
		String p12 = "https://i.goopics.net/hjso2m.png";
		Client c12 = new Client(p12, 0, 0, null, u12);
		clientRepos.save(c12);

		Utilisateur u13 = new Utilisateur(null, "Henry", "Hughes", "688 553", "HH@mail.fr", "123", d.parse("11/08/2020"));
		String p13 = "https://i.goopics.net/3g1a51.png";
		Client c13 = new Client(p13, 0, 0, null, u13);
		clientRepos.save(c13);

		Utilisateur u14 = new Utilisateur(null, "Ilam", "Icarus", "688 553", "doubleI@mail.fr", "123", d.parse("11/08/2020"));
		String p14 = "https://i.goopics.net/7wahbk.png";
		Client c14 = new Client(p14, 0, 0, null, u14);
		clientRepos.save(c14);

		Utilisateur u15 = new Utilisateur(null, "John Jonah", "Jameson", "688 553", "JJJ@daily-bugle.com", "123", d.parse("11/08/2020"));
		String p15 = "https://i.goopics.net/t4kw9v.jpg";
		Client c15 = new Client(p15, 0, 0, null, u15);
		clientRepos.save(c15);

		Utilisateur u16 = new Utilisateur(null, "Jack", "Sparrow", "678 692 562", "pirate@mail.fr", "123", d.parse("11/07/2016"));
		String p16 = "https://cdn.vox-cdn.com/thumbor/FIAhkoPzl1H4xvod8temCqtnrLQ=/1400x1400/filters:format(jpeg)/cdn.vox-cdn.com/uploads/chorus_asset/file/21696224/jbareham_200804_ply1034_0033_potc_johnny.jpg";
		Client c16 = new Client(p16, 0, 0, null, u16);
		clientRepos.save(c16);

		Utilisateur u17 = new Utilisateur(null, "Barack", "Obama", "483 792 574", "president@mail.fr", "123", d.parse("26/01/2010"));
		String p17 = "https://www.whitehouse.gov/wp-content/uploads/2021/01/44_barack_obama.jpg";
		Client c17 = new Client(p17, 0, 0, null, u17);
		clientRepos.save(c17);

		Utilisateur u18 = new Utilisateur(null, "Sacha", "du Bourg-Palette", "743 186 275", "pokemon@mail.fr", "123", d.parse("27/12/2022"));
		String p18 = "https://img.over-blog.com/500x282/2/81/29/14/Pokemon-XY-Episode-10-Subtitle-Indonesia.jpg";
		Client c18 = new Client(p18, 0, 0, null, u18);
		clientRepos.save(c18);

		Utilisateur u19 = new Utilisateur(null, "Teddy", "Riner", "684 988 553", "judo@mail.fr", "123", d.parse("05/06/2017"));
		String p19 = "https://www.teddyriner.com/wp-content/uploads/2022/09/qui-es-tu-teddy-riner.png";
		Client c19 = new Client(p19, 0, 0, null, u19);
		clientRepos.save(c19);

		Utilisateur u101 = new Utilisateur(null, "Super", "Admin", "123 456", "admin@mail.fr", "123", d.parse("11/08/2020"));
		Administrateur adm1 = new Administrateur(u101);
		adminRepos.save(adm1);


		Abonnement a1 = new Abonnement(null, null, null, d.parse("14/12/2022"), "points", c1);
		Abonnement a2 = new Abonnement(null, null, null, d.parse("18/12/2022"), "argent", c1);
		Abonnement a3 = new Abonnement(null, d.parse("01/06/2022"), d.parse("01/06/2022"), d.parse("01/06/2023"), "points", c1);

		abonnementRepos.save(a1);
		abonnementRepos.save(a2);
		abonnementRepos.save(a3);



		//Outils
		Objet o1 = new Objet(null, "Tournevis","https://pimdatacdn.bahco.com/media/sub637/16a10be11fad9b3f.png", "Ceci est un tournevis des plus classiques del classico de Madrid", 5, 25, "outil", null,c1);
		Objet o2 = new Objet(null, "Tournevis alien","https://m.media-amazon.com/images/I/61HVa9d-NiL._AC_SY879_.jpg", "Ceci est un tournevis alien digne de Krypton", 15, 75, "outil", null,c2);
		Objet o3 = new Objet(null, "Perceuse", "https://i.goopics.net/c71hwh.jpg", "Perceuse pour bricolage", 5.0, 10.0, "Outils", null, c1);
		Objet o4 = new Objet(null, "Scie circulaire BOSCH", "https://i.goopics.net/982ia8.jpg", "Scie circulaire de la marque BOSCH pour bricolage", 6.0, 12.0, "Outils", null, c2);
		Objet o5 = new Objet(null, "Marteau", "https://i.goopics.net/yv0mzf.jpg", "Marteau pour bricolage", 2.0, 5.0, "Outils", null, c3);
		Objet o6 = new Objet(null, "Jeu d'embouts de vissage", "https://i.goopics.net/1wd6vh.jpg", "Set d'embouts pour tournevis pour bricolage. Soyez certain d'y trouver votre compte.", 1.5, 3.0, "Outils", null, c4);
		Objet o7 = new Objet(null, "Perceuse à percussion", "https://i.goopics.net/u693xi.jpg", "Perceuse à percussion pour bricolage", 8.0, 15.0, "Outils", null, c5);
		Objet o8 = new Objet(null, "Ponceuse électrique", "https://i.goopics.net/jrfqs4.jpg", "Ponceuse électrique pour bricolage", 7.0, 14.0, "Outils", null, c6);
		Objet o9 = new Objet(null, "Défonceuse", "https://i.goopics.net/44vreh.jpg", "Défonceuse pour bricolage", 9.0, 18.0, "Outils", null, c7);
		Objet o10 = new Objet(null, "Mètre ruban 20M", "https://i.goopics.net/gnnbur.jpg", "Mètre ruban de 20 mètres pour bricolage", 1.0, 2.0, "Outils", null, c8);
		Objet o11= new Objet(null, "Scie sauteuse sans fil", "https://i.goopics.net/x0bp5m.jpg", "Scie sauteuse sans fil 18V.", 5.5, 11.0, "Outils", null, c9);
		Objet o12 = new Objet(null, "Clé à molette", "https://i.goopics.net/4jrnjk.jpg", "Clé à molette avec un manche ergonomique assurant une bonne prise en main.", 2.5, 5.0, "Outils", null, c10);
		Objet o13 = new Objet(null, "Jeu de ciseaux à bois", "https://i.goopics.net/533vuv.jpg", "Jeu de ciseaux à bois pour bricolage", 3.5, 7.0, "Outils", null, c11);
		Objet o14 = new Objet(null, "Gants de travail", "https://i.goopics.net/yh52j4.jpg", "Gants de travail pour bricoler sans s'abîmer les mains.", 1.0, 1, "Outils", null, c12);


		//Films
		Objet oFilm1 = new Objet(null, "La La Land", "https://i.goopics.net/vf1w50.jpg", "Blu-Ray. Un film musical romantique sur une actrice et un musicien qui tombent amoureux à Los Angeles", 5.99, 20.0, "Films", d.parse("18/12/2022"), c13);
		Objet oFilm2 = new Objet(null, "Coffret Le Parrain", "https://i.goopics.net/prs4dl.jpg", "Blu-Ray. Un film de gangsters classique sur une famille de mafieux italo-américains", 6.99, 25.0, "Films", d.parse("18/12/2022"), c14);
		Objet oFilm3 = new Objet(null, "Forrest Gump", "https://www.example.com/forrestgump.jpg", "Blu-Ray. Un film dramatique sur un homme simple d'esprit qui traverse l'histoire américaine", 4.99, 15.0, "Films", d.parse("18/12/2022"), c15);
		Objet oFilm4 = new Objet(null, "Jurassic Park", "https://i.goopics.net/y43cqs.jpg", "Blu-Ray. Un film d'aventure sur un parc à thème rempli de dinosaures génétiquement recréés", 3.99, 10.0, "Films", d.parse("18/12/2022"), c1);
		Objet oFilm5 = new Objet(null, "Inception", "https://i.goopics.net/76r9j9.jpg", "Blu-Ray. Un film de science-fiction sur un voleur qui entre dans les rêves de ses victimes pour voler des secrets", 7.99, 30.0, "Films", d.parse("18/12/2022"), c2);
		Objet oFilm6 = new Objet(null, "Le Seigneur des anneaux (Version longue)", "https://i.goopics.net/gty9oc.jpg", "Blu-Ray. Une épopée fantastique sur un hobbit qui voyage pour détruire un anneau maléfique", 9.99, 40.0, "Films", d.parse("18/12/2022"), c3);
		Objet oFilm7 = new Objet(null, "Les Évadés", "https://i.goopics.net/on2ptj.jpg", "Blu-Ray. Un film dramatique sur deux prisonniers qui tentent de s'échapper d'une prison de haute sécurité", 4.99, 15.0, "Films", d.parse("18/12/2022"), c4);
		Objet oFilm8 = new Objet(null, "Le Silence des agneaux", "https://i.goopics.net/p3jk1e.jpg", "Blu-Ray. Un thriller psychologique sur un agent du FBI qui recherche un tueur en série cannibale", 6.99, 25.0, "Films", d.parse("18/12/2022"), c5);
		Objet oFilm9 = new Objet(null, "Titanic", "https://i.goopics.net/itr7pv.jpg", "Blu-Ray. Un film romantique sur un jeune couple qui tombe amoureux à bord du Titanic avant son naufrage", 5.99, 20.0, "Films", d.parse("18/12/2022"), c6);
		Objet oFilm10 = new Objet(null, "Interstellar", "https://i.goopics.net/eih6k4.jpg", "Blu-Ray. Un film de science-fiction sur un groupe de scientifiques qui voyagent dans l'espace pour trouver une nouvelle planète habitable", 8.99, 35.0, "Films", d.parse("18/12/2022"), c7);
		/*
		Objet oFilm11 = new Objet(null, "Le Roi Lion", "https://i.goopics.net/215fku.jpg", "Blu-Ray", 2.99, 10.0, d.parse("24/05/2011"), c8);
		Objet oFilm12 = new Objet(null, "Le Roi Lion", "https://i.goopics.net/215fku.jpg", "Blu-Ray. Un dessin animé intemporel pour enfants et adultes. A regarder en famille", 2.99, 10.0, d.parse("18/12/2021"), c8); */


		//Livres
		Objet oLiv1 = new Objet(null, "Berserk", "https://i.goopics.net/imjoge.jpg", "Berserk Tome 1 j'adore la bagarre", 2, 20,"livre", null, c1);
		Objet oLiv2 = new Objet(null, "LOTR", "https://i.goopics.net/todedi.jpg", "Berserk Tome 1 j'adore la bagarre", 2, 20,"livre", null, c2);
		Objet oLiv3 = new Objet(null, "Berserk 2", "https://i.goopics.net/56e2h1.jpg", "Berserk Tome 2 encore 1 max 2 bagarre", 2, 20,"livre", null, c2);
		Objet oLiv4 = new Objet(null, "50 Nuances de Grey", "https://i.goopics.net/lif9er.jpg", "Berserk Tome 1 j'adore la bagarre", 2, 20,"livre", null, c1);
		Objet oLiv5 = new Objet(null, "Berserk 25", "https://i.goopics.net/r2laf3.jpg", "Berserk Tome 1 j'adore la bagarre", 2, 20,"livre", null, c1);
		Objet oLiv6 = new Objet(null, "Twilight", "https://i.goopics.net/k5fhfq.jpg", "Berserk Tome 1 j'adore la bagarre", 2, 20,"livre", null, c1);
		Objet oLiv7 = new Objet(null, "Le Petit Prince", "https://i.goopics.net/uuqcbw.jpg", "Un livre de Saint-Exupéry", 2, 10, "Livres", d.parse("18/12/2022"), c3);
		Objet oLiv8 = new Objet(null, "Harry Potter à l'école des sorciers", "https://i.goopics.net/eyqglc.jpg", "Le premier livre de la série Harry Potter", 3, 15, "Livres", d.parse("18/12/2022"), c4);
		Objet oLiv9 = new Objet(null, "Le Seigneur des anneaux", "https://i.goopics.net/69tx4h.jpg", "Le premier tome de la trilogie de Tolkien", 4, 20, "Livres", d.parse("18/12/2022"), c5);
		Objet oLiv10 = new Objet(null, "Les Misérables", "https://i.goopics.net/hkzblu.jpg", "Le célèbre roman de Victor Hugo", 5, 25, "Livres", d.parse("18/12/2022"), c6);
		Objet oLiv11 = new Objet(null, "1984", "https://i.goopics.net/1qbf1u.jpg", "Le roman dystopique de George Orwell", 2, 10, "Livres", d.parse("18/12/2022"), c12);
		Objet oLiv12 = new Objet(null, "Le tour du monde en 80 jours (relié)", "https://i.goopics.net/5lj54o.jpg", "Le roman d'aventures de Jules Verne", 3, 15, "Livres", d.parse("18/12/2022"), c7);
		Objet oLiv13 = new Objet(null, "Les Trois Mousquetaires", "https://i.goopics.net/gybb5h.jpg", "Le roman d'Alexandre Dumas", 4, 20, "Livres", d.parse("18/12/2022"),c8);
		Objet oLiv14 = new Objet(null, "Le Comte de Monte-Cristo", "https://i.goopics.net/abksul.jpg", "Le roman d'aventures d'Alexandre Dumas", 5, 25, "Livres", d.parse("18/12/2022"), c9);
		Objet oLiv15 = new Objet(null, "Le Rouge et le Noir", "https://i.goopics.net/6lu5ii.jpg", "Le roman de Stendhal", 2, 10, "Livres", d.parse("18/12/2022"), c10);
		Objet oLiv16 = new Objet(null, "Madame Bovary", "https://i.goopics.net/vv3n3t.jpg", "Le roman de Gustave Flaubert", 3, 15, "Livres", d.parse("18/12/2022"), c11);


		//Jeux
		Objet oJeu1 = new Objet(null, "Elden Ring PS5","https://i.goopics.net/zjtwki.jpg", "Le jeu sensationnel de 2022. Pour les joueurs en quête de challenge.", 10, 80, "jeu", null,c1);
		Objet oJeu2 = new Objet(null, "Skyrim Xbox 360","https://i.goopics.net/zjtwki.jpg", "Skyrim version Xbox360. Contacter en mp si interessé.", 10, 80, "jeu", null,c1);
		Objet oJeu3 = new Objet(null, "Death Stranding","https://i.goopics.net/txjmbs.jpg", "Encore un classique pondu par Kojima. Une intrigue saisissante et des mécanismes de jeu subtils. Vaut définitivement le détour ! (Yoshi reste ici.)", 10, 80, "jeu", null,c1);
		Objet oJeu4 = new Objet(null, "Kingdom Hearts II PS2","https://i.goopics.net/143px5.jpg", "Jeu en bon état pour une bonne dose de nostalgie", 10, 80, "jeu", null,c2);
		Objet oJeu5 = new Objet(null, "Mario Kart 8 Deluxe","https://i.goopics.net/zbn6bx.jpg", "Cool pour une soirée jeux vidéo entre potes ou avec la famille", 10, 80, "jeu", null,c2);
		Objet oJeu6 = new Objet(null, "Sonic GENERATIONS","https://i.goopics.net/7cccuk.jpg", "Jeu Sonic Generations XBOX360. disque bon état mais boite abimée", 10, 80, "jeu", null,c2);
		Objet oJeu7 = new Objet(null, "Mario & Sonic JO","https://i.goopics.net/oyh0lf.jpg", "boite perdue disque uniquement", 10, 80, "jeu", null,c2);		
		Objet oJeu8 = new Objet(null, "Monopoly DELUXE	", "https://i.goopics.net/nnk2y4.jpg", "Le célèbre jeu de société dans sa version Deluxe. (Aucune idée de ce que ça change)", 5, 50, "Jeux", d.parse("18/12/2022"), c12);
		Objet oJeu9 = new Objet(null, "Jenga", "https://i.goopics.net/7zln9i.jpg", "l image veut pas smettre bien dsl mais bon jeu", 3, 30, "Jeux", d.parse("18/12/2022"), c13);
		Objet oJeu10 = new Objet(null, "Risk", "https://i.goopics.net/pjem3e.jpg", "Le jeu de stratégie militaire dans sa version PS2. Vous le trouverez difficilement ailleurs...", 8, 80, "Jeux", d.parse("18/12/2022"), c14);
		Objet oJeu11 = new Objet(null, "Catan", "https://i.goopics.net/1vre7k.jpg", "Le jeu de gestion de colonies", 6, 60, "Jeux", d.parse("18/12/2022"), c15);
		Objet oJeu12 = new Objet(null, "Dobble", "https://i.goopics.net/nhmskj.jpg", "Le jeu de rapidité et d'observation", 2, 20, "Jeux", d.parse("18/12/2022"), c3);
		Objet oJeu13 = new Objet(null, "Cluedo", "https://i.goopics.net/2v6a1y.jpg", "Le jeu de détective", 4, 40, "Jeux", d.parse("18/12/2022"), c4);
		Objet oJeu14 = new Objet(null, "Time's up Family", "https://i.goopics.net/1egrxc.jpg", "Le jeu de devinettes en équipe", 5, 50, "Jeux", d.parse("18/12/2022"), c5);
		Objet oJeu15 = new Objet(null, "Carte Uno 0 Rouge", "https://i.goopics.net/3qxec7.jpg", "Une unique carte du célèbre jeu. Au cas où s'il vous la manquait.", 2, 20, "Jeux", d.parse("18/12/2022"), c6);
		Objet oJeu16 = new Objet(null, "Molkky", "https://i.goopics.net/eg8r4b.jpg", "Le jeu de quilles finlandais", 3, 30, "Jeux", d.parse("18/12/2022"), c7);
		Objet oJeu17 = new Objet(null, "Puissance 4 GEANT", "https://i.goopics.net/s1e3sh.jpg", "Classique Puissance 4. Sauf qu'il est géant et qu'il n'a donc rien de classique. A essayer", 2, 20, "Jeux", d.parse("18/12/2022"), c8);
		Objet oJeu18 = new Objet(null, "Scrabble", "https://i.goopics.net/w73igr.jpg", "Le jeu de mots croisés (FR)", 4, 40, "Jeux", d.parse("18/12/2022"), c9);
		Objet oJeu19 = new Objet(null, "TabooXXL", "https://i.goopics.net/yse32x.jpg", "Le jeu de mots interdits... version XXL", 5, 50, "Jeux", d.parse("18/12/2022"), c10);

		Objet oJeu101 = new Objet(null, "Elden Ring","https://i.goopics.net/zjtwki.jpg", "Elden Ring masterclass bababaaaa", 10, 80, "jeu", null,c1);
		Objet oJeu102 = new Objet(null, "Skyrim","https://cdn-products.eneba.com/resized-products/yakiwtuy29tu0atooopm_350x200_1x-0.jpg", "The Elder Scrolls V", 10, 80, "jeu", null,c1);
		Objet oJeu103 = new Objet(null, "Death Stranding","https://cdn-products.eneba.com/resized-products/mg8JU9po5uciFgpv_C3E46qOTfA2uL6TitLc_Q_3MRA_350x200_1x-0.jpeg", "Jeu d'action dans lequel la mort fait partie intégrante du gameplay", 10, 80, "jeu", null,c1);
		Objet oJeu104 = new Objet(null, "Kingdom Hearths II","https://gamefaqs.gamespot.com/a/box/6/0/7/55607_front.jpg", "Kingdom hearts 2 est une pure merveille malgré ses bugs", 10, 80, "jeu", null,c2);
		Objet oJeu105 = new Objet(null, "New Super Mario Bros DS","https://m.media-amazon.com/images/W/IMAGERENDERING_521856-T1/images/I/91OBoUDMUKL._AC_SL1500_.jpg", "It's me Mario !", 10, 50, "jeu", null,c2);
		Objet oJeu106 = new Objet(null, "Sonic 1 SEGA","https://upload.wikimedia.org/wikipedia/en/thumb/b/ba/Sonic_the_Hedgehog_1_Genesis_box_art.jpg/220px-Sonic_the_Hedgehog_1_Genesis_box_art.jpg", "Jeu de plateforme a toute vitesse", 15, 150, "jeu", null,c2);
		Objet oJeu107 = new Objet(null, "Neverwinter Nights","https://images2.medimops.eu/product/3c25c0/M0B00009MGVF-large.jpg", "Excellent RPG basé sur D&D 3", 10, 80, "jeu", null,c2);

		//Informatique
		Objet oInfo1 = new Objet(null, "MacBook Pro 2020", "https://i.goopics.net/dt2ubm.jpg", "Ordinateur portable haut de gamme de la Pomme. Quasi intact", 50.00, 1000.00, "Informatique", d.parse("18/12/2022"), c11);
		Objet oInfo2 = new Objet(null, "Ordinateur de bureau", "https://i.goopics.net/dh23ms.jpg", "Ordinateur de bureau puissant. Idéal pour booster votre productivité.", 40.00, 800.00, "Informatique", d.parse("18/12/2022"), c12);
		Objet oInfo3 = new Objet(null, "PC portable Dell 2015", "https://i.goopics.net/y8in00.jpg", "Un ordinateur portable de marque Dell", 20, 100, "Informatique", d.parse("18/12/2022"), c13);
		Objet oInfo4 = new Objet(null, "Imprimante HP", "https://i.goopics.net/2oksw2.jpg", "Une imprimante multifonction de marque HP", 10, 50, "Informatique", d.parse("18/12/2022"), c14);
		Objet oInfo5 = new Objet(null, "Scanner Epson", "https://i.goopics.net/gzawh2.jpg", "Un scanner professionnel de marque Epson", 15, 75, "Informatique", d.parse("18/12/2022"), c15);
		Objet oInfo6 = new Objet(null, "TV connectée 4K ", "https://i.goopics.net/tjdxdd.jpg", "Une télévision connectée 4K de 55 pouces de marque LG", 30, 150, "Informatique", d.parse("18/12/2022"), c1);
		Objet oInfo7 = new Objet(null, "Souris sans fil", "https://i.goopics.net/mf1c6j.jpg", "Une souris laser sans fil et ergonomique.", 5, 25, "Informatique", d.parse("18/12/2022"), c2);		
		Objet oInfo8 = new Objet(null, "Appareil photo Canon EOS R6", "https://i.goopics.net/1khwu9.jpg", "Appareil photo professionnel Canon EOS R6. Excellent état.", 75.00, 1500.00, "Informatique", d.parse("18/12/2022"), c3);
		Objet oInfo9 = new Objet(null, "Lot de 8 ordinateurs portables HP", "https://i.goopics.net/lmyqns.jpg", "Lot de 8 PC portables HP. (Uniquement en LOT ! Inutile de demander à l'unité.)", 50, 500, "Info", d.parse("18/12/2022"), c4);
		Objet oInfo10 = new Objet(null, "iPad mini 6", "https://i.goopics.net/yp4rd0.jpg", "Une tablette compacte et performante. Pratique pour utilisation en déplacement.", 20, 200, "Info", d.parse("18/12/2022"), c5);
		Objet oInfo11 = new Objet(null, "Samsung Galaxy S10", "https://i.goopics.net/18eujp.jpg", "Le flagship 2019 du leader du marché des smartphones. Laissez-vous immerger dans un écran sans bords avec le Samsung Galaxy S10 !", 10, 100, "Info", d.parse("18/12/2022"), c6);
		Objet oInfo12 = new Objet(null, "Imprimante professionnelle", "https://i.goopics.net/z2m19v.jpg", "Une imprimante multifonctions pour le bureau", 15, 150, "Info", d.parse("18/12/2022"), c7);
		Objet oInfo13 = new Objet(null, "Casque audio Beats by Dre", "https://i.goopics.net/hlajup.jpg", "Un casque audio de qualité pour profiter de sa musique avec style", 5, 50, "Info", d.parse("18/12/2022"), c8);
		Objet oInfo14 = new Objet(null, "Enceinte connectée en forme de dent (oui, en forme de dent)", "https://i.goopics.net/9v2xwi.jpg", "Une enceinte connectée en forme de dent pour vous rappeler l'horrible douleur d'une bonne vieille rage de dent, même en écoutant votre musique", 10, 100, "Info", d.parse("18/12/2022"), c9);
		Objet oInfo15 = new Objet(null, "Appareil photo Bronica", "https://i.goopics.net/gbeuus.jpg", "Appareil photo argentique de la marque Bronica. Vous prendrez de magnifiques clichés !", 30, 300, "Info", d.parse("18/12/2022"), c10);
		Objet oInfo16 = new Objet(null, "Lecteur DVD", "https://i.goopics.net/gbeuus.jpg", "Un lecteur DVD pour regarder ses anciens films préférés", 5, 50, "Info", d.parse("18/12/2022"), c11);
		Objet oInfo17 = new Objet(null, "Routeur Wi-Fi", "https://i.goopics.net/50gzvy.jpg", "Un routeur Wi-Fi puissant pour une connexion internet rapide", 10, 100, "Info", d.parse("25/04/2022"), c12);
		Objet oInfo18 = new Objet(null, "Disque dur externe 320 Go", "https://i.goopics.net/2tisbu.jpg", "disque dur externe ssd de 320Go", 5, 50, "Info", d.parse("25/04/2022"), c13);
		Objet oInfo19 = new Objet(null, "Ecran de PC 20.7 pouces", "https://i.goopics.net/q5plvd.jpg", "Un écran d'ordinateur de 20.7 pouces. connexion HDMI", 20, 200, "Info", d.parse("25/04/2022"), c14);
		Objet oInfo20 = new Objet(null, "Clavier vintage", "https://i.goopics.net/5lx0rd.jpg", "ça passe mieux de le qualifier de vintage plutôt que de dire qu'il est juste vieux, moche et pas ergo", 10, 100, "Info", d.parse("25/04/2022"), c15);

		//Véhicules
		Objet oVeh1 = new Objet(null, "Porsche 911", "https://i.goopics.net/qc1gr5.jpg", "Voiture de sport de luxe", 500.00, 10000.00, "Véhicules", d.parse("25/04/2022"), c1);
		Objet oVeh2 = new Objet(null, "Scooter électrique", "https://i.goopics.net/m36eb3.jpg", "Scooter électrique pour la ville", 20.00, 300.00, "Véhicules", d.parse("25/04/2022"), c2);
		Objet oVeh3 = new Objet(null, "Voiture de collection Citroën", "https://i.goopics.net/w57iiq.jpg", "Voiture de collection des années 60", 200.00, 5000.00, "Véhicules", d.parse("25/04/2022"), c3);
		Objet oVeh4 = new Objet(null, "Renault Clio 4", "https://i.goopics.net/gpavnj.jpg", "Une voiture compacte de marque Renault", 30, 150, "Véhicules", d.parse("25/04/2022"), c4);
		Objet oVeh5 = new Objet(null, "Moto YAMAHA XSR 125", "https://i.goopics.net/mv7x7o.jpg", "Une moto sportive de marque Yamaha", 25, 125, "Véhicules", d.parse("25/04/2022"), c5);
		Objet oVeh6 = new Objet(null, "Vélo Homme Décathlon 26 pouces", "https://i.goopics.net/9ya613.jpg", "Un vélo de ville pour homme de marque Decathlon", 10, 50, "Véhicules", d.parse("25/04/2022"), c6);
		Objet oVeh7 = new Objet(null, "Scooter Xiaomi", "https://i.goopics.net/t16dhn.jpg", "Un scooter électrique de marque Xiaomi", 15, 75, "Véhicules", d.parse("25/04/2022"), c7);
		Objet oVeh8 = new Objet(null, "Camping-car VW", "https://i.goopics.net/mw5bsy.jpg", "Un camping-car familial de marque Volkswagen", 200, 1000, "Véhicules", d.parse("25/04/2022"), c8);
		Objet oVeh9 = new Objet(null, "Bass Tracker TX 190", "https://i.goopics.net/h3bq76.jpg", "Un bateau de pêche en aluminium de marque Bass Tracker", 150, 750, "Véhicules", d.parse("25/04/2022"), c9);
		Objet oVeh10 = new Objet(null, "Avion 1998 Cessna 172", "https://i.goopics.net/7s6yvf.jpg", "Un petit avion monomoteur de marque Cessna", 500, 2500, "Véhicules", d.parse("25/04/2022"), c10);
		Objet oVeh11 = new Objet(null, "Hélicoptère", "https://i.goopics.net/fn576l.jpg", "Un hélicoptère de tourisme de marque Robinson", 1000, 5000, "Véhicules", d.parse("25/04/2022"), c11);
		Objet oVeh12 = new Objet(null, "Vélo électrique Xiaomi", "https://i.goopics.net/7wqetf.jpg", "Un vélo électrique pliable de marque Xiaomi", 15, 75, "Véhicules", d.parse("25/04/2022"), c12);
		Objet oVeh13 = new Objet(null, "Quad", "https://i.goopics.net/ukoyco.jpg", "Un quad tout-terrain de marque Yamaha", 50, 250, "Véhicules", d.parse("25/04/2022"), c13);
		Objet oVeh14 = new Objet(null, "Skateboard électrique Curve V4 7A.h", "https://i.goopics.net/eeyd8g.jpg", "Le skateboard électrique idéal pour les formateurs de jeunes développeurs. Allant jusquà 38 km/h !", 5, 25, "Véhicules", d.parse("25/04/2022"), c14);	

		//Mode
		Objet oMode1 = new Objet(null, "Robe de soirée", "https://i.goopics.net/ox3pck.jpg", "Robe de soirée élégante", 30.00, 500.00, "Mode", d.parse("05/03/2022"), c15);
		Objet oMode2 = new Objet(null, "Pochette Prada", "https://i.goopics.net/38ooq9.jpg", "Pochette élégante de la marque Prada", 10.00, 200.00, "Mode", d.parse("05/03/2022"), c1);
		Objet oMode3 = new Objet(null, "Sac à main LV", "https://i.goopics.net/jq8iwf.jpg", "Un sac à main en cuir de marque Louis Vuitton", 20, 100, "Mode", d.parse("05/03/2022"), c2);
		Objet oMode4 = new Objet(null, "Montre ROLEX", "https://i.goopics.net/w4idrr.jpg", "Une montre pour homme de marque Rolex. Inutile de vous présenter la marque...", 30, 150, "Mode", d.parse("05/03/2022"), c3);
		Objet oMode5 = new Objet(null, "Lunettes de soleil", "https://i.goopics.net/gnlytw.jpg", "Une paire de lunettes de soleil de marque Ray-Ban", 10, 50, "Mode", d.parse("05/03/2022"), c4);
		Objet oMode6 = new Objet(null, "Veste en cuir", "https://i.goopics.net/fxs37c.jpg", "Une veste en cuir pour femme de marque Zara", 15, 75, "Mode", d.parse("05/03/2022"), c5);
		Objet oMode7 = new Objet(null, "Baskettes Adidas", "https://i.goopics.net/jegvyw.jpg", "Une paire de chaussures de sport de marque Adidas", 20, 100, "Mode", d.parse("05/03/2022"), c6);
		Objet oMode8 = new Objet(null, "Robe d'été", "https://i.goopics.net/zkguov.jpg", "Une robe d'été pour femme (et homme, pourquoi pas ?) de marque H&M", 25, 125, "Mode", d.parse("05/03/2022"), c7);
		Objet oMode9 = new Objet(null, "Chemise", "https://i.goopics.net/mxwht2.jpg", "Une chemise à rayures verticales assez classique", 15, 75, "Mode", d.parse("05/03/2022"), c8);
		Objet oMode10 = new Objet(null, "Pantalon taille basse Levi's (femme)", "https://i.goopics.net/5vbs86.jpg", "Un pantalon pour femme de marque Levi's", 20, 100, "Mode", d.parse("05/03/2022"), c9);
		Objet oMode11 = new Objet(null, "Bottes noires UGG", "https://i.goopics.net/nzjk29.jpg", "Tiennent chaud", 30, 150, "Mode", d.parse("05/03/2022"), c10);
		Objet oMode12 = new Objet(null, "Sac à dos North Face 40L", "https://i.goopics.net/d605m3.jpg", "Un sac à dos à grande capacité de	 marque North Face", 10, 50, "Mode", d.parse("05/03/2022"), c11);
		Objet oMode13 = new Objet(null, "Lot de 11 cravates", "https://i.goopics.net/uo5pcg.jpg", "Lot de 11 cravates, histoire d'être sûr d'en avoir plus d'une par jour...", 10, 50, "Mode", d.parse("05/03/2022"), c12);

		//Immobilier
		Objet oImmo1 = new Objet(null, "Appartement T3", "https://i.goopics.net/7kyt5i.jpg", "Appartement avec 3 chambres et cheminée", 80.00, 1500.00, "Immobilier", d.parse("15/06/2022"), c13);
		Objet oImmo2 = new Objet(null, "Appartement 3 chambres", "https://i.goopics.net/klojxu.jpg", "Un appartement spacieux de 3 chambres", 100, 500, "Immobilier", d.parse("15/06/2022"), c14);
		Objet oImmo3 = new Objet(null, "Maison de vacances", "https://i.goopics.net/x1nvuc.jpg", "Une maison moderne avec piscine et jardin à proximité de la plage.", 200, 1000, "Immobilier", d.parse("15/06/2022"), c15);
		Objet oImmo4 = new Objet(null, "Studio en centre-ville", "https://i.goopics.net/369xim.jpg", "Un petit studio confortable pour une personne. Situé au coeur de la ville.", 50, 250, "Immobilier", d.parse("15/06/2022"), c1);        
		Objet oImmo5 = new Objet(null, "Appartement haussmannien", "https://i.goopics.net/uv0whp.jpg", "Un appartement de 3 pièces à Paris", 80, 1000, "Immobilier", d.parse("15/06/2022"), c2);
		Objet oImmo6 = new Objet(null, "Garde-meuble sur Paris", "https://i.goopics.net/bwhqjn.jpg", "Un local de 15m² pour stocker vos biens que vous ne pouvez pas garder chez vous.", 120, 2000, "Immobilier", d.parse("15/06/2022"), c3);
		Objet oImmo7 = new Objet(null, "Studio d'enregistrement", "https://i.goopics.net/udw9m1.jpg", "Un petit studio équipé à louer pour produire votre art.", 50, 500, "Immobilier", d.parse("15/06/2022"), c4);
		Objet oImmo8 = new Objet(null, "Villa moderne", "https://i.goopics.net/syxe98.jpg", "Une villa avec piscine sur la Côte d'Azur", 500, 5000, "Immobilier", d.parse("15/06/2022"), c5);
		Objet oImmo9 = new Objet(null, "Bureau de travail blanc", "https://i.goopics.net/ast6h9.jpg", "Prend de la place inutilement chez moi... Pourrait tout de même vous être utile !!", 70, 700, "Immobilier", d.parse("15/06/2022"), c6);
		Objet oImmo10 = new Objet(null, "Place de parking", "https://i.goopics.net/qf4qdv.jpg", "Une place de parking sécurisée dans le XIIIe arrondissement à louer", 10, 100, "Immobilier", d.parse("15/06/2022"), c7);
		Objet oImmo11 = new Objet(null, "Chambre", "https://i.goopics.net/lh7iyd.jpg", "Une chambre dans un appartement partagé à louer", 30, 300, "Immobilier", d.parse("15/06/2022"), c8);
		Objet oImmo12 = new Objet(null, "Loft", "https://i.goopics.net/lh7iyd.jpg", "Un loft spacieux à louer pour un événement ou simplement pour se détendre", 200, 2000, "Immobilier", d.parse("15/06/2022"), c9);
		Objet oImmo13 = new Objet(null, "Maison de ville", "https://i.goopics.net/w0fqzb.jpg", "Une maison de ville avec jardin en centre-ville", 100, 1500, "Immobilier", d.parse("15/06/2022"), c10);
		Objet oImmo14 = new Objet(null, "Entrepôt", "https://i.goopics.net/igctpd.jpg", "Un entrepôt à louer pour stockage", 300, 3000, "Immobilier", d.parse("15/06/2022"), c11);
		Objet oImmo15 = new Objet(null, "Terrain", "https://i.goopics.net/t9ie3v.jpg", "Un terrain à louer pour événement en plein air", 50, 500, "Immobilier", d.parse("15/06/2022"), c12);


		//Musique
		Objet oMus1 = new Objet(null, "Guitare électrique", "https://i.goopics.net/6jf8kk.jpg", "Une guitare électrique de la marque Fender", 10, 100, "Musique", d.parse("29/10/2022"), c13);
		Objet oMus2 = new Objet(null, "Ampli basse", "http://example.com/ampli-basse.jpg", "Un amplificateur pour basse de la marque Marshall", 15, 150, "Musique", d.parse("29/10/2022"), c14);
		Objet oMus3 = new Objet(null, "Microphone", "https://i.goopics.net/t57xrq.jpg", "Un microphone professionnel de la marque Shure", 20, 200, "Musique", d.parse("29/10/2022"), c15);
		Objet oMus4 = new Objet(null, "Piano à queue", "https://i.goopics.net/qf3jjk.jpg", "Un piano à queue Steinway & Sons", 50, 500, "Musique", d.parse("29/10/2022"), c1);
		Objet oMus5 = new Objet(null, "Guitare électrique", "https://i.goopics.net/7e7wl8.jpg", "Une guitare électrique de marque Fender", 20, 200, "Musique", d.parse("29/10/2022"), c2);
		Objet oMus6 = new Objet(null, "Basse", "https://i.goopics.net/jedngi.jpg", "Une basse de marque Gibson", 25, 250, "Musique", d.parse("29/10/2022"), c3);
		Objet oMus7 = new Objet(null, "Piano", "https://i.goopics.net/bb9n4a.jpg", "Un piano droit Yamaha en excellent état", 40, 400, "Musique", d.parse("29/10/2022"), c4);
		Objet oMus8 = new Objet(null, "Synthétiseur", "https://i.goopics.net/8u7xlk.jpg", "Un synthétiseur numérique de marque Korg", 30, 300, "Musique", d.parse("29/10/2022"), c5);
		Objet oMus9 = new Objet(null, "Batterie", "https://i.goopics.net/yqa12t.jpg", "Une batterie acoustique de marque Pearl", 50, 500, "Musique", d.parse("29/10/2022"), c6);
		Objet oMus10 = new Objet(null, "Saxophone", "https://i.goopics.net/7p01le.jpg", "Un saxophone alto de marque Selmer", 35, 350, "Musique", d.parse("29/10/2022"), c7);
		Objet oMus11 = new Objet(null, "Microphone", "https://i.goopics.net/ucglin.jpg", "Un microphone à condensateur de marque Neumann", 10, 100, "Musique", d.parse("29/10/2022"), c8);
		Objet oMus12 = new Objet(null, "Amplificateur", "https://i.goopics.net/21ahhy.jpg", "Un amplificateur de guitare de marque Marshall", 15, 150, "Musique", d.parse("29/10/2022"), c9);
		Objet oMus13 = new Objet(null, "Enceintes", "https://i.goopics.net/9oro6a.jpg", "Une paire d'enceintes de monitoring de marque KRK", 20, 200, "Musique", d.parse("29/10/2022"), c10);
		Objet oMus14 = new Objet(null, "Clarinette", "https://i.goopics.net/6j9m8c.jpg", "Une clarinette en si bémol de marque Buffet Crampon", 30, 300, "Musique", d.parse("29/10/2022"), c11);
		Objet oMus15 = new Objet(null, "Violon", "https://i.goopics.net/v85ved.jpg", "Un violon en bois massif de marque Stradivarius", 50, 500, "Musique", d.parse("29/10/2022"), c12);
		Objet oMus16 = new Objet(null, "Mélodica", "https://i.goopics.net/e6c36w.jpg", "Un mélodica à 37 touches de marque Yamaha", 5, 50, "Musique", d.parse("29/10/2022"), c13);


		//Autre
		Objet oAutre1 = new Objet(null, "Sabre pirate","https://www.boutique-epees.fr/11840-large_default/pirates-des-caraibes-l-ile-de-sabre.jpg", "En acier, très tranchant", 50, 680, "autre", d.parse("01/06/2022"),c16);


		//Save Outils
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


		//Save Films
		objetRepos.save(oFilm1);
		objetRepos.save(oFilm2);
		objetRepos.save(oFilm3);
		objetRepos.save(oFilm4);
		objetRepos.save(oFilm5);
		objetRepos.save(oFilm6);
		objetRepos.save(oFilm7);
		objetRepos.save(oFilm8);
		objetRepos.save(oFilm9);
		objetRepos.save(oFilm10);


		//Save Livres
		objetRepos.save(oLiv1);
		objetRepos.save(oLiv2);
		objetRepos.save(oLiv3);
		objetRepos.save(oLiv4);
		objetRepos.save(oLiv5);
		objetRepos.save(oLiv6);
		objetRepos.save(oLiv7);
		objetRepos.save(oLiv8);
		objetRepos.save(oLiv9);
		objetRepos.save(oLiv10);
		objetRepos.save(oLiv11);
		objetRepos.save(oLiv12);
		objetRepos.save(oLiv13);
		objetRepos.save(oLiv14);
		objetRepos.save(oLiv15);
		objetRepos.save(oLiv16);

		//Save Jeux
		objetRepos.save(oJeu1);
		objetRepos.save(oJeu2);
		objetRepos.save(oJeu3);
		objetRepos.save(oJeu4);
		objetRepos.save(oJeu5);
		objetRepos.save(oJeu6);
		objetRepos.save(oJeu7);
		objetRepos.save(oJeu8);
		objetRepos.save(oJeu9);
		objetRepos.save(oJeu10);
		objetRepos.save(oJeu11);
		objetRepos.save(oJeu12);
		objetRepos.save(oJeu13);
		objetRepos.save(oJeu14);
		objetRepos.save(oJeu15);
		objetRepos.save(oJeu16);
		objetRepos.save(oJeu17);
		objetRepos.save(oJeu18);
		objetRepos.save(oJeu19);
		
		objetRepos.save(oJeu101);
		objetRepos.save(oJeu102);
		objetRepos.save(oJeu103);
		objetRepos.save(oJeu104);
		objetRepos.save(oJeu105);
		objetRepos.save(oJeu105);
		objetRepos.save(oJeu106);
		objetRepos.save(oJeu107);
		
		//Save Informatique
		objetRepos.save(oInfo1);
		objetRepos.save(oInfo2);
		objetRepos.save(oInfo3);
		objetRepos.save(oInfo4);
		objetRepos.save(oInfo5);
		objetRepos.save(oInfo6);
		objetRepos.save(oInfo7);
		objetRepos.save(oInfo8);
		objetRepos.save(oInfo9);
		objetRepos.save(oInfo10);
		objetRepos.save(oInfo11);
		objetRepos.save(oInfo12);
		objetRepos.save(oInfo13);
		objetRepos.save(oInfo14);
		objetRepos.save(oInfo15);
		objetRepos.save(oInfo16);
		objetRepos.save(oInfo17);
		objetRepos.save(oInfo18);
		objetRepos.save(oInfo19);
		objetRepos.save(oInfo20);



		//Save Vehicules
		objetRepos.save(oVeh1);
		objetRepos.save(oVeh2);
		objetRepos.save(oVeh3);
		objetRepos.save(oVeh4);
		objetRepos.save(oVeh5);
		objetRepos.save(oVeh6);
		objetRepos.save(oVeh7);
		objetRepos.save(oVeh8);
		objetRepos.save(oVeh9);
		objetRepos.save(oVeh10);
		objetRepos.save(oVeh11);
		objetRepos.save(oVeh12);
		objetRepos.save(oVeh13);
		objetRepos.save(oVeh14);

		//Save Mode
		objetRepos.save(oMode1);
		objetRepos.save(oMode2);
		objetRepos.save(oMode3);
		objetRepos.save(oMode4);
		objetRepos.save(oMode5);
		objetRepos.save(oMode6);
		objetRepos.save(oMode7);
		objetRepos.save(oMode8);
		objetRepos.save(oMode9);
		objetRepos.save(oMode10);
		objetRepos.save(oMode11);
		objetRepos.save(oMode12);
		objetRepos.save(oMode13);

		//Save Immobilier
		objetRepos.save(oImmo1);
		objetRepos.save(oImmo2);
		objetRepos.save(oImmo3);
		objetRepos.save(oImmo4);
		objetRepos.save(oImmo5);
		objetRepos.save(oImmo6);
		objetRepos.save(oImmo7);
		objetRepos.save(oImmo8);
		objetRepos.save(oImmo9);
		objetRepos.save(oImmo10);
		objetRepos.save(oImmo11);
		objetRepos.save(oImmo12);
		objetRepos.save(oImmo13);
		objetRepos.save(oImmo14);
		objetRepos.save(oImmo15);

		//Save Musique
		objetRepos.save(oMus1);
		objetRepos.save(oMus2);
		objetRepos.save(oMus3);
		objetRepos.save(oMus4);
		objetRepos.save(oMus5);
		objetRepos.save(oMus6);
		objetRepos.save(oMus7);
		objetRepos.save(oMus8);
		objetRepos.save(oMus9);
		objetRepos.save(oMus10);
		objetRepos.save(oMus11);
		objetRepos.save(oMus12);
		objetRepos.save(oMus13);
		objetRepos.save(oMus14);
		objetRepos.save(oMus15);
		objetRepos.save(oMus16);

		objetRepos.save(oAutre1);

		Location loc1 = new Location(null, d.parse("10/03/2023"), d.parse("12/03/2023"), null, false, false, o1, c1);
		Location loc2 = new Location(null, d.parse("13/03/2023"), d.parse("18/03/2023"), null, false, false, o3, c1);
		Location loc3 = new Location(null, d.parse("11/03/2023"), d.parse("14/03/2023"), null, false, false, o1, c1);
		Location loc4 = new Location(null, d.parse("12/03/2023"), d.parse("16/03/2023"), null, true, false, o4, c1);
		Location loc5 = new Location(null, d.parse("14/03/2023"), d.parse("19/03/2023"), null, true, false, o3, c1);
		Location loc6 = new Location(null, d.parse("01/03/2023"), d.parse("24/03/2023"), null, true, true, o1, c1);
		Location loc7 = new Location(null, d.parse("08/03/2023"), d.parse("11/03/2023"), null, true, true, o6, c1);
		Location loc8 = new Location(null, d.parse("07/03/2023"), d.parse("12/03/2023"), null, true, true, o7, c1);
		Location loc9 = new Location(null, d.parse("06/03/2023"), d.parse("06/03/2023"), null, true, true, o5, c1);
		Location loc10 = new Location(null, d.parse("02/03/2023"), d.parse("04/03/2023"), null, true, true, o3, c1);

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
