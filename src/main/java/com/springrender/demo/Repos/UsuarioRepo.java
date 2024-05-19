package com.springrender.demo.Repos;

import com.springrender.demo.Models.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepo extends CrudRepository<Usuario, Integer> {

}
