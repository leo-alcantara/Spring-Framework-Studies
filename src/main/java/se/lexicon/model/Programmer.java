package se.lexicon.model;

import se.lexicon.service.SalaryService;

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

    @Override
    public int getSalary() {
        return salaryService.getSalary();
    }

    public void setSalaryService(SalaryService salaryService) {
        this.salaryService = salaryService;
    }
}
