package inheritanceAndPolymorphism.exercise02.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date manufactureDate;

    public UsedProduct(){
        super();
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    @Override
    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.name + "(used) $ " + String.format("%.2f",this.price));
        sb.append(" (Manufacture date: " + sdf.format(manufactureDate) + ")");
        return sb.toString();
    }
    
    
}
