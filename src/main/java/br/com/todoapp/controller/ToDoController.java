package br.com.todoapp.controller;

import br.com.todoapp.model.ToDo;
import br.com.todoapp.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by leonardo on 12/05/2017.
 */
@Controller
@RequestMapping("/")
public class ToDoController {

    @Autowired
    private ToDoRepository toDoRepository;

    @GetMapping
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("views/toDo/index");

        modelAndView.addObject("listToDo", toDoRepository.findAll());
        return modelAndView;
    }

    @GetMapping("/add")
    public ModelAndView add(){
        ModelAndView modelAndView = new ModelAndView("views/toDo/add");

        modelAndView.addObject(new ToDo());
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        this.toDoRepository.delete(id);
        return "redirect:/";
    }

    @PostMapping("/create")
    public String create(ToDo toDo){
        this.toDoRepository.save(toDo);
        return "redirect:/add";
    }
}
