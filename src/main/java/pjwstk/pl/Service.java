package pjwstk.pl;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Service {
    Shop shop = null;

    public Service(Shop shop) {
        this.shop = shop;
    }

    private Optional<Product>findProductInShop(int productId){
        Optional<Product> result = Optional.ofNullable(null);
        for(Product product : shop.getAvailableProduct() ){
            if (product.getId() == productId){
                result = Optional.ofNullable(product);
            }
        }
        return result;
    }

    private Optional<Product>findProductInCostomer(int productId, Customer customer){
        Optional<Product> result = Optional.ofNullable(null);
        for (Product product : customer.getOwnedProduckt()){
            if (product.getId() == productId){
                result = Optional.ofNullable(product);
            }
        }
        return result;
    }
    public List<Product> sellProduct(int productId, Customer customer){
        Product fromShop = findProductInShop(productId).get();
        Product toCostomer = findProductInCostomer(productId, customer).get();
        return null;
    }




}
