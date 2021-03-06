package pjwstk.pl;


import java.util.ArrayList;
import java.util.List;


public class Shop {
    private int id;
    @ShopName
    private String name;
    private List<Product> availableProduct = new ArrayList<Product>();
    private List<Product> soldProduct = new ArrayList<Product>();

    public Shop(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getAvailableProduct() {
        return availableProduct;
    }

    public void setAvailableProduct(List<Product> availableProduct) {
        this.availableProduct = availableProduct;
    }

    public List<Product> getSoldProduct() {
        return soldProduct;
    }

    public void setSoldProduct(List<Product> soldProduct) {
        this.soldProduct = soldProduct;
    }
}
