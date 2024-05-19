package com.springrender.demo.Controllers;

import com.springrender.demo.Models.BasicRecord;
import com.springrender.demo.Models.Usuario;
import com.springrender.demo.Repos.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/basic")
public class BasicController {

    UsuarioRepo usuarioRepo;
    @Autowired
    public void setUsuarioRepo(UsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    @GetMapping
    public BasicRecord basic() {
        return new BasicRecord(1,"Un mensaje pero cambiado" , "de mangano");
    }

    @GetMapping("/2")
    public Iterable<Usuario> getUsuarios(){
        return usuarioRepo.findAll();
    }
    @PostMapping
    public void postUser(@RequestBody Usuario usuario) {
        usuarioRepo.save(usuario);
    }
}
