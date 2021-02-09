
import java.util.*;
public class Hotel {
	
	//Variables 
    public ArrayList<Employe> listeEmp=new ArrayList<Employe>();
    public  ArrayList<Client> listeClient=new ArrayList<Client>();
    public ArrayList<Offre> listeOffre=new ArrayList<Offre>();
    public  ArrayList<Sejour> listedetoutlessjr= new ArrayList<Sejour>();
    
    public String idHotel;
    public String adresse;
    public String email;
    public long numfix;
    

    
    //Constructor 
    public Hotel(String idHotel,String adresse,String email,long numfix,ArrayList<Employe>listeEmp,
    		ArrayList<Client> listeClient,ArrayList<Offre> listeOffre,ArrayList<Sejour> listedetoutlessjr) {
        this.idHotel=idHotel;
        this.adresse=adresse;
        this.email=email;   
        this.numfix=numfix;
        this.listeEmp=listeEmp;
        this.listeClient=listeClient;
        this.listeOffre=listeOffre;
        this.listedetoutlessjr=listedetoutlessjr;
        
    }
    
    public Hotel(String idHotel, String adresse, String email,long numfix) {
		super();
		this.idHotel = idHotel;
		this.adresse = adresse;
		this.email = email;
		this.numfix=numfix;
	}

	//Méthods 
    public void AfficherEmp(){
    	
    	for (int i =0; i<listeEmp.size();i++){
    		Employe emp = listeEmp.get(i);
    		System.out.println(emp.toString());
    	}	
    }
    
    /****Annuller une Reservation d'un client donné****/

    public void AfficherClient(){
    	
    	for (int i =0; i<listeClient.size();i++){
    		Client client = listeClient.get(i);
    		System.out.println(client.toString());
    	}	
    }
    
    
    /*********Afficher la liste des Offres que l'Hotel dispose *********/

    public void AfficherOffre(){
    	
    	for (int i =0; i<listeOffre.size();i++){
    		Offre offre = listeOffre.get(i);
    		System.out.println(offre.toString());
    	}	
    }
    
    /*****
     * On a un Sejour en paramétre en veut l'ajouter a la liste des sejours qu'on dispose
     * On parcours la liste des sejours 
     * Condition: 
     * Si :
     *     l'identifiant du sejour donné en parametre est égale a l'un des identifiants des sejours 
     *     de notre liste de sejours
     *     -----> On affiche "le sejour éxiste deja"
     * Sinon:
     *     ----> On ajoute le sejour donné en parametre a la liste des sejours 
     *             et On affiche "le sejour a été bien ajouté"  
     *                                                                                      *****/
  
    public void AjoutSjr(Sejour s) {
   	 for (int i =0; i< listedetoutlessjr.size();i++){
   	      Sejour sj =listedetoutlessjr.get(i);
   	      if (s.idsjr==sj.idsjr) {
   			  System.out.println("le sejour existe deja");
   	      }
   	 }
	 listedetoutlessjr.add(s);
   	 System.out.println("le séjour a bien été ajouté");
   	}

    
 public void AfficherSjr(){
      	
      	for (int i =0; i< listedetoutlessjr.size();i++){
      		Sejour se =  listedetoutlessjr.get(i);
      		System.out.println(se.toString());
      	}
      	   }
 
 
 
 
 /***** 
  * On veut supprimer un sejour dans une liste de sejours 
  * Donc on lui donne comme parametre un identifiant de sejour
  * On parcours la liste de sejours
  * Condition: 
  * SI: identifiant donné en parametre est égale a l'un des identifiants de la liste des sejours
  * ----> On supprime le sejour en question et on affiche" le sejour a été supprimé"
  * SINON: 
  * ----> On affiche "ERREUR :le séjour est inexistant"  
  * 																						*****/
 
 public void SuppSjr( int idS ) {
 	for (int i =0; i<listedetoutlessjr.size();i++){
     	Sejour s =listedetoutlessjr.get(i);
 	if(idS==s.idsjr){
 		listedetoutlessjr.remove(s);
 		System.out.println("le sejour a été supprimé");
 	}else {
 		System.out.println("ERREUR :le séjour est inexistant");
 	}
 }
 }
    
 
 /*****
  *On veut ajouter un employé ,on lui donne en parametre un employé e
  *On parcours la liste des employés qu'on dispose 
  *Condition:
  *Si :
  *    numEmployé de l'employé donné en parametre est égale a l'un des numérosEmp d'un des employés 
  *    de la listedesEmployés 
  *    -----> On affiche "l'empolyé existe deja"
  *Sinon:
  *	  On ajoute l'employé a la liste des employés 
  *    ----> et On affiche "l'employé a bien été ajouté"
                                                           *****/
    
    public void AjoutEmp(Employe e) {
      	 for (int i =0; i< listeEmp.size();i++){
      		Employe em =listeEmp.get(i);
      	      if (e.numEmpl==em.numEmpl) {
      			  System.out.println("l'employé existe deja");
      	      }
      	 }
      	listeEmp.add(e);
      	 System.out.println("l'employé a bien été ajouté");
      	}
    
    
    /*****
     *On veut ajouter un Client ,on lui donne en parametre un client c
     *On parcours la liste des clients qu'on dispose 
     *Condition:
     *Si :
     *    CodeClient du Client donné en parametre est égale a l'un des CodesClient d'un des Clients 
     *    de la listedeClients 
     *    -----> On affiche "le client existe deja"
     *Sinon:
     *	  On ajoute le Cleint a la listedeClients  
     *    ----> et On affiche "le client a bien été ajouté"
                                                              *****/
    
    
    public void AjoutClient(Client c ){
     	 for (int i =0; i< listeClient.size();i++){
     		Client cl =listeClient.get(i);
     	      if (c.codeClient==cl.codeClient) {
     			  System.out.println("le client existe deja");
     	      }
     	 }
     	listeClient.add(c);
     	 System.out.println("le client a bien été ajouté");
     	}
    
    
    
    
    /*****
     *On veut ajouter une Offre ,on lui donne en parametre une Offre o
     *On parcours la liste des Offres qu'on dispose 
     *Condition:
     *Si :
     *    NumDuBien de l'oofre donné en parametre est égale a l'un des numsDeBien d'une des Offres 
     *    de la listedesOffres 
     *    -----> On affiche "l'offre existe deja"
     *Sinon:
     *	  On ajoute l'offre a la listedesOffres  
     *    ----> et On affiche "l'offre a bien été ajouté"
                                                              *****/
   
   
    public void AjoutOffre(Offre o ){
    	 for (int i =0; i< listeOffre.size();i++){
    		Offre cl =listeOffre.get(i);
    	      if (o.numBien==cl.numBien) {
    			  System.out.println("l'offre existe deja");
    	      }
    	 }
    	 listeOffre.add(o);
    	 System.out.println("l'offre a bien été ajouté");
    	}
    
    
    
    
    
    
    /***** 
     * On veut supprimer un employé dans une liste d'employés 
     * Donc on lui donne comme parametre un numero d'employé
     * On parcours la liste des employés 
     * Condition: 
     * SI: 
     *     numeroEmployé donné en parametre est égale a l'un des numerosEmp des employés de la 
     *     listeDesEmployés
     *     ----> On supprime l'employé en question et on affiche "l'employé a été supprimé"
     * SINON: 
     *     ----> On affiche "ERREUR:l'employé est inexistant"  
     * 																						*****/
    public void SuppEmp(int nEmp){
    	for (int i =0; i<listeEmp.size();i++){
    	Employe e = listeEmp.get(i);
    	if(nEmp==e.numEmpl){
    	        listeEmp.remove(e);
    	        System.out.println("l'employé a été supprimé");
    	}else {
    		System.out.println("ERREUR:l'employé est inexistant");
    	}
    	}
    }
    
    
    
    
    /***** 
     * On veut supprimer un Client dans une liste de Client
     * Donc on lui donne comme parametre un code Client cdc
     * On parcours la liste des Clients 
     * Condition: 
     * SI: 
     *     CodeClient donné en parametre est égale a l'un des CodeClients des Clients de la 
     *     listeDesClients
     *     ----> On supprime le Client en question et on affiche "le client a été supprimé"
     * SINON: 
     *     ----> On affiche "ERREUR :le client est inexistant"  
     * 																						*****/
    public void SuppClient(int cdc ){
    	for (int i =0; i<listeClient.size();i++){
    	Client c = listeClient.get(i);
    	if(cdc==c.codeClient){
    	listeClient.remove(c);
    	System.out.println("le client a été supprimé");
    	}else { 
    		System.out.println("ERREUR :le client est inexistant");
    	}
    	}
    }
    
    
    
    
    /***** 
     * On veut supprimer une Chambre dans La listedesOffres 
     * Donc on lui donne comme parametre un NumChambre numc
     * On parcours la listedesOffres
     * Condition:
     * On vérifie Si le type d'offre est bien une instance de chambre
     * ET SI : 
     * 		le numeroChambre donné en parametre est égale numChambres de l'une des NumdesChambres 
     * 		de la listeDesOffres  
     *		----> On supprime la chambre en question et on affiche "la chambre a été supprimé"
     * SINON: 
     *     ----> On affiche "Erreur : la chambre n'existe pas"  
     * 																				*****/
    public void SuppCh(int numC){
    	for (int i =0; i<listeOffre.size();i++){
    	Offre o = listeOffre.get(i);
    	if(o instanceof Chambre){
      if (((Chambre)o).numChambre==numC){
    	  listeOffre.remove(i);
    	  System.out.println("la chambre a été supprimé");
  	}else { 
  		System.out.println("ERREUR :la chambre est inexistante");
  	}
  	}
  }
    }
    
    
    
    
    
    /***** 
     * On veut supprimer une Salle D'Evenement dans La listedesOffres 
     * Donc on lui donne comme parametre un NumSE numS
     * On parcours la listedesOffres
     * Condition:
     * On vérifie Si le type d'offre est bien une instance de Salle D'Evenement
     * ET SI : 
     * 		le numeroSalle donné en parametre est égale numSalleEve de l'une des SallesDEven 
     * 		de la listeDesOffres  
     *		----> On supprime la SalleEve en question et on affiche " la salle a bien été supprimé"
     * SINON: 
     *     ----> On affiche "Erreur : la salle n'existe pas"  
     * 																				*****/
    
    
    public void SuppSEv(int numS){
    	for (int i =0; i<listeOffre.size();i++){
    	Offre o = listeOffre.get(i);
    	if(o instanceof SalleEvenement){
      if (((SalleEvenement)o).numSE==numS){
    	  listeOffre.remove(i);
    	  System.out.println("la salle a été supprimé");
  	}else { 
  		System.out.println("ERREUR :la salle est inexistante");
  	}
  	}
  }}
    
    
    
    /***** 
     * On veut supprimer un Restaurant dans La listedesOffres 
     * Donc on lui donne comme parametre un numeroDeRest numR
     * On parcours la listedesOffres
     * Condition:
     * On vérifie Si le type d'offre est bien une instance de Restaurant
     * ET SI : 
     * 		le numeroDeRest donné en parametre est égale numDeRestau de l'un des Restaus de la listeDesOffres
     *		----> On supprime le restau en question et on affiche "le restaurant a bien été supprimé"
     * SINON: 
     *     ----> On affiche "Erreur : le restaurant n'existe pas" 
     * 																				*****/
    public void SuppRest(int numR){
    	for (int i =0; i<listeOffre.size();i++){
    	Offre o = listeOffre.get(i);
    	if(o instanceof Restaurant){
      if (((Restaurant)o).numRt==numR){
    	  
    	  listeOffre.remove(i);
    	  System.out.println("le restaurant a été supprimé");
  	}else { 
  		System.out.println("ERREUR :le restaurant est inexistant");
  	}
  	}}
  }
   
    
    
    
    /*****
     * On veut verifier si un client existe deja dans la listeDesClients, On lui donne codeClient en parametre 
     * On parcours la liste des clients
     * Condition :
     * SI: 
     * 		le CodeClient donné en parametre est égale a l'un des CodesClients des clients de la listeDesClients
     * 		----> On retourne le Client qui vérifie la condition
     * SINON :
     * 		----> On retourne NULL
     * *****/
    public Client existClient(int n ) {
    	for (int i =0; i<listeClient.size();i++){
			Client c = listeClient.get(i);
		  System.out.println("i= "+c.codeClient+" n= "+n); 	
          if (c.codeClient==n){
        	  return c;
        	 
			}
		}
	    return null;
	  }
    
    
    
    public Offre existoff(int num ) {
        for (int i = 0; i < listeOffre.size(); i++) {
            Offre o = listeOffre.get(i);
            System.out.println("i= "+o.numBien+" num= "+num);
          if (num==o.numBien) {
        	  System.out.println("l'offre existe ");
             return o ;	
          
            } 
          }
        
		return null;
    }
    
    
    
    /****
     * MEME principe Que la methode existeClient() (juste en haut) 
     * ICI on vérifie si un receptionniste existe dans la listeDesEmployés
     * SI c'est le cas On retourne le receptionnniste qui vérifie la condition 
     * SINON on retourne NuLL
     * ****/
     
    public Receptionniste existRecep(int numE ) {
    	for (int i =0; i<listeEmp.size();i++){
        	Employe r =listeEmp.get(i);
        	System.out.println("i= "+r.numEmpl+" numS= "+numE);
        	if(r instanceof Receptionniste){
          if (((Receptionniste)r).numEmpl==numE){
        	  System.out.println("le receptionniste existe bien");
        	 return (Receptionniste) r;
        	 }     	  
        	}}
        	 return null;	
    }
    
    
    
    
    /****
     * MEME principe Que la methode existeRecep (juste en haut)
     * ICI on vérifie si un Serveur existe dans la listeDesEmployés 
     * SI c'est le cas On retourne le Serveur qui vérifie la condition 
     * SINON on retourne NuLL
     * ****/
    public Serveur existSrv(int numE ) {
    	for (int i =0; i<listeEmp.size();i++){
        	Employe r =listeEmp.get(i);
        	System.out.println("i= "+r.numEmpl+" numS= "+numE);
        	if(r instanceof Serveur){
          if (((Serveur)r).numEmpl==numE){
        	 return (Serveur) r;
        	 }     	  
        	}}
        	 return null;	
    }
    
    
    
    
    /****
     * MEME principe Que la methode existeSrv (juste en haut)
     * ICI on vérifie si une femmeDeMenage existe dans la listeDesEmployés
     * SI c'est le cas On retourne la femmeDeMenage qui vérifie la condition 
     * SINON on retourne NuLL
     * ****/
    
    public FemmeDeMenage existFdm(int numE ) {
    	for (int i =0; i<listeEmp.size();i++){
        	Employe r =listeEmp.get(i);
        	System.out.println("i= "+r.numEmpl+" numS= "+numE);
        	if(r instanceof FemmeDeMenage){
          if (((FemmeDeMenage)r).numEmpl==numE){
        	 return (FemmeDeMenage) r;
        	 }     	  
        	}}
        	 return null;	
    }
    
    
    /****
     * MEME principe Que la methode existeFdm (juste en haut)
     * ICI on vérifie si un Sejour  existe dans la listeDeTousLesSejour
     * On lui donne numsejour en parametre 
     * SI:
     *   le numSejour Donné en parametre est égale a l'un des idSejours de l'un Des Sejours de la listeDeTousLesSejour
         ----> On retourne le Sejour( en question) qui vérifie la condition 
     * SINON 
     *  ---->on retourne NULL
     * ****/
    public Sejour existSjr(int numS ) {
        for (int i = 0; i < listedetoutlessjr.size(); i++) {
            Sejour s =listedetoutlessjr.get(i);
            System.out.println("i= "+s.idsjr+" numS= "+numS); 
          if (numS==s.idsjr) {
             return s;
          }
        }
        return null;
        }
   
 
	public String getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(String idHotel) {
		this.idHotel = idHotel;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public ArrayList<Employe> getListeEmp() {
		return listeEmp;
	}
	public void setListeEmp(ArrayList<Employe> listeEmp) {
		this.listeEmp = listeEmp;
	}
	public ArrayList<Client> getListeClient() {
		return listeClient;
	}
	public void setListeClient(ArrayList<Client> listeClient) {
		this.listeClient = listeClient;
	}
	public ArrayList<Offre> getListeOffre() {
		return listeOffre;
	}
	public void setListeOffre(ArrayList<Offre> listeOffre) {
		this.listeOffre = listeOffre;
	}

	
		 
		 
	 }
