package re.sision1.bai3.service;

import org.springframework.stereotype.Service;
import re.sision1.bai3.model.Product;
import re.sision1.bai3.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdyctService {
 private  List<Product> products;

    public ProdyctService() {
        this.products = new ArrayList<Product>();
        products.add(new Product(1, "Laptop Dell XPS", 1500.0));
        products.add(new Product(2, "iPhone 15 Pro", 1200.0));
        products.add(new Product(3, "Bàn phím cơ", 100.0));
        products.add(new Product(4, "Chuột Gaming", 50.0));
    }
    public List<Product> getProducts() {
        return products;
    }
    public void addProduct(Product product){
        products.add(product);
    }
    public void updateProduct(int id ,Product updateproduct){
        Product product = getbyid(id);
        if(product!=null){
            products.set(products.indexOf(product),updateproduct);
        }
        else{
            System.out.println("id này ko tồn tại ");
        }
    }
    public void deleteProduct(int id){
        Product product = getbyid(id);
        if(product!=null){
            products.remove(product);
        }
        else{
            System.out.println("id này ko tồn tại ");
        }
    }
    // kiểm tra tồn tại theo id và trả ve 1 product
    private Product getbyid (int id){
        return products.stream().filter(x->x.getId()==id).findFirst().orElse(null);
    }
}
