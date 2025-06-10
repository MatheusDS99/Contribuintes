package Contribuintes;

public class TaxPayer {
    private double salaryIncome;
    private double servicesIncome;
    private double capitalIncome;
    private double healthSpending;
    private double educationSpending;

    public void setSalaryIncome(double salaryIncome){
        this.salaryIncome=salaryIncome;
    }
    public void setServicesIncome(double servicesIncome){
        this.servicesIncome=servicesIncome;
    }
    public void setCapitalIncome(double capitalIncome){
        this.capitalIncome=capitalIncome;
    }
    public void setHealthSpending(double healthSpending){
        this.healthSpending=healthSpending;
    }
    public void setEducationSpending(double educationSpending){
        this.educationSpending=educationSpending;
    }

    public double getSalaryIncome(){
        return salaryIncome;
    }
    public double getServicesIncome(){
        return servicesIncome;
    }
    public double getCapitalIncome(){
        return capitalIncome;
    }
    public double getHealthSpending(){
        return healthSpending;
    }
    public double getEducationSpending(){
        return educationSpending;
    }


    public double salaryTax(){
        if ((getSalaryIncome()/12)<3000)
            return 0;
        else if ((getSalaryIncome()/12)<5000)
            return getSalaryIncome()*0.1;
        else
            return getSalaryIncome()*0.2;
    }

    public double servicesTax(){
        if (getServicesIncome()>0)
            return getServicesIncome()*0.15;
        else
            return 0;
    }

    public double capitalTax(){
        if (getCapitalIncome()>0)
            return getCapitalIncome()*0.2;
        else
            return 0;
    }

    public double grossTax(){
        return salaryTax()+servicesTax()+capitalTax();
    }

    public double taxRebate(){
        if (getHealthSpending()+getEducationSpending()>((grossTax())*0.3))
            return grossTax()*0.3;
        else
            return getEducationSpending()+getHealthSpending();
    }

    public double netTax(){
        return grossTax()-taxRebate();
    }



}
