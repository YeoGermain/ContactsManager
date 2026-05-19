/**
 * Classe principale du programme.
 */
public class Main {

    /**
     * Point d'entrée du programme.
     *
     * @param args Arguments de la ligne de commande
     */
    public static void main(String[] args) {

        // Création d'une nouvelle instance de ContactsManager
        ContactsManager myContactsManager = new ContactsManager();

        // Création des contacts
        Contact contactSamuel = new Contact();
        Contact contactYeo = new Contact();
        Contact contactSita = new Contact();
        Contact contactCaller = new Contact();
        Contact contactRachid = new Contact();

        // Attribution des informations des contacts
        contactSamuel.name = "Samuel";
        contactSamuel.phoneNumber = "093576563";

        contactYeo.name = "Yeo";
        contactYeo.phoneNumber = "0656653546";

        contactSita.name = "Sita";
        contactSita.phoneNumber = "0168355684";

        contactCaller.name = "Caller";
        contactCaller.phoneNumber = "0364678467";

        contactRachid.name = "Rachid";
        contactRachid.phoneNumber = "053578368";

        // Ajout des contacts
        myContactsManager.addContact(contactSamuel);
        myContactsManager.addContact(contactYeo);
        myContactsManager.addContact(contactSita);
        myContactsManager.addContact(contactCaller);
        myContactsManager.addContact(contactRachid);

        // Nom à rechercher
        String nom = "Caller";

        // Recherche du contact
        Contact result = myContactsManager.searchContact(nom);

        // Affichage du résultat
        if (result == null) {
            System.out.println("Contact introuvable");
        } else {
            System.out.println("Contact trouvé ! numéro de téléphone de " + nom + ": " + result.phoneNumber);
        }
    }
}