package re.sision1.controller;

import org.springframework.web.bind.annotation.*;
import re.sision1.model.Reques;
import re.sision1.model.Student;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {
  //nhận vào kiểu dữ liệu thương
    @GetMapping("test/sum")
    public int sum(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }
    @PostMapping("tess1/sum")
    public int tess1(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }
    @GetMapping ("/getdata")
    public Student getDate(){
        Student student = new Student(1,"hao","huaGanh","09747","hoa");
        return student;
    }
    @GetMapping("/nguythuy")
    public int nguythuy(){
        int a = 3 ;
        int b =6;
        return a+b;
    }
    @GetMapping("/getlist")
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();

        // Thêm các đối tượng student vào danh sách
        students.add(new Student(1, "hao", "huaGanh", "09747", "hoa"));
        students.add(new Student(2, "hien", "daNang", "01234", "cntt"));
        students.add(new Student(3, "an", "saigon", "05678", "marketing"));

        return students;
    }
    // nhận vào kiểu dữ liệu json
    @PostMapping("/test/sum/json")
    public int json(@RequestBody Reques  reques) {
        return reques.getA()+reques.getB();
    }
}
