package ecom.example.ecom.services.Admin.category;

import ecom.example.ecom.dto.CategoryDto;
import ecom.example.ecom.entity.Category;

import java.util.List;

public interface AdminCategoryService {
    public Category createCategory(CategoryDto categoryDto);
    public List<Category> getAllCategories();
}
