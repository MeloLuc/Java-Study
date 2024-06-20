package inheritanceAndPolymorphism.exercise02.entities;

public class ImportedProduct extends Product{
    
    private Double customsfee; //taxas alfandegárias

    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String name, Double price, Double customsfee) {
        super(name, price);
        this.customsfee = customsfee;
    }

    public Double getCustomsfee() {
        return customsfee;
    }

    public void setCustomsfee(Double customsfee) {
        this.customsfee = customsfee;
    }

    public double totalPrice() {
        return this.price + customsfee;
    }

    @Override
    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.name + " $ " + String.format("%.2f",this.totalPrice()));
        sb.append(" (Customs fee: $ " +customsfee+ ")");
        return sb.toString();
    }
}
