package product;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Rafał on 2016-02-07.
 */
@Document(collection = "products")
public class Product {
    @Id
    private String id;
    private String name;
    private int amount;

    public Product() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Product(String id, String name, int number) {

        this.id = id;
        this.name = name;
        this.amount = number;
    }
}
