package pjwstk.pl;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private List<Product> ownedProduckt = new ArrayList<Product>();

    public Customer(int id, List<Product> ownedProduckt) {
        this.id = id;
        this.ownedProduckt = ownedProduckt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getOwnedProduckt() {
        return ownedProduckt;
    }

    public void setOwnedProduckt(List<Product> ownedProduckt) {
        this.ownedProduckt = ownedProduckt;
    }
}
