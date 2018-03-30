package classe;

import java.util.ArrayList;
import java.util.List;

public class etudient {
	protected static float moyenne;
	public String nom;
	public String prenom;
	public int age;
	public String sexe;
	public ArrayList<Float> notes = new ArrayList<Float>();
	public Object getNotes;
	
	public etudient(String nom, String prenom, int age, String sexe) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.sexe = sexe;
	}
	
	public void addNote(float note) {
		notes.add(note);
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public ArrayList getNotes() {
		return notes;
	}

	public void setNotes(ArrayList notes) {
		this.notes = notes;
	}

	public float getMoyenne() {
		moyenne = 0;

		notes.forEach((item)->moyenne = moyenne + item);

		moyenne = moyenne/notes.size();
		
		return moyenne;
	}
	
}
