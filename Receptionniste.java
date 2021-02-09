
import java.util.*;

public class Receptionniste extends Employe {
	
	//Variable
	//listeRsrvtRecep =liste des reservations qu'il a fait le receptionniste
	public ArrayList<Reservation> listeRsrvtRecep ;
    
	//Constructor
	
    public Receptionniste(String nom,String prenom,long tel,Date dateRecrut,double salaire) {
    	super(nom,prenom, tel, dateRecrut,salaire);
    }

    //Méthods 
    /**** Ajouter une reservation d'un recéptionniste donné a sa liste liste de reservation ****/

    public void AjoutRes(Reservation rsrvt ) {
    	listeRsrvtRecep.add(rsrvt); 
    }
    /**** Supprimer une reservation qu'un receptionniste donné a effectué*****/

    public void SuppRes(Date deb ,Date fin, int numR){
    	for (int i =0; i<listeRsrvtRecep.size();i++){
        Reservation resv = listeRsrvtRecep.get(i);
        if ((deb.equals(resv.dateDebut))&&  (fin.equals(resv.dateFin))&& (numR==resv.numReservation)){
        	listeRsrvtRecep.remove(resv);
           }	
         }
    }
    /****Afficher les reservation qu'un receptionniste a effectué****/

    public void AfficherRsr(){
      	for (int i =0; i<listeRsrvtRecep.size();i++){
      		Reservation res = listeRsrvtRecep.get(i);
      		System.out.println(res.toString());
      	}
      	   }	
  

}