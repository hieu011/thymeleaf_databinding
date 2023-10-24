package com.cg.service.product;

import com.cg.model.Product;
import com.cg.service.IGeneralService;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    void update(int id, Product product);

    void remove(int id);


}
