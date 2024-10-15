package com.amandacampos.todosimple.repositories;

import java.util.List;

import javax.validation.Valid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amandacampos.todosimple.models.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByUser_Id(Long userId);

    /**
     * No repository, não é necessário implementar os métodos de CRUD,
     * pois o Spring Data JPA já faz isso
     */

}
