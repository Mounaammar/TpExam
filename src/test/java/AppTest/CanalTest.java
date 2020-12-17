package AppTest;

import org.junit.Test;

import ClassTp.Canal;

public class CanalTest {
	     @Test
	    public void ecrireMessageOK() throws ActionNonAutoriseeException {
	        // Etape 1 : préparation des objets
	        Canal c = new Canal();

	        Message m = new Message();
	        m.setDestinaire(c);
	        m.setTexte("Bonne fêtes de fin d'année !");

	        Utilisateur utilisateur = new Utilisateur();
	        c.getMapping_role_utilisateurs().put(new Rôle("Membre"), Arrays.asList(utilisateur));
	        c.getMapping_role_habilitations().put(new Rôle("Membre"), Arrays.asList(Habilitation.ECRITURE));

	        // Etape 2 : appel de la méthode testée
	        c.ecrireMessage(utilisateur, m);

	        // Etape 3 test du retour
	        List<Message> historiques = c.getHistoriques();
	        Assert.assertEquals(1, historiques.size());
	        System.out.println(historiques.get(0).getTexte());
	    }

	    @Test
	    public void ecrireMessageKO() {

	        // Etape 1 : préparation des objets
	        Canal c = new Canal();

	        Message m = new Message();
	        m.setDestinaire(c);
	        m.setTexte("Bonne année 2021 !");

	        Utilisateur utilisateur = new Utilisateur();

	        // Etape 2 : appel de la méthode testée
	        try {
	            c.ecrireMessage(utilisateur, m);

	            // Etape 3 test du retour
	            fail("L'exception aurait du être levée, on ne doit pas passer ici !");
	        } catch (ActionNonAutoriseeException e) {

	            // Etape 3 test du retour = si on arrive ici, le test est concluant
	        }
	    }
}
