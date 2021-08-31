package se.lexicon;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import se.lexicon.model.Employee;

public class App {

    public static void main( String[] args ) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee programmer = context.getBean("programmer", Employee.class);

        Employee salesPerson = context.getBean("salesPerson", Employee.class);


        System.out.println(programmer.getDescription());
        
        System.out.println(salesPerson.getDescription());










    }
}
