package com.example.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Customer;

@RestController
@RequestMapping("/test")
public class CustomerController {

    @GetMapping
    public List<Customer> customerList() {
    	
        Customer c1 = new Customer("1", "Cure", "Ture", null);
        Customer c2 = new Customer("2", "Cure2", "Ture2", null);
        List<Customer> result = new ArrayList<>();
        result.add(c1);
        result.add(c2);
 		
        return result;
    }
}
