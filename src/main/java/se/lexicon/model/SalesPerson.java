package se.lexicon.model;

import se.lexicon.service.SalaryService;


public class SalesPerson implements Employee {

    private SalaryService salaryService;


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


    public void setSalaryService(SalaryService salaryService) {
        this.salaryService = salaryService;
    }
}
