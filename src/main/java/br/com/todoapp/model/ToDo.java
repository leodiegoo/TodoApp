package br.com.todoapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by leonardo on 12/05/2017.
 */
@Entity
public class ToDo implements Serializable {
    private static final Long serialVersionUID  = 1L;

    @Id
    @GeneratedValue
    private Long id;
    private String tarefa;
    private boolean completada;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
}
