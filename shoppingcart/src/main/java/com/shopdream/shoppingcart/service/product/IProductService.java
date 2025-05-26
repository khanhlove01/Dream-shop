package com.shopdream.shoppingcart.service.product;

import com.shopdream.shoppingcart.model.Product;
import com.shopdream.shoppingcart.request.AddProductRequest;
import com.shopdream.shoppingcart.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService{
    Product addProduct(AddProductRequest request);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    Product updateProduct(ProductUpdateRequest request, Long productId);

    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String category, String name);

    Long countProductsByBrandAndName(String brand, String name);
}
