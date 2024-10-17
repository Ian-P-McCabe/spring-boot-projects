package com.imccabe.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>() ;

    static {
        todos.add(
                new Todo(1,
                        "ianm",
                        "learn aws",
                        LocalDate.now().plusYears(1),
                        false
                ));

        todos.add(
                new Todo(2,
                        "ianm",
                        "play MC",
                        LocalDate.now().plusYears(2),
                        false
                ));
        todos.add(
                new Todo(3,
                        "ianm",
                        "play violin",
                        LocalDate.now().plusYears(3),
                        false
                ));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }
}
