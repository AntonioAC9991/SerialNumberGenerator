package factories.regionalfactories;

import business.ToyBusiness;
import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AmericanHelicopterToy;

public class AmericanCarToyFactory extends ToyFactory{
    @Override
    public Toy createToy() {
        return new AmericanCarToy();
    }
}
