package user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Rafal on 2016-01-31.
 */
@Repository
public class UserRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    public LinkedList<String> allUsernames(){
        LinkedList<String> list = new LinkedList<>();
        all().forEach(user -> list.add(user.getUsername()));
        return list;
    }



    public void add(User u){
        mongoTemplate.save(u,"users");
    }

    public List<User> all(){
    return mongoTemplate.findAll(User.class,"users");
    }
}
