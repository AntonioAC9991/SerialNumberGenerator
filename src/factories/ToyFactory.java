package factories;

import toyproducts.Toy;

public abstract class ToyFactory {
    public Toy produceToy(){
        Toy toy = createToy();
        toy.pack();
        toy.label();
        return toy;
    }
    public abstract Toy createToy();
}
