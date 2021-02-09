import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Saisie {
	public static ArrayList<Employe> listeEmp=new ArrayList<Employe>();
    public static ArrayList<Client> listeClient=new ArrayList<Client>();
    public static ArrayList<Offre> listeOffre=new ArrayList<Offre>();
    public static ArrayList<Service> listeSrv = new ArrayList<Service>();
    public static ArrayList<Sejour> listeSjr= new ArrayList<Sejour>();
    public static ArrayList<Sejour> listedetoutlessjr= new ArrayList<Sejour>();
    static Hotel h  = new Hotel("Zhotel","15 Rue De Menilmontant 75020","zhotel@gmail.com",0706552124,listeEmp,listeClient,listeOffre,listedetoutlessjr);
	 @SuppressWarnings("deprecation")
	 
	 
	 
	 /***SAISIR UN CLIENT***/

	 public static Client SaisieClient () {
	       Scanner sc = new Scanner (System.in);
	       Scanner sc1 = new Scanner (System.in);
		 System.out.println("veuillez saisir le nom du client:\n");
		 String nomC = sc1.nextLine();
		 System.out.println("veuillez saisir le prénom du client:\n");
		 String prenomC = sc1.nextLine();
		 System.out.println("veuillez saisir le numéro passeport:\n");
		 long npass = sc.nextLong();
		 System.out.println("veuillez saisir la date naissance format (jj/mm/aaaa) :\n");
		 int j = sc.nextInt();
		 int m = sc.nextInt();
		 int a=sc.nextInt();
		 System.out.println("veuillez saisir le numéro de téléphone:\n");
		 long num = sc.nextLong();
		 Client c = new Client(nomC,prenomC,new Date(m+"/"+j+"/"+a),num,npass);
		   h.AjoutClient(c);
		   System.out.println("Client ajouté \n");
		   System.out.println("votre code client est: "+c.getCodeClient());
		    return c;
	}
	 
	 
	 /****SAISIR UN EMPLOYE (RECEPTIONNISTE)****/

	  public static Employe SaisieReceptionniste() {
		    Scanner s3 = new Scanner (System.in);
			 System.out.println("veuillez saisir le nom de Employé:\n");
			 String nomC = s3.nextLine();
			 System.out.println("veuillez saisir le prénom de Employé:\n");
			 String prenomC = s3.nextLine();
			 System.out.println("veuillez saisir le salaire:\n");
			 double sal = s3.nextDouble();
			 System.out.println("veuillez saisir la date de recrutement  format (jj/mm/aaaa) :\n");
			 int j = s3.nextInt();
			 int m = s3.nextInt();
			 int a=s3.nextInt();
			 System.out.println("veuillez saisir le numéro de téléphone:\n");
	         long num = s3.nextLong();	  
	            	 Receptionniste  e = new Receptionniste (nomC,prenomC,num,new Date(m+"/"+j+"/"+"/"+a),sal );
	            	   h.AjoutEmp(e);
	    	           System.out.println("Employé Receptionniste ajouté !\n");
	    	           System.out.println("votre code employé est :"+e.getNumEmpl());
	        	    
	                 return e;
		   }
	  
	  
	  
	    
	  
	  public static Employe SaisieFdm() {
		    Scanner s3 = new Scanner (System.in);
			 System.out.println("veuillez saisir le nom de Employé:\n");
			 String nomC = s3.nextLine();
			 System.out.println("veuillez saisir le prénom de Employé:\n");
			 String prenomC = s3.nextLine();
			 System.out.println("veuillez saisir le salaire:\n");
			 double sal = s3.nextDouble();
			 System.out.println("veuillez saisir la date de recrutement  format (jj/mm/aaaa) :\n");
			 int j = s3.nextInt();
			 int m = s3.nextInt();
			 int a=s3.nextInt();
			 System.out.println("veuillez saisir le numéro de téléphone:\n");
	         long num = s3.nextLong();	  
	            	FemmeDeMenage f = new FemmeDeMenage (nomC,prenomC,num,new Date(m+"/"+j+"/"+"/"+a),sal );
	            	   h.AjoutEmp(f);
	    	           System.out.println("Employé Femme de menage ajouté !\n");
	    	           System.out.println("votre code employé est :"+f.getNumEmpl());
	                 return f;
		   }
	  
	  
	  
	  
	  public static Employe SaisieServeur () {
		    Scanner s3 = new Scanner (System.in);
			 System.out.println("veuillez saisir le nom de Employé:\n");
			 String nomC = s3.nextLine();
			 System.out.println("veuillez saisir le prénom de Employé:\n");
			 String prenomC = s3.nextLine();
			 System.out.println("veuillez saisir le salaire:\n");
			 double sal = s3.nextDouble();
			 System.out.println("veuillez saisir la date de recrutement  format (jj/mm/aaaa) :\n");
			 int j = s3.nextInt();
			 int m = s3.nextInt();
			 int a=s3.nextInt();
			 System.out.println("veuillez saisir le numéro de téléphone:\n");
	         long num = s3.nextLong();  
	            	Serveur s = new Serveur (nomC,prenomC,num,new Date(m+"/"+j+"/"+"/"+a),sal );
	            	   h.AjoutEmp(s);
	    	           System.out.println("Employé Femme de menage ajouté !\n");
	    	           System.out.println("votre code employé est :"+s.getNumEmpl());
	        	    
	                 return s;
		   }
	  
	  
	  
	  
	  public static Chambre Saisiechambre() {
			    Scanner sc = new Scanner (System.in);
				 System.out.println("veuillez saisir le numero de l'étage:\n");
				 int id = sc.nextInt();
				 System.out.println("veuillez saisir le prix:\n");
				 float pr = sc.nextFloat();
				 System.out.println("veuillez saisir le numero de chambre:\n");
				 int p = sc.nextInt();
				 Offre o = new Chambre (id,pr,p);
				   h.AjoutOffre(o);
				   System.out.println("chambre ajouté !\n");
				   System.out.println("le numero du bien est : "+o.numBien);
				 return (Chambre) o;
			}
	  
	  
	  
	  public static Restaurant Saisierestaur() {
		    Scanner sc = new Scanner (System.in);
			 System.out.println("veuillez saisir le numero de l'étage:\n");
			 int id = sc.nextInt();
			 System.out.println("veuillez saisir le prix:\n");
			 float pr = sc.nextFloat();
			 System.out.println("veuillez saisir la capacité :\n");
			 long c =sc.nextLong();
			 System.out.println("veuillez saisir la superficie :\n");
			 double p = sc.nextDouble();
			 Offre o = new Restaurant (id,pr,c,p);
			   h.AjoutOffre(o);
			   System.out.println("restaurant ajouté !\n");
			   System.out.println("le numero du bien est : "+o.numBien);
			 return (Restaurant) o;
		} 
	  
	  
	  public static SalleEvenement SaisieSALLE() {
		    Scanner sc = new Scanner (System.in);
		    System.out.println("veuillez saisir le numero de l'étage:\n");
			 int id = sc.nextInt();
			 System.out.println("veuillez saisir le prix:\n");
			 float pr = sc.nextFloat();
			 System.out.println("veuillez saisir la capacité :\n");
			 long c =sc.nextLong();
			 System.out.println("veuillez saisir la superficie :\n");
			 double p = sc.nextDouble();
			 System.out.println("veuillez saisir le numero de la salle:\n");
			 int s = sc.nextInt();
			 Offre o = new SalleEvenement (id,pr,s,c,p);
			   h.AjoutOffre(o);
			   System.out.println("salle d'évenement ajouté !\n");
			   System.out.println("le numero du bien est : "+o.numBien);
			 return (SalleEvenement) o;
		}


	  
	  
	  public static Reservation SaisieReservation() {
	Scanner s = new Scanner (System.in);
		 System.out.println("veuillez saisir la date de debut format (jj/mm/aaaa) :\n");
		 int j = s.nextInt();
		 int m = s.nextInt();
		 int a=s.nextInt();
		 System.out.println("veuillez saisir la date de fin format (jj/mm/aaaa) :\n");
		 int jj = s.nextInt();
		 int mm = s.nextInt();
		 int aaaa=s.nextInt();
		 System.out.println("veuillez saisir 0 si vous etes nouveau client");
		 System.out.println("veuillez saisir votre code client si vous en avez un \n");
		 int k = s.nextInt();
		   Client c = Saisie.verif(k);
         System.out.println("veuillez saisir le numero du bien(offre) :\n");
         int f = s.nextInt();
	     Offre  o = h.existoff(f);
         System.out.println("veuillez saisir le num du receptionniste concerné:\n");
        int numr =s.nextInt();
       Receptionniste re = h.existRecep(numr);
       if ((o!=null)&&(re!=null)) {
       if((o.Dispo(new Date(m+"/"+j+"/"+"/"+a), new Date(mm+"/"+jj+"/"+"/"+aaaa)))){
		Reservation res = new Reservation (new Date(m+"/"+j+"/"+"/"+a),new Date(mm+"/"+jj+"/"+"/"+aaaa),c,o,re);
		System.out.println("votre numero de réservation est "+res.numReservation);
		 c.AjoutRes(res);
		 o.AjoutReserva(res);
	       return res;}
       }
		System.out.println("Erreur impossible d'effectuer la réservation , vérifier la disponibilité et l'existance de l'offre ou du receptionniste");
		return null;
	}
	  
	  
	  
	  
	  public static Client verif(int n ) {
		  for (int i =0; i<listeClient.size();i++){
				Client c = listeClient.get(i);
			  System.out.println("i= "+c.codeClient+" n= "+n); 	
	          if (c.codeClient==n){
	        	  System.out.println("vous posséder déja une réservation:\n");
	    		  return h.existClient(n);
	   
	  }}
		  System.out.println("vous etes nouveau :\n");

     	  return Saisie.SaisieClient();
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  public static Service SaisieService() {
		  Scanner s = new Scanner (System.in);
		  Scanner s1 = new Scanner (System.in);
		  System.out.println("veuillez le numero du séjour :\n");
		      int n =s.nextInt();
		      Sejour Sj = h.existSjr(n);
			  System.out.println("veuillez saisir le type de service :\n");
			  String tS = s1.nextLine();
			  System.out.println("veuillez saisir le montant du service :\n");
              float mS=s.nextFloat();
              Service ser =new Service (tS,mS);
              Sj.AjoutService(ser);
              ser.AjoutSjr(Sj);
              System.out.println("le numero du service est"+ser.idService);
              return ser;
		  }
	  
	  
	  

	  
	  public static void ConfirmationRes(){
		  Scanner scn =new Scanner(System.in);
	  System.out.println("veuillez confirmer la réservation\n");
		 System.out.println("veuillez saisir le code Client:\n");
		 int cdC =scn.nextInt();
		 System.out.println("veuillez saisir le numero de réservation:\n");
		 int numR = scn.nextInt();
		   Client clt =new Client();
		   clt=h.existClient(cdC);
		 if (clt != null){
			 Reservation r =clt.existRes(numR);
			Sejour s =r.CheckIn();
			h.AjoutSjr(s);
			 System.out.println("La reservation est confirmée + consommation minibar");
		 }else{
			 System.out.println("PROBLEME !!!! La reservation ne peut pas etre confirmée");
		 }
	  } 
	   
	  
	  
	  
	  public static void AnnulerReservation(){
		  Scanner s2 = new Scanner (System.in);
		  int nb =s2.nextInt();
	      Client ct =h.existClient(nb);
	    System.out.println("Entrer le numero de Reservation ");
	    int numR=s2.nextInt();
	    ct.AnnulerRes(numR);
	    System.out.println("Reservation num "+numR+"annulé");
	  }

		    
	  
	  
	  public static void AnnulerService(){
		  Scanner s2 = new Scanner (System.in);
		  System.out.println("Entrer le num de l'identifiant du sejour concernée : ");
		  int c =s2.nextInt();
			 if(h.existSjr(c)!=null) {
				h.SuppSjr(c); 
			 }  else {
			 
		 System.out.println("Sejour  est inexistant");
		 }
	  }
	  
	  
	  
	  
	  public static double Facture() {
		  Scanner s2 = new Scanner (System.in);
		  System.out.println("Entrer le num de l'identifiant du sejour concernée : ");
		  int n =s2.nextInt();
		  Sejour sejour =h.existSjr(n);
		  if(sejour!=null) {  
			  return sejour.Facturation();
		  }else {
		  System.out.println("Sejour  est inexistant");
		  return -1;
	  }
}
	  
	  
	  
	  
	  
	  
	  public static boolean Disponibilité() {
		  Scanner s2 = new Scanner (System.in);
		  System.out.println("Entrer le num de bien de l'offre  : ");
		  int r =s2.nextInt();
		  Offre o =  h.existoff(r);
		   boolean dispo = false;
		   if (o!=null) {
		   System.out.println("veuillez saisir la date de debut format (jj/mm/aaaa) :\n");
			 int j = s2.nextInt();
			 int m = s2.nextInt();
			 int a=s2.nextInt();
			 System.out.println("veuillez saisir la date de fin format (jj/mm/aaaa) :\n");
			 int jj = s2.nextInt();
			 int mm= s2.nextInt();
			 int aa=s2.nextInt();
		  dispo = o.Dispo(new Date(m+"/"+j+"/"+"/"+a), new Date(mm+"/"+jj+"/"+"/"+aa));
		     }
		   return dispo;
	  }
	  
	  
	 
	  
	  
	  
	  
	  
	  
	  
	  public static void AffichLiRes() {
		  Scanner s3 = new Scanner (System.in);
		  System.out.println("veuillez saisir le numéro client: ");
		  int n =s3.nextInt();
	        Client cl = null;
			cl=h.existClient(n);
	         if (cl!=null) {
	    	   cl.AfficherRes();
	       }else {
	    	   System.out.println("le client n'existe pas");
	       }
	  }
	  
	  
	  
	  public static void ConsulRes() {
 		  Scanner s2 = new Scanner (System.in);
 		  System.out.println("veuillez saisir le numéro client: ");
 		  int n =s2.nextInt();
		Client c = h.existClient(n);
		
        if (c!=null) {
			
			System.out.println("le client est: "+c.toString());
	       }else {
	    	   System.out.println("le client n'existe pas");
	       }
	  }
	  
	  
	       public static void Supprsejour(){
	    	   Scanner s2 = new Scanner (System.in );
	    	   System.out.println("veuillez saisir le numéro de séjour");
	    	   int ns =s2.nextInt();
	    	   Sejour s= h.existSjr(ns);
	    		   h.SuppSjr(ns);
	    	 
	       }
	    		   
	       public static void Supprchambre() {
	    	   Scanner s2 = new Scanner (System.in );
	    	   System.out.println("veuillez saisir le numéro du bien");
	    	   int ns =s2.nextInt(); 
	    	   h.existoff(ns);
	    	   h.SuppCh(ns);
	    	   
	       }
	       public static void SupprSev() {
	    	   Scanner s2 = new Scanner (System.in );
	    	   System.out.println("veuillez saisir le numéro du bien");
	    	   int ns =s2.nextInt(); 
	    	   h.SuppSEv(ns);
	    	   
	       }
	    	   
	       public static void Supprres() {
	    	   Scanner s2 = new Scanner (System.in );
	    	   System.out.println("veuillez saisir le numéro du bien");
	    	   int ns =s2.nextInt(); 
	    	   h.SuppSEv(ns);
	    	   
	       }
	       public static void  SuppEmp() {
	    	   Scanner s2 = new Scanner (System.in );
	    	   System.out.println("veuillez saisir le numéro de l'employé");
	    	   int r = s2.nextInt ();
	    	   h.SuppEmp(r);
	       }
	    	   
	    	   public static void  AffichS() {
	    		   Scanner s2 = new Scanner (System.in );
	    		   System.out.println("veuillez saisir le numéro du sejour");
		    	   int ns =s2.nextInt(); 
		    	    Sejour s = h.existSjr(ns);
		    	    s.AfficherSrv();
	    	   }
	       
       public static void Affiche() {
	        h.AfficherEmp();
                     }
       
       
      public static void Affichecl() {
	        h.AfficherClient();
                                 }
      
                       
                       
     public static void Affichesjr() {
            h.AfficherSjr();
        }
     public static void AfficheOff() {
    	 h.AfficherOffre();
     }
} 
