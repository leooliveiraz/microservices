package br.com.leorocha.statusservice.controller;

import br.com.leorocha.statusservice.model.Status;
import br.com.leorocha.statusservice.repos.StatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("status")
public class StatusController {
    @Autowired
    private StatusRepo statusRepo;

    @GetMapping
    public List<Status> list(){
        return statusRepo.findAll();
    }

    @GetMapping("/{id}")
    public Status get(Long id){
        return statusRepo.findById(id).get();
    }
    @GetMapping("/user/{id}")
    public Status getByUserId(Long id){
        return statusRepo.findByUserId(id);
    }
    @PostMapping
    public Status save(@RequestBody Status status){
        return statusRepo.save(status);
    }
}
