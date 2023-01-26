package com.example.myspringapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeesController {
    @GetMapping("/")
    public List<Employee> getEmployee(){
        List<Employee> prova= new ArrayList<>();
        prova.add(new Employee("Bogdan","Petre",30,"bogdan@gmail.com","Bucuresti","programmer"));
        prova.add(new Employee("Razvan","Popescu",27,"razvan@gmail.com","Roma","cheisti"));
//        return List.of(new Employee("Bogdan","Petre",30,"bogdan@gmail.com","Bucuresti","programmer"),
//                new Employee("Razvan","Popescu",27,"razvan@gmail.com","Roma","cheisti"));
        return prova;
    }
}
