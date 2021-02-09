
import java.util.*;

public class SalleEvenement extends Offre {
	
	//Variables
	public int numSE;
    public long capacite;
    public double superficie;
    
    //Constructor
    public SalleEvenement(int numEtage, 
    		float prix, int numSE, long capacite, double superficie) {
		super( numEtage, prix);
		this.numSE = numSE;
		this.capacite = capacite;
		this.superficie = superficie;
	}

	//Méthods 
	
   
	
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
		return "SalleEvenement [numSE=" + numSE + ", capacite=" + capacite + ", superficie=" + superficie
				+ ", numEtage=" + numEtage + ", numBien=" + numBien + ", prix=" + prix + "]";
	}

	

	

}