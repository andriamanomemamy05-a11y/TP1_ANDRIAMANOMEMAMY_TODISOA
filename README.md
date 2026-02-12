# TP1 - API REST avec Architecture en Couches

## Auteur
ANDRIAMANOMEMAMY Todisoa Bien Aimée - AL

## Lancement du projet Jakarta EE
```cd jakarta-products-api```
```mvn clean package```
```docker compose up -d```

## Lancement du prjet Spring boot
``` cd spring-products-api ```
``` mvn spring-boot:run ```


## Tests
### Jakarta EE : Liste des apis
1. GET : Lister tous les produits
```http://localhost:8080/products-api-1.0-SNAPSHOT/api/products```

2. Get : Récupérer un produit par catégorie
```http://localhost:8080/products-api-1.0-SNAPSHOT/api/products?category=Électronique```

3. GET : Récupéerer un produit par son id
```http://localhost:8080/products-api-1.0-SNAPSHOT/api/products/6bed0159-61e4-4c96-932c-cc0c776bd25f```

4. POST : Création d'un nouveau produit
```http://localhost:8080/products-api-1.0-SNAPSHOT/api/products```

5. PUT  : Modification d'un produit par son id
```http://localhost:8080/products-api-1.0-SNAPSHOT/api/products/aaee3fe3-6127-4734-9795-85bdb3c8d5b9```

6. PATCH : Modifier le champs stock par son id
```http://localhost:8080/products-api-1.0-SNAPSHOT/api/products/aaee3fe3-6127-4734-9795-85bdb3c8d5b9/stock```

7. DELETE : Supprimer un produit par son id
```http://localhost:8080/products-api-1.0-SNAPSHOT/api/products/aaee3fe3-6127-4734-9795-85bdb3c8d5b9```


### Spring Boot : Liste des apis avec le port 8081
1. GET : Lister tous les produits
```http://localhost:8081/api/products```

2. Get : Récupérer un produit par catégorie
```http://localhost:8081/api/products?category=Cat1```

3. GET : Récupéerer un produit par son id
```http://localhost:8081/api/products/bb97de8f-32ea-4f55-8ce6-4e25cd135b7a```

4. POST : Création d'un nouveau produit
```http://localhost:8081/api/products```

5. PUT  : Modification d'un produit par son id
```http://localhost:8081/api/products/8ead2af3-9cc6-482d-aa39-9d9b841b6735```

6. PATCH : Modifier le champs stock par son id
```http://localhost:8081/api/products/8ead2af3-9cc6-482d-aa39-9d9b841b6735/stock?quantity=20```

7. DELETE : Supprimer un produit par son id
```http://localhost:8081/api/products/8ead2af3-9cc6-482d-aa39-9d9b841b6735```


## Difficultés Rencontrées 
Lors du développement, plusieurs difficultés ont été rencontrées.
Tout d’abord, Installation des environnements et création du premier projet avec Maven.
Il y a aussi des erreurs liées aux dépendances Jakarta EE et Spring Boot sont apparues (annotations non reconnues), dues à une mauvaise configuration du pom.xml. Elles ont été résolues en ajoutant les dépendances appropriées et en rechargeant Maven.

Ensuite, des problèmes de typage avec Optional et ResponseEntity ont causé des erreurs de compilation dans les contrôleurs Spring Boot. La solution a été d’utiliser ResponseEntity<?> et orElseGet() afin d’avoir des types cohérents.

Enfin, quelques erreurs liées à la structure du projet (interfaces, packages, gestion Git) ont été corrigées en respectant strictement l’architecture en couches et les conventions Spring.


## Points Clés Appris
1. Architecture en couches : séparation claire entre model, repository, service et controller facilite la maintenance et les tests.

2. Injection de dépendances : comprendre la différence entre Jakarta EE (@Inject) et Spring Boot (@Autowired / injection par constructeur).

3. Gestion des API REST : utilisation de ResponseEntity, codes HTTP corrects et gestion des erreurs cohérente.

4. Différences entre Jakarta EE et Spring Boot : annotations, configuration et gestion des beans.

5. Outils de développement : Maven pour les dépendances, DevTools pour rechargement automatique.
