package estudodevdojo.spring.Dominio;

import lombok.Getter;

import java.util.List;

@Getter
public class Anime {

    private Long id;
    private String name;

    public Anime(Long id , String name){
        this.id = id;
        this.name = name;

    }
    public static List<Anime> getAnimes (){
        var ninjaKamui = new Anime(1L, "Ninja Kamui");
        var Kaijuu = new Anime(2L, "Kaijuu-Bgou");
        var KimetsuNoYaiba = new Anime(3L,  "Kimetsu  NoYaiba");

        return List.of(ninjaKamui,Kaijuu,KimetsuNoYaiba);
    }
}
