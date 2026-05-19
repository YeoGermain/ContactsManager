/**
 * Classe représentant un contact.
 * Un contact possède un nom et un numéro de téléphone.
 */
public class Contact {

    /** Nom du contact */
    String name;

    /** Numéro de téléphone du contact */
    String phoneNumber;

    /**
     * Constructeur par défaut de la classe Contact.
     * Initialise le nom et le numéro à une chaîne vide.
     */
    public Contact() {
        this.name = "";
        this.phoneNumber = "";
    }
}