package application.controller;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {
    private String[] frutas = { "Maça", "Banana", "Uva"};

    @GetMapping("/frutas")
    public Iterable<String> get () {
        return Arrays.asList(frutas);
    }

    @GetMapping("/frutas/{id}")
    public String get(@PathVariable int id) {
        return frutas[id];
    }
}
