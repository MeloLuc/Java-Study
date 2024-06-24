package inheritanceAndPolymorphism.exercise03.entities;

public class CompanyTaxPayer extends TaxPayer{

    private Integer numberEmployees;

    
    public CompanyTaxPayer(){
        super();
    }

    public CompanyTaxPayer(String name, Double anualIncome, Integer numberEmployees) {
        super(name, anualIncome);
        this.numberEmployees = numberEmployees;
    }

    //método abstrato sobreescrito herdado da class taxpayer
    @Override
    public double taxPaid() {

        double tax =0;

        if(this.numberEmployees > 10) {
            tax = this.getAnualIncome() * 0.14;
        }
        else {
            tax = this.getAnualIncome() * 0.16;
        }

        return tax;
    }

    public Integer getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(Integer numberEmployees) {
        this.numberEmployees = numberEmployees;
    }
    
}
