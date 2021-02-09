
import java.util.*;


public class Menu {
	public Menu(){
		
		Hotel h  = new Hotel("Zhotel","15 Rue De Menilmontant 75020","zhotel@gmail.com",0706552124); 
		System.out.println("==========<><><><><>Hotel"+h.idHotel+"<><><><><>================||");
		System.out.println("||                  E-mail:"+h.email+"             ||");
		System.out.println("||choisissez:                                             ||");
		System.out.println("||1:Ajouter une chambre                                   ||");
		System.out.println("||2:Ajouter un restaurant                                 ||");
		System.out.println("||3:Ajouter une salle d'évenement                         ||");
		System.out.println("||4: ajouter un Receptionniste                            ||");
		System.out.println("||5: ajouter une femme de menage                          ||");
		System.out.println("||6: ajouter un serveur                                   ||");
		System.out.println("||7: Supprimer un employé                                 ||");
		System.out.println("||8: Supprimer une chambre                                ||");
		System.out.println("||9: Supprimer une salle                                  ||");
		System.out.println("||10:Supprimer un restaurant                              ||");
		System.out.println("||11: Ajouter une  reservation                            ||");
		System.out.println("||12: confirmer une reservation                           ||");
		System.out.println("||13: Annuler reservation                                 ||");
		System.out.println("||14: Consulter une reservation                           ||");
		System.out.println("||15:Afficher la liste des reservation d'un client        ||");
		System.out.println("||16: Disponibilité                                       ||");
		System.out.println("||17:Supprimer un sejour                                  ||");
		System.out.println("||18: Ajouter service pour un séjour                      ||");
		System.out.println("||19: Annuler Service                                     ||");
		System.out.println("||20: Facturation                                         ||");
		System.out.println("||21:Afficher la liste des employés                       ||");
		System.out.println("||22:Afficher la liste des clients                        ||");
		System.out.println("||23:Afficher la liste des séjours                        ||");
		System.out.println("||24:Afficher la liste des offres                         ||");
		System.out.println("||25:Afficher la liste des services d'un sejour           ||");
		System.out.println("==========================================================");
		
	System.out.println("                     0: Quitter\n                     ");
		
		Scanner s2 = new Scanner (System.in);
		int nb =s2.nextInt();
		
		while(true) {
			switch(nb) {
			case 11:
				
					   Saisie.SaisieReservation();
					 System.out.println("veuillez choisir une autre option ou cliquer sur 0 pour quitter");
				       nb =s2.nextInt();
				        break;
				   
			case 12 :
				     Saisie.ConfirmationRes();
					 System.out.println("veuillez choisir une autre option ou cliquer sur 0 pour quitter");

				     nb =s2.nextInt();
				       break;
			case 13 :
				     Saisie.AnnulerReservation();
					 System.out.println("veuillez choisir une autre option ou cliquer sur 0 pour quitter");

			         nb =s2.nextInt();
			           break;
				 
			case 18:
				     Saisie.SaisieService();
					 System.out.println("veuillez choisir une autre option ou cliquer sur 0 pour quitter");

				     nb =s2.nextInt();
					    break;
			case 19 : 
				 Saisie.AnnulerService();
				 System.out.println("veuillez choisir une autre option ou cliquer sur 0 pour quitter");

			     nb =s2.nextInt();
	    	        break;
			case 20 : 
				   Saisie.Facture();
					 System.out.println("veuillez choisir une autre option ou cliquer sur 0 pour quitter");

				   nb =s2.nextInt();
	    	        break;
			case 16 :
				Saisie.Disponibilité();
				 System.out.println("veuillez choisir une autre option ou cliquer sur 0 pour quitter");

				nb =s2.nextInt();
    	        break;
			case 8 : 
				Saisie.Supprchambre();
				 System.out.println("veuillez choisir une autre option ou cliquer sur 0 pour quitter");
				 nb =s2.nextInt();
				break;
			case 9 :
				    Saisie.SupprSev();
				    System.out.println("veuillez choisir une autre option ou cliquer sur 0 pour quitter");

					nb =s2.nextInt();
					break;
			case 4 :
				Saisie.SaisieReceptionniste();
				 System.out.println("veuillez choisir une autre option ou cliquer sur 0 pour quitter");
				nb =s2.nextInt();
    	        break;
			case 5 :
				Saisie.SaisieFdm();
				 System.out.println("veuillez choisir une autre option ou cliquer sur 0 pour quitter");
				nb =s2.nextInt();
    	        break;
			case 6:
				Saisie.SaisieServeur();
				 System.out.println("veuillez choisir une autre option ou cliquer sur 0 pour quitter");
					nb =s2.nextInt();
	    	        break;
			case 7: 
				Saisie.SuppEmp();
				 System.out.println("veuillez choisir une autre option ou cliquer sur 0 pour quitter");
					nb =s2.nextInt();
	    	        break;
					
			case 14:
				Saisie.ConsulRes();
				 System.out.println("veuillez choisir une autre option ou cliquer sur 0 pour quitter");
				nb =s2.nextInt();
    	        break;
    	        
			case 17:
				Saisie.Supprsejour();
				 System.out.println("veuillez choisir une autre option ou cliquer sur 0 pour quitter");
				nb =s2.nextInt();
    	        break; 
	
			case 15:
				Saisie.AffichLiRes();
				 System.out.println("veuillez choisir une autre option ou cliquer sur 0 pour quitter");
				nb =s2.nextInt();
    	        break;
			case 21:
				Saisie.Affiche();
				 System.out.println("veuillez choisir une autre option ou cliquer sur 0 pour quitter");
				nb =s2.nextInt();
    	        break;
			case 22:
				Saisie.Affichecl();
				 System.out.println("veuillez choisir une autre option ou cliquer sur 0 pour quitter");
				nb =s2.nextInt();
    	        break;
			case 23 :
				Saisie.Affichesjr();
				 System.out.println("veuillez choisir une autre option ou cliquer sur 0 pour quitter");
				nb =s2.nextInt();
    	        break;
	
			case 1:
				Saisie.Saisiechambre();
				 System.out.println("veuillez choisir une autre option ou cliquer sur 0 pour quitter");
					nb =s2.nextInt();
	    	        break;
			case 2:
				Saisie.Saisierestaur();
				 System.out.println("veuillez choisir une autre option ou cliquer sur 0 pour quitter");
					nb =s2.nextInt();
	    	        break;
			case 3:
	             Saisie.SaisieSALLE();
	             System.out.println("veuillez choisir une autre option ou cliquer sur 0 pour quitter");
					nb =s2.nextInt();
	    	        break;
			case 24 :
				Saisie.AfficheOff();
				System.out.println("veuillez choisir une autre option ou cliquer sur 0 pour quitter");
				nb =s2.nextInt();
    	        break;
			case 10:
				    Saisie.Supprres();
				    System.out.println("veuillez choisir une autre option ou cliquer sur 0 pour quitter");
					nb =s2.nextInt();
					break;
			case 25:
				Saisie.AffichS();
				System.out.println("veuillez choisir une autre option ou cliquer sur 0 pour quitter");
				nb =s2.nextInt();
				break;
			case 0 : 
				System.out.println("LE PROGRAMME S'ARRETE\n");
				System.exit(0);
				break;
				default :				
					System.out.println("instruction inconnu , réessayer\n");
					System.out.println("veuillez choisir une autre option ou cliquer sur 0 pour quitter");
					nb =s2.nextInt();
					break;
 
}}}}
	
