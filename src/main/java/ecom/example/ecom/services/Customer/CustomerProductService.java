package ecom.example.ecom.services.Customer;

import ecom.example.ecom.dto.ProductDto;

import java.util.List;

public interface CustomerProductService {
    public List<ProductDto> getAllProduct();
    public List<ProductDto> getAllProductByName(String name);
}
