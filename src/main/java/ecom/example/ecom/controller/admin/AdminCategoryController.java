package ecom.example.ecom.controller.admin;
import ecom.example.ecom.dto.CategoryDto;
import ecom.example.ecom.entity.Category;
import ecom.example.ecom.services.Admin.category.AdminCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
@RequiredArgsConstructor
public class AdminCategoryController {

    private final AdminCategoryService categoryService;


    @PostMapping("/category")
    public ResponseEntity<Category> addCategory(@RequestBody CategoryDto categoryDto){
        Category category = categoryService.createCategory(categoryDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(category);
    }

    @GetMapping("")
    public ResponseEntity<List<Category>> findAllCategories(){
        return ResponseEntity.ok(categoryService.getAllCategories());
    }







}
