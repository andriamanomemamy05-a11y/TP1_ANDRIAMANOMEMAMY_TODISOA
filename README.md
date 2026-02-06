# TP1 - API REST avec Architecture en Couches

## Auteur
ANDRIAMANOMEMAMY Todisoa Bien Aimée - AL

## Lancement du projet Jakarta EE
```cd jakarta-products-api```
```mvn clean package```
```docker compose up -d```

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

## Difficultés Rencontrées
### Jakarta EE : 
Installation des environnements et création du premier projet avec Maven, la configuration de pom.xml avec jakarta etc

## Points Clés Appris
