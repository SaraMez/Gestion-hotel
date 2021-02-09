
import java.util.*;

public class Sejour {
	
	// Variables 
	public int idsjr;
    public Reservation reservation;
    public ArrayList<Service> listeSrv ;
    
    //Constructor
   
    public Sejour(int idsjr,Reservation res) {
		this.idsjr = idsjr;
	reservation = res;
	listeSrv= new ArrayList<Service>(); ;
	}
    //Méthods
    
    //ajouter mini bar 
    /*****ajouter mini bar 
     * on lui met un id fixe en parama et un montant fixe *****///
    public void AjoutConsoMiniBar(){
     Service miniBar = new Service("minibar",200);
    		listeSrv.add(miniBar);
    }

    
    
    /*****Methode facturation 
     * la facture recoit le montant de tous les services + le montant de la reservation en question
     * *****/
	public float Facturation (){
    	float facture=0;
    	for (int i=0; i<listeSrv.size();i++){
    		Service srv = listeSrv.get(i);
    		facture= (float)(facture + srv.getMontant());
    	}
    	   float resteRsv = ((float) reservation.Montant())+(facture);
    	System.out.println ("le Montant totale de vos service durant ce sejour s'éléve a "+resteRsv+"euro ");
    	return facture+resteRsv;
  
    }
  
   


	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	
	
	
	/****
     * On veut Ajouter un Service  dans la listeDeServices
     * On lui donne Service en parametre 
     * SI:
     *    idSrv du Service Donné en parametre est égale a l'un des idSrv de l'un Des Services
     *     de la listeDesServices
         ----> On Affiche "le service existe deja" ET on ajoute le sevice en question a la listeDesSrv
     * SINON 
     *  ---->on Affiche "le service a bien été ajouté"
     * ****/


	public void AjoutService (Service servi){
   	 for (int i =0; i< listeSrv.size();i++){
   		 Service c =listeSrv.get(i);
   	      if (servi.idService==c.idService) {
   			  System.out.println("le service existe deja");
   	      }
   	 }
   	 listeSrv.add(servi);
   	 System.out.println("le service a bien été ajouté");
   	}
	
	
	/***MEME principe que pour supprimer un sejour ou bien un serveurs vu dans les autres classes**/

	public void SuppSrv (int id){
		for (int i =0; i<listeSrv.size();i++){
	    	Service s =listeSrv.get(i);
		if(id == s.idService){
			listeSrv.remove(s);  
			System.out.println("le service abien été supprimé");
		}else {
			System.out.println("Erreur : le service n'existe pas ");
		}
        }
	}
	  /****Afficher la liste des services****/

	 public void AfficherSrv(){
	      	
	      	for (int i =0; i<listeSrv.size();i++){
	      		Service s = listeSrv.get(i);
	      		System.out.println(s.toString());
	      	}
	      	   }

	@Override
	public String toString() {
		return "Sejour [idsjr=" + idsjr + ", reservation=" + reservation + ", listeSrv=" + listeSrv + "]";
	}

	

}