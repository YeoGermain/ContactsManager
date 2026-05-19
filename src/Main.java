public class Main {
    public static void main(String [] args) {

        //Création d'une nouvelle instance de la classe ContactManager
        ContactsManager myContactsManager = new ContactsManager();

        //Création des contacts
        Contact contactSamuel = new Contact();
        Contact contactYeo = new Contact();
        Contact contactSita = new Contact();
        Contact contactCaller = new Contact();
        Contact contactRachid = new Contact();

        //Assignation des noms et des numéros de téléphone de chaque ami
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

        //Enregistrement de chaque contact
        myContactsManager.addContact(contactSamuel);
        myContactsManager.addContact(contactYeo);
        myContactsManager.addContact(contactSita);
        myContactsManager.addContact(contactCaller);
        myContactsManager.addContact(contactRachid);

        //Déclaration d'une variable initialisée avec le nom à rechercher
        String nom = "Caller";
        //Recherche du nom dans la liste des contacts
        //Déclaration d'une variable de type contact initialisée avec le resultat de la recherche
        Contact result = myContactsManager.searchContact(nom);
        //Vérification de la variable "result" et affichage du numéro de téléphone du contact trouvé
        if(result == null) {
            System.out.println("Contact introuvable");
        }else {
            System.out.println("Contact trouvé! numéro de téléphone: " + result.phoneNumber);
        }
    }
}
