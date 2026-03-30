package re.sision1.bai3.controller;

import org.springframework.web.bind.annotation.*;
import re.sision1.bai3.model.Product;
import re.sision1.bai3.service.ProdyctService;

import java.util.List;

@RestController// trả về html hoăc json
@RequestMapping("/api/products")
public class ProductController {
    private ProdyctService  prodyctService;


    public ProductController(ProdyctService prodyctService) {
        this.prodyctService = prodyctService;
    }


    @GetMapping()
    public List<Product> getallProduct(){
        return prodyctService.getProducts();

    }
    @PostMapping
    public String addProduct(@RequestBody Product product){
        prodyctService.addProduct(product);
        return "success";
    }
    @PutMapping("/{id}")
    public String updateProduct(@PathVariable int id, @RequestBody Product product){
        prodyctService.updateProduct(id, product);
        return "update success";
    }
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id){
        prodyctService.deleteProduct(id);
        return "delete success";
    }
}
