package classe;

import java.util.ArrayList;

public class classe {
	protected static float moyenne;
	private String nom;
	private int année;
	private ArrayList liste = new <etudient>ArrayList();
	
	public classe() {
		liste.clear();
	}
	
	public void add(etudient edd) {
		liste.add(edd);
	}

	public void delete(etudient edd) {
		liste.remove(liste.indexOf(edd));
	}

	public float getMoyenne() {
		moyenne = 0;
		
		liste.forEach((item)->moyenne = moyenne + ((etudient) item).getMoyenne());

		moyenne = moyenne/liste.size();
		
		return moyenne;
	}
	
	public ArrayList getListe() {
		return liste;
	}

	public void setListe(ArrayList liste) {
		this.liste = liste;
	}
	
	
}
