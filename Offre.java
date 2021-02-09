
import java.util.*;

public class Offre {
	
	//Variables
	
    public int numEtage;
    public int numBien;
    public float prix;
    public ArrayList<Reservation> listeReservaDesOffre;
    public static int compteur=1;

    //COnstructor 
    public Offre( int numEtage, float prix) {
		super();
		
		this.numEtage = numEtage;
		this.numBien = compteur; compteur++;
		this.prix = prix;
		listeReservaDesOffre= new ArrayList<Reservation> ();
	}
    
    //Méthods 
    /****
     * Ajouter une Reservation a la listeDesReservationDOffres
     * 
     * ****/
    
	public void AjoutReserva( Reservation r){
		listeReservaDesOffre.add(r);
    }
	
	/***Supprimer reservation de la listeDesResOfffes***/

	public void SuppRes(Date deb ,Date fin, int numR){
	     for (int i =0; i<listeReservaDesOffre.size();i++){
	      Reservation resv = listeReservaDesOffre.get(i);
	      if ((deb.equals(resv.dateDebut))&&  (fin.equals(resv.dateFin))&& (numR==resv.numReservation)){
	    	  listeReservaDesOffre.remove(resv);
	      }	
	     }
	    }
	
	
	
	/***Supprimer reservation de la listeDesResOfffes***/
    public void AfficherRerserva(){
    	
    	for (int i =0; i<listeReservaDesOffre.size();i++){
    		Reservation rese = listeReservaDesOffre.get(i);
    		System.out.println(rese.toString());
    	}	
    } 
    
    /****Verifié Si une offre donné est disponible 
     * ---> on lui met en para date deb et date fin 
     * si elle dispo elle nous retourne true et false sinon ****/
    public boolean Dispo(Date dateD, Date dateF){
     for (int i=0; i<listeReservaDesOffre.size();i++){
     Reservation res = listeReservaDesOffre.get(i);
		   if ( ((dateD.equals(res.dateDebut)&& dateF.equals(res.dateFin))
				   ||(dateD.after(res.dateDebut)&&(dateF.before(res.dateFin)))
				   ||(dateF.after(res.dateFin)&&(dateD.before(res.dateDebut)))
				   ||(dateF.before(res.dateFin)&&(dateD.after(res.dateDebut))))) {
			   System.out.println("l'offre n'est pas disponible pour cette periode de temps");
			         return false;
		      }}
	   System.out.println("l'offre est  disponible pour cette periode de temps");
		return true;}	
   
    
    
    
	public int getNumEtage() {
		return numEtage;
	}

	public void setNumEtage(int numEtage) {
		this.numEtage = numEtage;
	}

	public int getNumBien() {
		return numBien;
	}

	public void setNumBien(int numBien) {
		this.numBien = numBien;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}



	public String toString() {
		return "Offre [ numEtage=" + numEtage
				+ ", numBien=" + numBien + ", prix=" + prix + "]";
	}

	
	
    
    
    
}