
import java.util.*;
public class Reservation {
	//Variables 
    public int numReservation;
    public Date dateDebut;
    public  Date dateFin;
    public Client client;
    public Sejour sejour;
    public Offre offre;
    public Receptionniste receptionniste;
    public static int  compteur =1;

    //Constructor
   
    public Reservation(
			Date dateDebut, Date dateFin, Client client,
			Offre offre, Receptionniste receptionniste) {
		super();
		this.numReservation =compteur ; compteur++ ;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.client = client;
		this.offre = offre;
		this.receptionniste = receptionniste;
	}
    
    
    //Methods
	/****Methodes checkIn elle sert a confirmer une reservation et retourné un SEjour****/

    public Sejour CheckIn(){
	 Sejour Sj= new Sejour(this.numReservation,this);
	 Sj.AjoutConsoMiniBar();
	 return Sj;
	 
    } 
    
    public int NbJour() {
        int dureeJ=1000*60*60*24;
        int diff = (int) Math.abs(dateFin.getTime() - dateDebut.getTime()); 
        int nbJour = (int)diff/dureeJ;
         return nbJour;
       } 
    
    public float Montant() {
    int nbJur=this.NbJour();
    float montant = (float) (offre.prix*nbJur);
    return montant;
    
    } 
    
	public int getNumReservation() {
		return numReservation;
	}

	public void setNumReservation(int numReservation) {
		this.numReservation = numReservation;
	}

	public Date getDateDebut() {
		return dateDebut;
	}


	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}


	public Date getDateFin() {
		return dateFin;
	}


	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}


	public void setClient (Client c){
	client =c;
	}
	
	public void setSejour (Sejour s){
		sejour =s;
	}
	
	public void setOffre (Offre o){
		offre =o;
	}
	
	public void setRecep (Receptionniste r){
		receptionniste =r;
	}


	@Override
	public String toString() {
		return "Reservation [numReservation=" + numReservation
				+ "dateDebut="
				+ dateDebut + ", dateFin=" + dateFin + "]";
	}

	
	
   

}