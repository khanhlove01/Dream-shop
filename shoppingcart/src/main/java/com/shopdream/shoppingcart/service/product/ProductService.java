package com.shopdream.shoppingcart.service.product;

import com.shopdream.shoppingcart.exceptions.ProductNotFoundException;
import com.shopdream.shoppingcart.model.Product;
import com.shopdream.shoppingcart.repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService{

    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product not found"));
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.findById(id)
                .ifPresentOrElse(productRepository::delete,
                        () -> {throw new ProductNotFoundException("Product not found");});
    }

    @Override
    public void updateProduct(Product product, Long productId) {

    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return productRepository.findByCategoryName(category);
    }

    @Override
    public List<Product> getProductsByBrand(String brand) {
        return productRepository.findByBrand(brand);
    }

    @Override
    public List<Product> getProductsByCategoryAndBrand(String category, String brand) {
        return productRepository.findByCategoryNameAndBrand(category,brand);
    }

    @Override
    public List<Product> getProductsByName(String name) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByBrandAndName(String category, String name) {
        return List.of();
    }

    @Override
    public Long countProductsByBrandAndName(String brand, String name) {
        return 0L;
    }
}
