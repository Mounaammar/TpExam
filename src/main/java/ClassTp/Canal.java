package ClassTp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Canal implements Destinataire , Comparable<Canal>{
	private Map<Role,List<Utilisateur>> mapping_role_utilisateurs;
	private Integer ordre;
	private List<Webhook> webhooks;
	private String nom;
	private Map<Role,List<Habilitation>> mapping_role_habilitations;
	private List<Message> historiques;
	/*public Canal (Integer ordre,String nom ) {
		mapping_role_utilisateurs=new HashMap<Role, List<Utilisateur>>();
		this.ordre=ordre;
		this.nom=nom;
		webhooks=new ArrayList<Webhook>();
		mapping_role_habilitations =new HashMap<Role, List<Habilitation>>();
		historiques=new ArrayList<Message>();
	}*/
	public Canal () {
		mapping_role_utilisateurs=new HashMap<Role, List<Utilisateur>>();
		webhooks=new ArrayList<Webhook>();
		mapping_role_habilitations =new HashMap<Role, List<Habilitation>>();
		historiques=new ArrayList<Message>();
		
	}
		public void ecrireMessage(Utilisateur u,Message m) {
            
			historiques.add(m);
		}

		public int compareTo(Canal c) {
			
			return Integer.compare(ordre, c.ordre);
		}
		public Map<Role,List<Utilisateur>> getMapping_role_utilisateurs() {
			// TODO Auto-generated method stub
			return mapping_role_utilisateurs;
		}
		public List<Message> getHistoriques() {
			
			return historiques;
		}
		public Map<Role,List<Habilitation>> getMapping_role_habilitations() {
			// TODO Auto-generated method stub
			return mapping_role_habilitations;
		}}

         //getter et setter de nom et ordre
         public String getNom() {
        	 return nom ;
         }
         public String getOrdre() {
        	 return nom ;
         }
         public void setNom(String nom) {
        	 this.nom=nom;
         }
         public void setOrdre(int ordre) {
        	 this.ordre=ordre;
         }
 }
         
