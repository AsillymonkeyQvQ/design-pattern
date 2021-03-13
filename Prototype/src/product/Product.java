package product;

public interface Product extends Cloneable {

    void use(String s);

    Product createClone();

}
