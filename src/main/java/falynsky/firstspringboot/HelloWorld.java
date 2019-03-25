package falynsky.firstspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // rodzaj beana (typ klasy zarzadanej przez Spring)
public class HelloWorld {
int i = 1;
int y = 0;
    @RequestMapping("/hello") // wskazanie pod jakim adresem jest dost metoda
    public String hello(){
        System.out.println("Page was reloaded");
        System.out.println(i);
        if(i == 5){
            y++;
            i/=5;
            return "This page was reloaded 5 * "+y+" times yet";

        }
        i++;

        return "Hello World";
    }


}
