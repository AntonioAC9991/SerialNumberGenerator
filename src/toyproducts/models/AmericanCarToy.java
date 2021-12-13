package toyproducts.models;

import factories.SerialNumberGenerator;
import toyproducts.Toy;

public class AmericanCarToy implements Toy{
    
    private final Integer serialNumber;
    private final String type;
    
    public AmericanCarToy() {
        this.serialNumber = SerialNumberGenerator.getInstance().next();
        type = "Car";
    }
    
    public void pack(){
        System.out.println(type + " serial number: " + serialNumber.toString()+" is packed.\n");
    }
    
    public void label(){
        System.out.println(type + " serial number: " + serialNumber.toString()+" is labelled.\n");
    }
}
