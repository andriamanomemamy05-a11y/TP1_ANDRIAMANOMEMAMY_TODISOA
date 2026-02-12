package com.formation.products.repository;

import com.formation.products.model.Product;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.math.BigDecimal;

@Repository
public class InMemoryProductRepository {

    private final Map<String, Product> products = new ConcurrentHashMap<>();

    // Constructeur : ajouter quelques produits de test
    public InMemoryProductRepository() {
        save(new Product("Produit A", "Description A", new BigDecimal("10.0"), "Cat1", 5));
        save(new Product("Produit B", "Description B", new BigDecimal("20.0"), "Cat2", 3));
    }

    // Crée ou met à jour
    public Product save(Product product) {
        if (product.getId() == null || product.getId().isEmpty()) {
            // création
            product = new Product(
                    product.getName(),
                    product.getDescription(),
                    product.getPrice(),
                    product.getCategory(),
                    product.getStock()
            );
        }
        products.put(product.getId(), product);
        return product;
    }

    public Optional<Product> findById(String id) {
        return Optional.ofNullable(products.get(id));
    }

    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    public List<Product> findByCategory(String category) {
        List<Product> list = new ArrayList<>();
        for (Product p : products.values()) {
            if (p.getCategory().equalsIgnoreCase(category)) {
                list.add(p);
            }
        }
        return list;
    }

    public void delete(String id) {
        products.remove(id);
    }

    public boolean exists(String id) {
        return products.containsKey(id);
    }

    public long count() {
        return products.size();
    }
}
