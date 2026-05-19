/**
 * Classe permettant de gérer une liste de contacts.
 */
public class ContactsManager {

    /** Tableau contenant les contacts */
    Contact[] myFriends;

    /** Nombre actuel de contacts enregistrés */
    int friendsCount;

    /**
     * Constructeur par défaut de la classe ContactsManager.
     * Initialise le tableau de contacts et le compteur.
     */
    ContactsManager() {
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    /**
     * Ajoute un contact dans la liste.
     *
     * @param contact Contact à ajouter
     */
    public void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    /**
     * Recherche un contact par son nom.
     *
     * @param searchName Nom du contact recherché
     * @return Le contact trouvé ou null si aucun contact ne correspond
     */
    public Contact searchContact(String searchName) {

        for (int i = 0; i < friendsCount; i++) {

            if (myFriends[i].name.equals(searchName)) {
                return myFriends[i];
            }
        }

        return null;
    }
}