package se.lexicon;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import se.lexicon.model.Employee;

public class App {

    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);

        Employee programmer = context.getBean("programmer", Employee.class);

        Employee salesPerson = context.getBean("salesPerson", Employee.class);


        System.out.println(programmer.getDescription());
        System.out.println(programmer.getSalary());

        System.out.println(salesPerson.getDescription());
        System.out.println(salesPerson.getSalary());












    }
}
