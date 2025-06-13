package com.example.User.Controller;



import com.example.User.Entity.User;
import com.example.User.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class Controller {
    @Autowired
    private Repository repo;

    @GetMapping("/all")
    public List<User> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public User getOne(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    @PostMapping("/add")
    public User create(@RequestBody User u) {
        return repo.save(u);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
