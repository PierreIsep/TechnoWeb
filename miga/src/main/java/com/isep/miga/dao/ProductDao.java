package com.isep.miga.dao;
import java.util.List;

import com.isep.miga.model.Product;

public interface ProductDao {
    public List<Product>findAll();
    public Product findById(int id);
    public Product save(Product product);
}