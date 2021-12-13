package factories.regionalfactories;

import business.ToyBusiness;
import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AsianCarToy;
import toyproducts.models.AsianHelicopterToy;

public class AsianHelicopterToyFactory extends ToyFactory{
    @Override
    public Toy createToy() {   
        return new AsianHelicopterToy();

    }
}
