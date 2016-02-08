package product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Rafał on 2016-02-08.
 */
@Repository
public class ProductRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    public void addProduct(Product product){
        mongoTemplate.save(product,"products");
    }

    public List<Product> allProducts(){
        return mongoTemplate.findAll(Product.class,"products");
    }
}
