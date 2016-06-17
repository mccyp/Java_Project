package si;
import java.util.ArrayList;
import java.util.Map;

import bibagenda.Employe;
import bibagenda.Service;
import bibagenda.Tache;


public class ServiceInfo extends Service {

		//Attributs
		ArrayList<Materiel> materiels;
		ArrayList<Logiciel> logiciels;
	
		//Constructeurs
		public ServiceInfo(String nom, Map<String, Employe> employes) {
			super(nom, employes);
			// TODO Auto-generated constructor stub
		}
		
		//Methodes			
		public void affecterTache(Tache t){
			
		};		
}
