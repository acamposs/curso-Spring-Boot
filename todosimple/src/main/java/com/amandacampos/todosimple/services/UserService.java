package com.amandacampos.todosimple.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amandacampos.todosimple.models.User;
import com.amandacampos.todosimple.repositories.UserRepository;

@Service

public class UserService {

    @Autowired
    private UserRepository userRepository;

    // encontrar um usuário por id
    public User findById(Long id) {
        Optional<User> user = this.userRepository.findById(id);
        return user.orElseThrow(() -> new RuntimeException(
                "Usuário não encontrado! Id: " + id + ", Tipo: " + User.class.getName()));
    }

    // criar um usuário
    @Transactional
    public User create(User obj) {
        obj = this.userRepository.save(obj);
        this.userRepository.saveAll(obj.getTasks());
        return obj;
    }

    // atualizar um usuário
    public User update(User obj) {
        User newObj = this.findById(obj.getId());
        newObj.setPassword(obj.getPassword());
        return this.userRepository.save(newObj);
    }

    // deletar um usuário
    public void delete(Long id) {
        findById(id);
        try {
            this.userRepository.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException(
                    "Não é possível excluir um usuário com tarefas associadas");
        }
    }

}
