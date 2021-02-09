
import java.util.*;

public class Employe {
	
	//Variables
    public int numEmpl;
    public String nom;
    public String prenom;
    public long tel;
    public Date dateRecrut;
    public double salaire ;
    public static int compteur = 1;
    
    
    //Constructor
	public Employe( String nom, String prenom, long tel,Date dateRecrut, double salaire) {
		super();
		this.numEmpl = compteur;compteur++;
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.dateRecrut = dateRecrut;
		this.salaire = salaire;
		
	}
	//Méthods
	public int getNumEmpl() {
		return numEmpl;
	}
	public void setNumEmpl(int numEmpl) {
		this.numEmpl = numEmpl;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public long getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public Date getDateRecrut() {
		return dateRecrut;
	}
	public void setDateRecrut(Date dateRecrut) {
		this.dateRecrut = dateRecrut;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	@Override
	public String toString() {
		return "Employe [numEmpl=" + numEmpl + ", nom=" + nom + ", prenom=" + prenom + ", tel=" + tel + ", dateRecrut="
				+ dateRecrut + ", salaire=" + salaire + "]";
	}
	


	
	
	
	
	
	
}