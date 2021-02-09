
import java.util.*;

public class Service {
	 
	//Variables
	public int idService;
    public String typeService;
    public float montant;
    public ArrayList<Sejour> listeSjr;
    public ArrayList<Serveur> listeServeur;
    public static int compteur = 1;

    //Constructor
    public Service( String typeService, float montant) {
    	this.idService=compteur;compteur++;
    	this.typeService=typeService;
    	this.montant=montant;
    	listeSjr= new ArrayList<Sejour>(); 
    	listeServeur =new ArrayList<Serveur>();
    }

    //Methods
    
    /****
     * On veut Ajouter un Sejour  dans la listeDeSejours
     * On lui donne Sejour s en parametre 
     * SI:
     *    idSejour du Sejour Donné en parametre est égale a l'un des idSejours de l'un Des Sejours
     *     de la listeDesSejours
         ----> On Affiche "le sejour existe deja" ET on ajoute le sejour en question a la listeDesSEj  
     * SINON 
     *  ---->on Affiche "le sejour a bien été ajouté"
     * ****/
    public void AjoutSjr(Sejour s) {
      	 for (int i =0; i< listeSjr.size();i++){
      		 Sejour sj =listeSjr.get(i);
      	      if (s.idsjr==sj.idsjr) {
      			  System.out.println("le sejour existe deja");
      	      }
      	 }
      	listeSjr.add(s);
      	 System.out.println("le sejour a bien été ajouté");
      	}
      
    
    /*****
     * Meme principe que pour l'ajout d'un sejour 
     * 
     * *****/
    
    public void AjoutServeur(Serveur s) {
      	 for (int i =0; i< listeServeur.size();i++){
      		 Serveur c =listeServeur.get(i);
      	      if (s.numEmpl==c.numEmpl) {
      			  System.out.println("le serveur existe deja");
      	      }
      	 }
      	listeServeur.add(s);
      	 System.out.println("le serveur a bien été ajouté");
      	}
    
    /****
     * On veut supprimer un sejour , on lui donne un idSjr en parametre 
     * on parcours la listeDeSejours
     * CONDITION :
     * SI:
     * 		idenSjr donné en parametre est égale a l'un des idSejours d'un des sejours 
     *      de la listeDeSejours
     *      ---> on supp avec la fonction remove dans la listeDeSejours
     *      ET On affiche "le séjour a bien été ajouté"
     * SINON :
     *      ---> On affiche "Erreur :le séjour n'existe pas"
     *      
     * ****/
    
    public void SuppSjr( int idS ) {
    	for (int i =0; i<listeSjr.size();i++){
        	Sejour s =listeSjr.get(i);
    	if(idS==s.idsjr){
        listeSjr.remove(s);
        System.out.println("le séjour a  été supprimé");
    	}else {
            System.out.println("Erreur :le séjour n'existe pas");

    	}
    	
    }
    }
    /****
     * MEME principe que pour supprimer SEjour
     * ****/
  
    
    public void SuppServeur(int num ) {
    	for (int i =0; i<listeServeur.size();i++){
        	Serveur s =listeServeur.get(i);
    	if(num==s.numEmpl) {
        listeServeur.remove(s);
        System.out.println("le serveur a bien été supprimé");

    }else {
        System.out.println("Erreur :le serveur n'existe pas ");

    }
    }} 
    
    /**** On affiche la liste de tous les Sejours*****/

    public void AfficherSjr(){
      	
      	for (int i =0; i<listeSjr.size();i++){
      		Sejour se = listeSjr.get(i);
      		System.out.println(se.toString());
      	}
      	   }
    
    /**** On affiche la liste de tous les Serveurs*****/

    public void AfficherServ(){
      	
      	for (int i =0; i<listeServeur.size();i++){
      		Serveur sv = listeServeur.get(i);
      		System.out.println(sv.toString());
      	}
      	   }

    
    
    /**** On affiche la liste de tous les Serveurs*****/

	public int getIdService() {
		return idService;
	}

	public void setIdService(int idService) {
		this.idService = idService;
	}

	public String getTypeService() {
		return typeService;
	}

	public void setTypeService(String typeService) {
		this.typeService = typeService;
	}

	public float getMontant() {
		return montant;
	}


	public void setMontant(float montant) {
		this.montant = montant;
	}

   
	
	public String toString() {
		
		return "Service [idService=" + idService + ", typeService=" + typeService +", montant="
				+ montant + "]";
		}
}