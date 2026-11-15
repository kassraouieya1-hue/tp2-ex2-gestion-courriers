# TP 2 : Héritage et Polymorphisme — Exercice 1 : Gestion de magasin

**Nom et prénom :** _à compléter_

## Diagramme de classes UML

```mermaid
classDiagram
    class Article {
        -int numInventaire
        -String designation
        -String couleur
        -double prix
        -String famille
        +Article(int, String, String, double, String)
        +toString() String
        +memeFamille(Article) boolean
    }
    class Article_Lot {
        -int nbPieces
        +Article_Lot(int, String, String, double, String, int)
        +toString() String
    }
    class Magasin {
        -int capacite
        -Article[] stock
        -int nbArticle
        +Magasin(int)
        +ajout(Article) void
        +inventaire() void
    }
    class TestMagasin {
        +main(String[]) void
    }
    Article <|-- Article_Lot
    Magasin "1" o-- "0..*" Article : stock
    TestMagasin ..> Magasin
```

## Compilation et exécution

```bash
javac *.java
java TestMagasin
```
