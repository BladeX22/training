package product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Rafał on 2016-02-08.
 */
@Repository
public class OrderRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    public void addOrder(Order order){
        mongoTemplate.save(order,"orders");
    }

    public List<Order> allOrders(){
        return mongoTemplate.findAll(Order.class,"orders");
    }
}
