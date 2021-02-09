
import java.util.*;

public class Restaurant extends Offre {
	
	//Variables
	public int numRt;
    public long capacite;
    public double superficie;
   
    
    //Constructor
	public Restaurant( int numEtage, float prix,
		 long capacite, double superficie) {
		super(numEtage, prix);
		this.capacite = capacite;
		this.superficie = superficie;
	}
	
	//Méthods
		//Getters  et setters 
	

	public long getCapacite() {
		return capacite;
	}
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	public double getSuperficie() {
		return superficie;
	}
	public void setSuperficie(float superficie) {
		this.superficie = superficie;
	}

	@Override
	public String toString() {
		return "Restaurant [numRt=" + numRt + ", capacite=" + capacite + ", superficie=" + superficie + ", numEtage="
				+ numEtage + ", numBien=" + numBien + ", prix=" + prix +  "]";
	}
    
   

}