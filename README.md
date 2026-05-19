______Contacts Manager______

Petit projet Java de gestion de contacts permettant :

-d'ajouter des contacts ;
-d'enregistrer leurs numéros de téléphone ;
-de rechercher un contact par son nom.
____Fonctionnalités____
-Création de contacts
-Ajout de contacts dans un gestionnaire
-Recherche d’un contact par nom
-Affichage du numéro de téléphone du contact trouvé
____Structure du projet____
ContactsManager/
│
├── src/
│   ├── Contact.java
│   ├── ContactsManager.java
│   └── Main.java
│
├── README.md
└── .gitignore

____Classes du projet____

-Contact:
  Représente un contact avec :

    -un nom
    -un numéro de téléphone
    -String name
    -String phoneNumber
    -ContactsManager

Permet de :
  -stocker jusqu’à 500 contacts ;
  -ajouter des contacts ;
  -rechercher un contact par son nom.

____Méthodes principales :____

-addContact(Contact contact)
-searchContact(String searchName)
-Main

____Classe principale du programme.____

Elle permet de :

  -créer des contacts ;
  -les enregistrer ;
  -effectuer une recherche ;
  -afficher le résultat dans la console.
  -Exemple d’exécution
  -Contact trouvé! numéro de téléphone: 0364678467
  ____Technologies utilisées____
  -Java
  -IntelliJ IDEA
  
____Auteur____
Projet réalisé par ____Yeo Germain____.
