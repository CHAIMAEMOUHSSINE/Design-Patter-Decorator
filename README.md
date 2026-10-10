# Design-Patter-Decorator
La class Boisson est la classe de base pour toutes les boissons. Elle contient une méthode getDescription() qui retourne la description de la boisson et une méthode cost() qui retourne le coût de la boisson.
![img_1.png](img_1.png)
La class Deca est une sous-classe de Boisson qui représente une boisson décaféinée. Elle surcharge la méthode getDescription() pour retourner "Deca" et la méthode cost() pour retourner le coût de la boisson décaféinée.
![img_2.png](img_2.png)
La class Espresso est une sous-classe de Boisson qui représente un espresso. Elle surcharge la méthode getDescription() pour retourner "Espresso" et la méthode cost() pour retourner le coût de l'espresso.
![img_3.png](img_3.png)
La class Sumattra est une sous-classe de Boisson qui représente un café Sumatra. Elle surcharge la méthode getDescription() pour retourner "Sumatra" et la méthode cost() pour retourner le coût du café Sumatra.
![img_4.png](img_4.png)
La class Decorateur est une classe abstraite qui étend la classe Boisson. Elle contient une référence à un objet Boisson et surcharge la méthode getDescription() pour retourner la description de la boisson décorée.
![img_5.png](img_5.png)
La class Caramel est une sous-classe de Decorateur qui représente un décorateur de caramel. Elle surcharge la méthode getDescription() pour retourner la description de la boisson décorée avec "Caramel" et la méthode cost() pour retourner le coût de la boisson décorée avec le coût du caramel.
![img_6.png](img_6.png)

# l'éxecution
![img_7.png](img_7.png)
![img_8.png](img_8.png)
![img_9.png](img_9.png)