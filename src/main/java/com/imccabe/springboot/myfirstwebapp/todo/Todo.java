package com.imccabe.springboot.myfirstwebapp.todo;


import jakarta.validation.constraints.Size;

import java.time.LocalDate;

/**
 * Represents a Todo object
 *
 * <p>
 *     The service processes Todo objects with the following steps
 * </p>
 *
 * <ol>
 *     <li> Generate Todo</li>
 *     <li>Store Todo in the DB</li>
 *     <li>Fetch all other Todo objects</li>
 *     <li>
 *         <p>This todo has a paragraph</p>
 *     </li>
 * </ol>
 */
public class Todo {

    /**
     * Initializes a Todo object
     * @param id
     * @param username
     * @param description
     * @param targetDate
     * @param done
     */
    public Todo(int id, String username, String description, LocalDate targetDate, boolean done) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
        this.done = done;
    }

    private int id;
    private String username;

    @Size(min = 10, message = "Enter at least 10 characters")
    private String description;
    private LocalDate targetDate;
    private boolean done;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", description='" + description + '\'' +
                ", targetDate=" + targetDate +
                ", done=" + done +
                '}';
    }
}
