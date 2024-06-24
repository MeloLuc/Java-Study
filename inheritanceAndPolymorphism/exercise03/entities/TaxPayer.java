package inheritanceAndPolymorphism.exercise03.entities;

//classe abstrata não pode ser instanciada, mas consigo fazer herança e depois upcasting.
public abstract class TaxPayer {
    
    private String name;
    private Double anualIncome;
    
    public TaxPayer() {
    }

    public TaxPayer(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(double anualIncome) {
        this.anualIncome = anualIncome;
    }
    
    //obrigo as subclasses dessa classe a sobreescrever esse método e obrigo a classe a ser abstrata
    public abstract double taxPaid();
}
