package com.cogent.demo;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.transaction.annotation.Transactional;

import com.cogent.demo.dao.ExpenseRepository;
import com.cogent.demo.model.Expense;
 
@SpringBootApplication
public class ExpenseApp implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(ExpenseApp.class);
    @Autowired
    ExpenseRepository repository;
     
    public static void main(String[] args) {
        SpringApplication.run(ExpenseApp.class, args);
    }
 
    @Override
    public void run(String... args) throws Exception {
//        repository.save(new Expense("breakfast", 5));
//        repository.save(new Expense("coffee", 2));
//        repository.save(new Expense("New SSD drive", 200));
//        repository.save(new Expense("Tution for baby", 350));
//        repository.save(new Expense("Some apples", 5));
         
//        Iterable<Expense> iterator = repository.findAll();
//         
//        System.out.println("All expense items: ");
//        iterator.forEach(item -> System.out.println(item));
//         
//        List<Expense> breakfast = repository.findByItem("breakfast");
//        System.out.println("\nHow does my breakfast cost?: ");
//        breakfast.forEach(item -> System.out.println(item));
         
//        List<Expense> expensiveItems = repository.listItemsWithPriceOver(200);
//        System.out.println("\nExpensive Items: ");
//        expensiveItems.forEach(item -> System.out.println(item));
        
    	logger.info("# of employees: {}", repository.count());

        logger.info("All employees unsorted:");

        Iterable < Expense > expenses = repository.findAll();
        Iterator < Expense > iterator = expenses.iterator();
        while (iterator.hasNext()) {
            logger.info("{}", iterator.next().toString());
        }

        logger.info("------------------------");

        logger.info("Deleting item with id 2");
        repository.deleteById(2l);

        logger.info("# of items: {}", repository.count());

        repository.existsById(3L);
        repository.findById(3L);
    		
}
}