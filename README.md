# Design-Pattern-Decorator

## 1. Définition du Decorator Design Pattern

Le **Decorator Design Pattern** (patron de conception Décorateur) est un patron de conception structurel qui permet d'ajouter dynamiquement de nouvelles fonctionnalités à un objet sans modifier sa classe d'origine.

Il consiste à envelopper un objet dans un décorateur qui possède une référence à cet objet et qui peut enrichir son comportement.

Dans cet exemple, nous utilisons le principe d'un système de commande de café dans lequel chaque boisson possède un prix et une description. Des ingrédients supplémentaires, comme le caramel, peuvent être ajoutés dynamiquement pour modifier la description et le coût de la boisson.

### Objectifs

- Ajouter des fonctionnalités à un objet sans modifier son code existant.
- Éviter la multiplication des sous-classes pour chaque combinaison possible.
- Respecter le principe **Open/Closed Principle (OCP)** : une classe doit être ouverte à l'extension, mais fermée à la modification.
- Favoriser la composition plutôt que l'héritage pour ajouter des comportements.

## 2. Principe de fonctionnement

Le fonctionnement du Decorator Pattern repose sur les étapes suivantes :

1. **Créer une boisson de base** : choisir une boisson comme `Deca`, `Espresso` ou `Sumattra`.
2. **Ajouter un décorateur** : envelopper la boisson dans un décorateur comme `Caramel`.
3. **Enrichir la description** : le décorateur ajoute son nom à la description de la boisson.
4. **Calculer le coût total** : le prix du décorateur est ajouté au prix de la boisson.
5. **Combiner plusieurs décorateurs** : plusieurs ingrédients peuvent être ajoutés successivement au même objet.

Le point essentiel est que chaque décorateur se comporte comme une boisson grâce à l'héritage de la classe `Boisson`.

## 3. Classe Boisson

La classe `Boisson` est la classe de base pour toutes les boissons. Elle définit les méthodes communes à toutes les boissons :

- `getDescription()` : retourne la description de la boisson.
- `cost()` : retourne le coût de la boisson.

Ces méthodes sont redéfinies par les sous-classes afin de fournir les informations propres à chaque type de boisson.

![img_1.png](img_1.png)

## 4. Classe Deca

La classe `Deca` est une sous-classe de `Boisson` qui représente une boisson décaféinée.

Elle redéfinit les méthodes suivantes :

- `getDescription()` : retourne la description `"Deca"`.
- `cost()` : retourne le prix de la boisson décaféinée.

![img_2.png](img_2.png)

## 5. Classe Espresso

La classe `Espresso` est une sous-classe de `Boisson` qui représente un espresso.

Elle redéfinit les méthodes suivantes :

- `getDescription()` : retourne la description `"Espresso"`.
- `cost()` : retourne le prix de l'espresso.

![img_3.png](img_3.png)

## 6. Classe Sumattra

La classe `Sumattra` est une sous-classe de `Boisson` qui représente un café Sumatra.

Elle redéfinit les méthodes suivantes :

- `getDescription()` : retourne la description `"Sumatra"`.
- `cost()` : retourne le prix du café Sumatra.

![img_4.png](img_4.png)

## 7. Classe Decorateur

La classe abstraite `Decorateur` étend la classe `Boisson`. Elle constitue la classe de base de tous les décorateurs.

Elle contient une référence à un objet `Boisson`, ce qui permet à un décorateur d'envelopper une boisson existante ou un autre décorateur.

Son rôle est de déléguer les opérations à l'objet décoré tout en permettant aux sous-classes d'ajouter des fonctionnalités.

Méthode principale :

- `getDescription()` : permet de récupérer la description de la boisson décorée, que les sous-classes peuvent enrichir.

La classe `Decorateur` permet ainsi de traiter les boissons et leurs décorateurs de manière uniforme.

![img_5.png](img_5.png)

## 8. Classe Caramel

La classe `Caramel` est une sous-classe de `Decorateur` qui représente l'ajout de caramel à une boisson.

Elle redéfinit les méthodes suivantes :

- `getDescription()` : ajoute `"Caramel"` à la description de la boisson décorée.
- `cost()` : additionne le coût du caramel à celui de la boisson décorée.

Le décorateur peut être appliqué à différentes boissons sans modifier leurs classes respectives.

![img_6.png](img_6.png)

## 9. Exemple de fonctionnement

Prenons une commande composée d'un espresso avec du caramel.

Le fonctionnement logique est le suivant :

1. Créer un objet `Espresso`.
2. Envelopper cet objet dans un décorateur `Caramel`.
3. Appeler `getDescription()` pour obtenir la description complète.
4. Appeler `cost()` pour calculer le prix total.

Le coût total est calculé selon la formule :

**Coût total = Coût de la boisson + Coût des décorateurs**

Il est également possible d'envelopper plusieurs décorateurs les uns dans les autres pour ajouter plusieurs ingrédients à une même boisson.

## 10. Exécution

Les captures d'écran suivantes présentent les résultats de l'exécution du programme. Elles permettent d'observer les descriptions des boissons décorées et les coûts calculés.

![img_7.png](img_7.png)
![img_8.png](img_8.png)
![img_9.png](img_9.png)

## 11. Conclusion

Le Decorator Design Pattern permet d'ajouter des fonctionnalités à des objets de manière flexible et réutilisable.

Dans cet exemple, les boissons constituent les objets de base et les ingrédients supplémentaires sont représentés par des décorateurs. Chaque décorateur enrichit la description et le coût sans modifier la classe initiale de la boisson.

Ce patron de conception est particulièrement utile lorsque plusieurs combinaisons de fonctionnalités sont possibles et que l'on souhaite éviter de créer une sous-classe pour chaque combinaison.

## Technologies et concepts utilisés

- **Langage :** Java
- **Patron de conception :** Decorator (structurel)
- **Concepts Java :** Classes abstraites, héritage, polymorphisme, composition et redéfinition de méthodes

