# TP 2 :Exercice 2 : Gestion des courriers

Nom et prénom :Eya kassraoui

 #Diagramme de classes UML
 **Classe Courrier**

Attributs :
- modeExpedition : boolean
- adresse : String
- tarifBase : double (constante = 0.5)

Méthodes :
- Courrier(boolean, String)
- estValide() : boolean
- decrire() : void
- affranchir() : double

**Classe Lettre**

Hérite de la classe Courrier.

Attributs :
- poids : double
- format : String

Méthodes :
- Lettre(...)
- decrire() : void
- affranchir() : double

**Classe Colis**

Hérite de la classe Courrier.

Attributs :
- poids : double
- volume : double

Méthodes :
- Colis(...)
- decrire() : void
- affranchir() : double

**Classe BoiteCourrier**

Attribut :
- courriers : Courrier[]

Méthodes :
- affranchir() : double
- courriersInvalides() : int
- afficher() : void

**Relations :**
- Lettre hérite de Courrier.
- Colis hérite de Courrier.
- BoiteCourrier contient plusieurs Courriers.s


