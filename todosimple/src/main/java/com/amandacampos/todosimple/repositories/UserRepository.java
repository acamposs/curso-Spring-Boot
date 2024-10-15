package com.amandacampos.todosimple.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amandacampos.todosimple.models.Task;
import com.amandacampos.todosimple.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    void saveAll(List<Task> tasks);
    /**
     * No repository, não é necessário implementar os métodos de CRUD,
     * pois o Spring Data JPA já faz isso
     */
}
