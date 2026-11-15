# TP 2 :Exercice 2 : Gestion des courriers

Nom et prénom :Eya kassraoui

 Diagramme de classes UML

```mermaid
classDiagram
    class Courrier {
        +double TARIF_BASE = 0.5$
        #boolean express
        #String adresse
        +Courrier(express: boolean, adresse: String)
        +estValide() boolean
        +decrire() void
        +affranchir() double
    }
    class Lettre {
        -double poids
        -String format
        +Lettre(express: boolean, adresse: String, poids: double, format: String)
        +decrire() void
        +affranchir() double
    }
    class Colis {
        -double poids
        -double volume
        +Colis(express: boolean, adresse: String, poids: double, volume: double)
        +decrire() void
        +affranchir() double
    }
    class BoiteCourrier {
        -Courrier[] courriers
        -int nbCourriers
        +BoiteCourrier(n: int)
        +ajouter(c: Courrier) void
        +affranchir() double
        +courriersInvalides() int
        +afficher() void
    }
    class TestCourrier {
        +main(args: String[])$ void
    }

    Courrier <|-- Lettre
    Courrier <|-- Colis
    BoiteCourrier "1" o-- "0..n" Courrier
    TestCourrier ..> BoiteCourrier
```

## Formules d'affranchissement

| Type | Montant (normal) | Express |
|------|------------------|---------|
| Courrier | 0.5 | × 2 |
| Lettre | 2.50 (A4) ou 3.50 (A3) + 0.5 × poids (kg) | × 2 |
| Colis | 0.25 × volume (L) + poids (kg) × 1.0 | × 2 |

Un courrier invalide (adresse nulle) a un montant d'affranchissement nul.
