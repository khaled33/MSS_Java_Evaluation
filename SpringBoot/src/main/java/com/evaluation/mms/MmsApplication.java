package com.evaluation.mms;

import com.evaluation.mms.models.Categorie;
import com.evaluation.mms.models.Client;
import com.evaluation.mms.models.Produit;
import com.evaluation.mms.repositries.CategorieRepository;
import com.evaluation.mms.repositries.ClientRepository;
import com.evaluation.mms.repositries.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.math.BigDecimal;
import java.time.LocalDate;


@SpringBootApplication
public class MmsApplication implements CommandLineRunner {
@Autowired
private CategorieRepository categorieRepository;
@Autowired
private ProduitRepository produitRepository;
@Autowired
private ClientRepository clientRepository;
	public static void main(String[] args) {
		SpringApplication.run(MmsApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Categorie c1= new Categorie(null,"1235","ordinateur");
		Categorie c2= new Categorie(null,"1235","smartphone");
		Categorie r1=categorieRepository.save(c1);
		Categorie r2=categorieRepository.save(c2);

		Produit p1=new Produit(null,"d565","dell","m1","Processeur: Intel Pentium G5400 Dual Core", BigDecimal.valueOf(1500),15, r1 );
		Produit p2=new Produit(null,"d72","dell","m2","Processeur: Intel Pentium G5400 Dual Core", BigDecimal.valueOf(2070),20, r1 );
		Produit p3=new Produit(null,"d654","dell","m4","Processeur: Intel Pentium G5400 Dual Core", BigDecimal.valueOf(1840),6, r1 );
		Produit p4=new Produit(null,"d7254","dell","m10","Processeur: Intel Pentium G5400 Dual Core", BigDecimal.valueOf(2000),9,r1);


		Produit p5=new Produit(null,"d565","iphone","12 pro","Liquid Retina HD IPS (828 x 1792px) - Etanche IP68 - Processeur Apple A13 Bionic Hexa-Core - RAM 4 Go - Mémoire 64 Go - Système Appl", BigDecimal.valueOf(1500),15, r2 );
		Produit p6=new Produit(null,"d72","IPHONE ","11 pro","Ecran :  6,1\" Super Retina XDR OLED - Résolution: 1170 x 2532 pixels - Système d'exploitation: Android 10 - Processeur: Apple A14 Bionic (5 nm) Hexa-core (2x3.1 GHz Firestorm + 4x1.8 GHz Icestorm) GPU Apple GPU (4-core graphics)  - Mémoire RAM: 4 Go", BigDecimal.valueOf(2400),20, r2 );
		Produit p7=new Produit(null,"n8751","nokia","pop4","Écran 5.0\" IPS full view  - Processeur: Quad Core 1.3 GHz - Systéme d'exploitation: Android 8.1 - Mémoire RAM: 1 Go -", BigDecimal.valueOf(700),6, r2 );
		Produit p9=new Produit(null,"145 G\n","IKU ","m10","Double SIM - Ecran: 5.5\" IPS full écran d'affichage - Processeur", BigDecimal.valueOf(250),9, r2 );

		produitRepository.save(p1);
		produitRepository.save(p2);
		produitRepository.save(p3);
		produitRepository.save(p4);
		produitRepository.save(p5);
		produitRepository.save(p6);
		produitRepository.save(p7);
		produitRepository.save(p9);

		Client client =new Client(null,"54","khaled","hizawi", LocalDate.now(),"tunis","bardo",2047L,"28718388","455548","jvkl","khaled@his.com",null);
		clientRepository.save(client);
	}

	@Configuration
	public class CorsConfig {

		@Bean
		public WebMvcConfigurer corsConfigurer() {
			return new WebMvcConfigurerAdapter() {
				@Override
				public void addCorsMappings(CorsRegistry registry) {
					registry.addMapping("/**").allowedMethods("GET", "POST", "PUT", "DELETE").allowedOrigins("*")
							.allowedHeaders("*");
				}
			};
		}
	}
}

