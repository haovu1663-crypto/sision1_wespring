package re.sision1.bai3.repository;

import org.springframework.stereotype.Repository;
import re.sision1.bai3.model.Product;

import java.util.ArrayList;
import java.util.List;
@Repository
public class ProductRepository {
    private List<Product> products;

    public ProductRepository() {
        // Khởi tạo danh sách
        products = new ArrayList<>();

        // Tạo các đối tượng và thêm vào list
        products.add(new Product(1, "Laptop Dell XPS", 1500.0));
        products.add(new Product(2, "iPhone 15 Pro", 1200.0));
        products.add(new Product(3, "Bàn phím cơ", 100.0));
        products.add(new Product(4, "Chuột Gaming", 50.0));
    }

    public List<Product> getProducts() {
        return products;
    }
}
