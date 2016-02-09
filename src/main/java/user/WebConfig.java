package user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Rafał on 2016-02-09.
 */
@Controller
public class WebConfig {

    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String login(){
        return "login";
    }

}
