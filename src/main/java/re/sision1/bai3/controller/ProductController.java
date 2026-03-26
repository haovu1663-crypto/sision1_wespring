package re.sision1.bai3.controller;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import re.sision1.bai3.model.Product;
import re.sision1.bai3.service.StudentService;

import java.util.List;

@Controller
public class ProductController {
    private StudentService studentService;

    public ProductController(StudentService studentService) {
        this.studentService = studentService;
    }

    public List<Product> findAll() {
       return studentService.findAll();
    }
    @GetMapping("/getProduct")
    public List<Product> getallProduct(){
        return studentService.findAll();
    }
}
