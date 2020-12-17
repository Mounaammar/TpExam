package ClassTp;

public class Message {
private Utilisateur auteur;
private Destinataire destinataire;
private String texte;
public void setDestinaire(Canal c) {

	
}
public void setTexte(String texte) {
	this.texte=texte;
	
}
public char[] getTexte() {
	// TODO Auto-generated method stub
	char[]texteChar=new char[20];
	for(int i=0 ;i<texte.length();i++) {
		texteChar[i]=texte.charAt(i);
	}
	return texteChar;
}
}
