package ecom.example.ecom.services.Admin.adminProduct;

import ecom.example.ecom.dto.ProductDto;

import java.io.IOException;
import java.util.List;

public interface AdminProductService {
    public ProductDto addProduct(ProductDto productDto) throws IOException ;

    public List<ProductDto> getAllProduct() ;

    public List<ProductDto> getAllProductByName(String name);

    public boolean deleteProduct(Long id);
}
