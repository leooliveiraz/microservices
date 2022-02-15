package br.com.leorocha.userservice.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.leorocha.userservice.dto.StatusDTO;
import br.com.leorocha.userservice.dto.UserDTO;
import br.com.leorocha.userservice.feign.StatusFeign;
import br.com.leorocha.userservice.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.leorocha.userservice.model.User;

@RestController
@RequestMapping("users")
public class UserController {
  @Autowired
  private UserRepo userRepo;
  @Autowired
  private StatusFeign statusFeign;

  @GetMapping("/{id}")
  public UserDTO list(@PathVariable Long id){
    User user = userRepo.findById(id).get();
    UserDTO dto = new UserDTO(user.getId(), user.getName(), user.isValidated());
    return dto;
  }

  @GetMapping
  public List<UserDTO> list(){
    List<User> users = userRepo.findAll();
    List<UserDTO> dtos = new ArrayList<>();
    if(!users.isEmpty())
      users.forEach(user -> dtos.add(new UserDTO(user.getId(), user.getName(), user.isValidated())));
    return dtos;
  }

  @PostMapping
  public UserDTO insert(@RequestBody UserDTO dto){
    User user = new User(dto.getId(), dto.getName(), dto.isValidated());
    userRepo.save(user);
    dto.setId(user.getId());
    statusFeign.save(new StatusDTO(null,20,10,0,user.getId()));

    return dto;
  }
}
