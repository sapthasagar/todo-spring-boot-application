package com.sagar.todospringbootapplication.repositories;

import com.sagar.todospringbootapplication.models.TodoItem;
import org.springframework.data.repository.CrudRepository;

public interface TodoItemRepository extends CrudRepository<TodoItem,Long> {

}
