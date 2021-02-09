
import java.util.*;

public class Client {
	
	//Variables
    public int codeClient;
    public String nom;
    public String prenom;
    public Date dateN  ;
    public long tel;
    public long numPass;
    public ArrayList<Reservation> listeResDuClient;
    public static int compteur = 1;
 
   
    // Constructor
    public Client(String nom,String prenom,Date dateN,long tel,long numPass) {
    	this.codeClient = compteur; compteur ++;
    	this.nom=nom;
    	this.prenom = prenom;
    	this.dateN=dateN;
    	this.tel = tel;
    	this.numPass=numPass;
    	this.listeResDuClient= new ArrayList<Reservation> ();
    
    }
    public Client() {}
    
    
    
    //Méthods 
    
    /****
     * On veut vérifier si une Reservation existe 
     * 
     * ****/
    public Reservation existRes(long numR ) {
        for (int i = 0; i < listeResDuClient.size(); i++) {
            Reservation res =listeResDuClient.get(i);
          if (numR==res.numReservation) {
              return res;
          }
        }
        return null ;
      }
    	
    
    
    
    /***Afficher la liste Des Reservation d'un Client Donné***/

 public void AfficherRes(){
		
      	for (int i =0; i<listeResDuClient.size();i++){
      		Reservation r = listeResDuClient.get(i);
      		System.out.println(r.toString());
      	}
    }	
 
 /****Annuller une Reservation d'un client donné****/

 public void AnnulerRes( int numR){
     for (int i =0; i<listeResDuClient.size();i++){
      Reservation resv = listeResDuClient.get(i);
      if  (numR==resv.numReservation){
    	  listeResDuClient.remove(resv);
    	  System.out.println("la reservation a bien été supprimé");
      }	else {System.out.println("Erreur : la réservation n'existe pas");
     }
    }
 }
 
 
 /****Ajouter une reservation d'un client donné a la listeDesResDuClient***/

  public void AjoutRes(Reservation res ) {
	 for (int i =0; i<listeResDuClient.size();i++){
	      Reservation res1 =listeResDuClient.get(i);
	      if (res.numReservation==res1.numReservation) {
			  System.out.println("la reservation existe deja");
	      }
	 }
	 listeResDuClient.add(res);
	 System.out.println("la reservation a bien été ajouté");
	}
 
	public String toString() {
		return "Client [codeClient=" + codeClient + ", nom=" + nom
				+ ", prenom=" + prenom + ", dateN=" + dateN + ", tel=" + tel
				+ ", numPass=" + numPass + "]";
	}

	public int getCodeClient() {
		return codeClient;
	}

	public void setCodeClient(int codeClient) {
		this.codeClient = codeClient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateN() {
		return dateN;
	}

	public void setDateN(Date dateN) {
		this.dateN = dateN;
	}

	public long getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public long getNumPass() {
		return numPass;
	}

	public void setNumPass(int numPass) {
		this.numPass = numPass;
	}
 
}