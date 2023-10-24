package com.cg.service.category;

import com.cg.model.Category;
import com.cg.service.IGeneralService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CategoryService implements ICategoryService {

    private static List<Category> categories = new ArrayList<>();

    static {
        Category category1 = new Category(1L,"book");
        Category category2 = new Category(2L,"film");
        categories.add(category1);
        categories.add(category2);
    }
    @Override
    public List<Category> findAll() {
        return categories;
    }

    @Override
    public Category findById(Long id) {
        List<Category> categories1 = findAll();
        for ( int i = 0; i < categories1.size(); i++){
            if(id == categories1.get(i).getId()){
                return categories1.get(i);
            }
        }
        return null ;
    }

    @Override
    public Category save(Category category) {
        return null;
    }

    @Override
    public void delete(Category category) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
