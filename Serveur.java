
import java.util.*;

public class Serveur extends Employe {

    
    public ArrayList<Service> listeService;

    /**
     *constructor
     */
    public Serveur(String nom,String prenom,long tel,Date dateRecrut,double salaire) {
    	super(nom,prenom, tel, dateRecrut,salaire);
    	
    }
    
    
    //METHODS
    /****
     * On veut Ajouter un Service dans la listeDeServices
     * On lui donne service srv en parametre 
     * SI:
     *    idService du Service Donné en parametre est égale a l'un des idServices de l'un 
     *    Des Services de la listeDesServices
         ----> On Affiche "le service existe deja" ET on ajoute le service en question a la listeDesSrv  
     * SINON 
     *  ---->on Affiche "le service a bien été ajouté"
     * ****/
    
    

    public void AjoutService (Service servi){
    	 for (int i =0; i< listeService.size();i++){
    		 Service c =listeService.get(i);
    	      if (servi.idService==c.idService) {
    			  System.out.println("le service existe deja");
    	      }
    	 }
    	 listeService.add(servi);
    	 System.out.println("le service a bien été ajouté");
    	}
    

    /****
     * On veut supprimer un service , on lui donne un idSrv en parametre 
     * on parcours la listeDeServices
     * CONDITION :
     * SI:
     * 		idenSrv donné en parametre est égale a l'un des idServ d'un des services 
     *      de la listeDeServices
     *      ---> on supp avec la fonction remove dans la listeDeServices
     *      ET On affiche "le service a bien été supprimé"
     * SINON :
     *      ---> On affiche "Erreur :le service n'existe pas"
     *      
     * ****/
    
    public void SuppService( int id){
    	for (int i =0; i<listeService.size();i++){
        	Service srv =listeService.get(i);
        if (id==srv.idService){
    	    listeService.remove(srv);
    System.out.println("le service a bien été supprimé");
    }else {
    	System.out.println("Erreur : le service n'existe pas");
    }
    }}
    
    
    /*****Afficher la liste des services *****/

    public void AfficherSrv(){
      	
      	for (int i =0; i<listeService.size();i++){
      		Service srv = listeService.get(i);
      		System.out.println(srv.toString());
      	}
      	   }

	
	
    
    
    
    
    
    
}