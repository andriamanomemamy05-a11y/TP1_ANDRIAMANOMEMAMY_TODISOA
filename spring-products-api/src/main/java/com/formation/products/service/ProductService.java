package com.formation.products.service;

import com.formation.products.model.Product;
import com.formation.products.repository.InMemoryProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final InMemoryProductRepository repository;

    // Injection par constructeur (Spring Boot)
    public ProductService(InMemoryProductRepository repository) {
        this.repository = repository;
    }

    public Product createProduct(Product product) {
        // Validation basique
        if (product.getName() == null || product.getName().isEmpty()) {
            throw new IllegalArgumentException("Le nom est obligatoire");
        }
        if (product.getPrice() == null || product.getPrice().doubleValue() <= 0) {
            throw new IllegalArgumentException("Le prix doit être positif");
        }
        return repository.save(product);
    }

    public Optional<Product> getProduct(String id) {
        return repository.findById(id);
    }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public List<Product> getProductsByCategory(String category) {
        return repository.findByCategory(category);
    }

    public Product updateProduct(String id, Product updatedProduct) {
        Product existing = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Produit inexistant"));
        // Mise à jour
        existing.setName(updatedProduct.getName());
        existing.setDescription(updatedProduct.getDescription());
        existing.setPrice(updatedProduct.getPrice());
        existing.setCategory(updatedProduct.getCategory());
        existing.setStock(updatedProduct.getStock());
        return repository.save(existing);
    }

    public void deleteProduct(String id) {
        if (!repository.exists(id)) {
            throw new IllegalArgumentException("Produit inexistant");
        }
        repository.delete(id);
    }

    public void updateStock(String id, int quantity) {
        Product existing = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Produit inexistant"));
        existing.setStock(quantity);
        repository.save(existing);
    }
}

