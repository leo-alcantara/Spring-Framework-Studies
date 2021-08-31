package se.lexicon.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import se.lexicon.service.RandomSalaryService;
import se.lexicon.service.SalaryService;

@Component
public class SalesPerson implements Employee {

    private SalaryService salaryService;

    @Autowired
    public SalesPerson(SalaryService salaryService) {
        this.salaryService = salaryService;
    }

    public SalesPerson() {
    }

    @Override
    public String getDescription() {
        return "We Love SELLING!";
    }

    @Override
    public int getSalary() {
        return salaryService.getSalary();
    }

    public void setSalaryService(RandomSalaryService salaryService) {
        this.salaryService = salaryService;
    }
}
