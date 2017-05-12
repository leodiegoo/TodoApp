package br.com.todoapp.repository;

import br.com.todoapp.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by leonardo on 12/05/2017.
 */
public interface ToDoRepository extends JpaRepository<ToDo, Long> {
}
