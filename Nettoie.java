

import java.util.*;

public class Nettoie {
	
	// variable 
    public Date dateNettoyage;
    public FemmeDeMenage fm;

    //Constructor
    public Nettoie(Date dateNettoyage,FemmeDeMenage f ) {
    	this.dateNettoyage= dateNettoyage;
    	fm=f;
    	    }

    
    //Méthods
	public Date getDateNettoyage() {
		return dateNettoyage;
	}

	public void setDateNettoyage(Date dateNettoyage) {
		this.dateNettoyage = dateNettoyage;

}


	public FemmeDeMenage getFm() {
		return fm;
	}


	public void setFm(FemmeDeMenage fm) {
		this.fm = fm;
	}}