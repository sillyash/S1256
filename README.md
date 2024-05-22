# S1256 - TD3

## Analyse & Qualité - Calcul Budgétaire

### Projet Refonte BALI

#### Hypothèses

L’estimation de la charge du SI "Refonte BALI" qui est une refonte d’OCEAN est réalisée par analogie avec les charges consommées sur le projet "IMAGIN" qui est une refonte du produit "Bourses" :
- Une comparaison entre le nombre de procédures dans l’ancienne application "Bourses" et le nombre d’activités dans la nouvelle application IMAGIN. \
L’application "Bourses" utilisait la même technologie qu’OCEAN et l’architecture de la refonte BALI met en œuvre les mêmes concepts qu’IMAGIN.
- Du coût moyen en réalisation pour une activité IMAGIN, à partir du bilan de fin de projet


#### Chiffrage

- Nb procédures Bourse : ```68```
- Nb d’activités IMAGIN : ```80```
- Total en jours/homme, pour les tâches de développement IMAGIN : ```5350```
- Nb de procédures réalisées dans OCEAN : ```291```

### Questions

#### Q1 - Calculer le coût de développement d’une activité dans IMAGIN

>68 procédures = 80 activités \
>Alors pour 291 procédures dans OCEAN on a : \
>(80 / 68) * 291 = 342 (arrondi au supérieur) \
>On a donc 343 activités dans "Refonte BALI".

#### Q2 - En utilisant les ratios ci-dessous, calculer le coût global de la refonte BALI

>Coût : 5350 / 80 = 66 J.H

>Exemple de calcul : Réalisation \
>66 * 342 = 22572 (coût) \
>22572 / 342 = 66 (coût unitaire)

>Exemple de calcul : Diffusion \
>TODO : Calcul

|          Nom          |Ratio (%)| Coût | Coût unitaire |
|:---------------------:|:-------:|:----:|:-------------:|
| Pilotage              | 15      | 3385 | 10            |
| Spécification         | 20      | 4514 | 13            |
| Réalisation           | 100     | 22572| 66            |
| Qualification         | 35      | 7900 | 23            |
| Conduite du changement| 10      | 2257 | 7             |
| Diffusion             | 30      | 6771 | 19            |

>Coût total unitaire : \
>10 + 13 + 66 + 23 + 7 + 19 = 138 \
>138 * 342 = 47196 J.H

>Coût total : \
>3385 + 4514 + 22572 + 7900 + 2257 + 6771 = 47399 J.H

#### Q3 - Sachant que nous pouvons estimer un degré d’incertitude de :
- \+ ou – ```20J.H``` par activité
- \+ ou – ```50``` activités

#### Calculer la fourchette d'estimation minimale, moyenne, maximale.

>a

<br><br>


