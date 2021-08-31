package se.lexicon.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import se.lexicon.service.SalaryService;

@Component
public class Programmer implements Employee {

    private SalaryService salaryService;


    public Programmer(SalaryService salaryService) {
        this.salaryService = salaryService;
    }

    public Programmer() {
    }

    @Override
    public String getDescription() {
        return "We love CODING!";
    }

    @Autowired
    public void setSalaryService(SalaryService salaryService) {
        this.salaryService = salaryService;
    }

    @Override
    public int getSalary() {
        return salaryService.getSalary();
    }


}
