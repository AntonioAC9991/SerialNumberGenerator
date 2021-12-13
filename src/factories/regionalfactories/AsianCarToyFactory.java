package factories.regionalfactories;

import business.ToyBusiness;
import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AsianCarToy;
import toyproducts.models.AsianHelicopterToy;

public class AsianCarToyFactory extends ToyFactory{

    public Toy createToy() {
        return new AsianCarToy();
    }
}
