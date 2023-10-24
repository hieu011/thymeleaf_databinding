package com.cg.service.product;

import com.cg.model.Category;
import com.cg.model.Product;
import com.cg.service.category.CategoryService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class ProductService implements IProductService {


    private static List<Product> products = new ArrayList<>();

    private CategoryService categoryService;

    static {
        Product product1 = new Product(1,"codegym","aaaa",BigDecimal.valueOf(10000L), new Category(1L,"book"));
        products.add(product1);
    }

        // Khởi tạo một số sản phẩm và thêm vào danh sách `products`

        // Thêm các sản phẩm vào danh sách `products`


    @Override
    public List<Product> findAll() {
        for ( int i = 0; i < products.size(); i++){
            products.get(i).setId(i+1);
        }
        return products;
    }

    @Override
    public Product findById(int id) {
        List<Product> productList = findAll();
        for ( int i = 0; i < productList.size(); i++){
            if(id == productList.get(i).getId()){
                return productList.get(i);
            }
        }
        return null;
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public void update(int id, Product product) {
        int index = products.indexOf(findById(id));
        products.set(index, product);
    }

    @Override
    public void remove(int id) {
        products.remove(findById(id));
    }
}
