# SingletonPattern
Le pattern Singleton est un patron de conception qui garantit qu’une classe ne possède qu’une seule instance dans l’application, tout en fournissant un point d’accès global à cette instance.
Il est particulièrement utile lorsque plusieurs parties du programme doivent partager des ressources communes sans créer de duplications coûteuses.


**Authentification:**
  Dans une application, determiné si un utilisateur est connécté ou non.
    Cela implique que seules les utilisateurs autorisé ont accèes à des certains
    fonctionnalité ou donnée. Cela évite le gaspillage de la mémoire si chaque 
    partie de l'application crée sa propre instance de gestion de notification.

**Fichier de Configuration:**
  Suppons que dans une application, plusieur partie ont besoin
    d'acceder à un fichier de configuration et pour éviter le gaspillage
    de mémoire, un seul instance est le plus pratique.

**Log:**
  Pour les messages du systemes comme erreurs, avertissement,
    action utilisateurs doivent être centralisé afin d'éviter que plusieur écritures concurrente
    ne se chevauchent.

**Paramètre:**
  Dans un projet, on a besoin d'un espace de stockage pour 
    des paramètres globaux qui doivent être accessibles à travers 
    différent classes pour minimiser l'utilisation de la mémoire

**Gestion de session des utilisateurs:**
  Pour voir les utilisateurs connecté, par exemple, dans une application web,
    un seul instance est nécessaire pour suivre les utilisateurs connectés.
