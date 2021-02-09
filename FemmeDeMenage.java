
import java.util.*;

public class FemmeDeMenage extends Employe {
	
	//Variables 
    public ArrayList<Chambre> listeDeChm;
    
    
    //Constructor
    public FemmeDeMenage(String nom,String prenom,long tel,Date dateRecrut,double salaire ) {
    	super(nom,prenom, tel, dateRecrut,salaire);
    
    }

    
    // Méthods
    /***Ajouter une chambre a la listedesChambre qu'elle nettoie une femme de ménage donné ***/

    public void AjoutChamb(Chambre c){
    	listeDeChm.add(c);
    	
    }
    
    /****Supprimer une chambre de la listeDesChambre d'une femme de ménage donné****/

    public void SuppChamb(int numc){
    	for (int i =0; i<listeDeChm.size();i++){
    	Chambre c =listeDeChm.get(i);
        if (numc==c.numChambre){
    	 listeDeChm.remove(c);
     }
    }
    }
    /****Afficher la liste des chambres qu'elle nettoie une femme de menage donné****/

    public void Afficherch(){
      	
      	for (int i =0; i<listeDeChm.size();i++){
      		Chambre ch = listeDeChm.get(i);
      		System.out.println(ch.toString());
      	}
      	   }
    
    

	@Override
	public String toString() {
		return "FemmeDeMenage [ numEmpl="
				+ numEmpl + ", nom=" + nom + ", prenom=" + prenom + ", tel="
				+ tel + ", dateRecrut=" + dateRecrut + ", salaire=" + salaire
				+ "]";
	}

	

	

	


 

}