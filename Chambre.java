
import java.util.*;

public class Chambre extends Offre {
	
	//Variables 
	public int numChambre;
	public ArrayList<Nettoie> listeFdm;
	
	// Constructeur
    public Chambre( int numEtage, float prix,int numChambre) {
		super(numEtage, prix);
		this.numChambre = numChambre;
		listeFdm = new ArrayList<Nettoie>();
	}

   
    // Méthodes
    public int getNumChambre() {
    	return numChambre;
    }

    public void setNumChambre(int numChambre) {
    	this.numChambre = numChambre;
    }
    
    
    /** Ajouter une tache (une chambre ) a une femme de ménage **/

   public void AjoutNettoie(FemmeDeMenage fdm,Date dateNet) {
	   
	listeFdm.add(new Nettoie (dateNet, fdm));
   }
   public void AjoutNet(FemmeDeMenage fdm) {
	   
		listeFdm.add(new Nettoie (new Date(), fdm));
	   }

   
 
		
  
   /****Afficher la liste des femmes de ménage d'un chmabre donné***/

   public void AfficherFdm(){
	   for (int i =0; i<listeFdm.size();i++){
  		Nettoie fem = listeFdm.get(i);
  		System.out.println(fem.toString());
	   }
   }	

   public String toString() {
	return "Chambre [numChambre=" + numChambre + ", numEtage=" + numEtage + ", numBien="
			+ numBien + ", prix=" + prix + "]";
   }


}
  
   
   

