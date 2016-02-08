package user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by Rafał on 2016-02-04.
 */
@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @RequestMapping(value = "/", method = GET)
    public String register(Model model){
        model.addAttribute("msg", "Hello");
        model.addAttribute("users", "Hello");
        return "index";
    }

    @RequestMapping(value = "/users", method = GET)
    //@ResponseBody//jeśli ma zwrócić obiekt, a nie szukać nazwy pliku
    public String allUsers(Model model){
        model.addAttribute("collection",userRepository.allUsernames());
        model.addAttribute("element","user");
        return "userData";
    }

    @RequestMapping(value = "/register", method = POST)
    public String register( User user, Model model){
        //user.setDate(LocalDate.now().toString());
        userRepository.add(user);
        model.addAttribute("msg", "User added");
        return "index";
    }

}
