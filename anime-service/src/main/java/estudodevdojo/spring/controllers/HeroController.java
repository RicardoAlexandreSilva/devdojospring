package estudodevdojo.spring.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("v1/heroes")
public class HeroController {
    private static final List<String> HEROES = List.of("Guts","Zoro","Kakashi","Goku");

    @GetMapping
    public List<String> listAllHeroes(){
        return HEROES;
    }

    @GetMapping("filter")
    public List<String> listAllParm(@RequestParam String name){
        return HEROES.stream().filter(hero ->  hero.equalsIgnoreCase(name)).toList();
    }
    @GetMapping("filterList")
    public List<String> listAllParm(@RequestParam List<String> name){
        return HEROES.stream().filter(name :: contains).toList();
    }

    @GetMapping("{name}")
    public String findByName(@PathVariable String name){
        return HEROES
                .stream()
                .filter(hero -> hero.equalsIgnoreCase(name))
                .findFirst().orElse("");
    }

}