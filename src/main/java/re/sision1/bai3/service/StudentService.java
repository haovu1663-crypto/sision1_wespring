package re.sision1.bai3.service;

import org.springframework.stereotype.Service;
import re.sision1.bai3.model.Product;
import re.sision1.bai3.repository.ProductRepository;

import java.util.List;

@Service
public class StudentService {
    private ProductRepository productRepository;

    public StudentService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public List<Product> findAll() {
        return productRepository.getProducts();
    }
}
