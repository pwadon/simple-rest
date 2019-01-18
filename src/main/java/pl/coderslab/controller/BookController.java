package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController()
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public String getBooks(){
        return "ToDo: getBooks";
    }

    @PostMapping
    public String createBook() {
        return "TODO: postBook";
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id){
        return "ToDO: deleteBook " + id;
    }

    @PutMapping("/{id}")
    public String updateBook(@PathVariable Long id){
        return "TODO: updateBook " + id;
    }
    @RequestMapping("/hello")
    public String hello(){
        return "{hello: World}";
    }
}
