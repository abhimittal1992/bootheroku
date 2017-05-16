package netgloo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import netgloo.configs.UserRepository;
import netgloo.models.User;


@Controller
@RequestMapping(value="/user")
public class UserController {

  private UserRepository repository;
  
  
  @Autowired
  public UserController(UserRepository repository) {
      this.repository = repository;
  }

  
  @RequestMapping(value="/delete")
  @ResponseBody
  public String delete(long id) {
    try {
      User user = new User(id);
      repository.delete(user);
    }
    catch(Exception ex) {
      return ex.getMessage();
    }
    return "User succesfully deleted!";
  }
  
  @RequestMapping(value="/getall")
  @ResponseBody
  public List<User> getByEmail(String email) {
	  	return repository.findAll();
  }

  @RequestMapping(value="/save")
  @ResponseBody
  public String create(String email, String name) {
    try {
      User user = new User(email, name);
      repository.save(user);
    }
    catch(Exception ex) {
      return ex.getMessage();
    }
    return "User succesfully saved!";
  }

} // class UserController
