package bibagenda;

import java.util.ArrayList;
import java.util.List;
import java.security.SecureRandom;
import java.math.BigInteger;

public class Employe {

	//Attributes
	private String idEmp;
	private String nom;
	private List<Creneau> creneaux;
	private Service s;
	
	//Constructor
	public Employe(String nom,Service s){
		
		this.setS(s);
		this.nom = nom;
		SecureRandom random = new SecureRandom();
		String idTemp = new BigInteger(45, random).toString(32);
		
		//On boucle pour verifier si l'id qu'on genere aleatoirement 
		//n est pas deja attribue a un employe du service
		while(s.employeExistsInService(idTemp)){
			idTemp = new BigInteger(45, random).toString(32);
		}
		
		this.idEmp = idTemp;
		this.creneaux = new ArrayList<Creneau>();
		
		
	}
	//Methods
	public List<Creneau> getCreneauxLibresEmp(){
		//TODO
		return new ArrayList<Creneau>();
	}
	public List<Creneau> getEdt(){		
		return this.creneaux;		
	}
	public String toString(){
		return idEmp + " " + nom;
	}
	//Getters & setters
	public String getIdEmp() {
		return idEmp;
	}
	public void setIdEmp(String idEmp) {
		this.idEmp = idEmp;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Creneau> getCreneaux() {
		return creneaux;
	}
	public void setCreneaux(List<Creneau> creneaux) {
		this.creneaux = creneaux;
	}
	public Service getS() {
		return s;
	}
	public void setS(Service s) {
		this.s = s;
	}
	
	
}
