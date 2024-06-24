package inheritanceAndPolymorphism.exercise03.entities;

public class IndividualTaxPayer extends TaxPayer {
    
    private Double healthExpenditures;

    public IndividualTaxPayer(){
        super();
    }

    public IndividualTaxPayer(String name, Double anualIncome, Double healthExpenditures){
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    //método abstrato sobreescrito herdado da class taxpayer
    @Override
    public double taxPaid(){

        double tax =0;

        if(this.getAnualIncome() < 20000) {
            tax = this.getAnualIncome() * 0.15;
        }
        else {
            tax = this.getAnualIncome() * 0.25;
        }

        if( this.healthExpenditures > 0) {
            tax = tax - (healthExpenditures*0.5);
        }

        return tax;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

}
