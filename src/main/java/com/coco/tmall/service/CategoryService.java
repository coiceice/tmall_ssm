package com.coco.tmall.service;

import com.coco.tmall.pojo.Category;

import java.util.List;

public interface CategoryService {
    List<Category> list();
//    List<Category> list(Page page);
//    int total();
    void add(Category category);
    void delete(int id);
    Category get(int id);
    void update(Category category);
}
