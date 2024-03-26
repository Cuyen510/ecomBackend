package ecom.example.ecom.controller.customer;

import ecom.example.ecom.dto.ProductDto;
import ecom.example.ecom.services.Customer.CustomerProductService;
import ecom.example.ecom.services.Customer.CustomerProductServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
@RequiredArgsConstructor
public class CustomerProductController {
    private final CustomerProductService customerProductService;

    @GetMapping("/products")
    public ResponseEntity<List<ProductDto>> getAllProduct(){
        List<ProductDto> productDtos = customerProductService.getAllProduct();
        return ResponseEntity.ok(productDtos);
    }

    @GetMapping("/search/{name}")
    public ResponseEntity<List<ProductDto>> getAllProductByName(@PathVariable String name){
        List<ProductDto> productDtos = customerProductService.getAllProductByName(name);
        return ResponseEntity.ok(productDtos);
    }
}
