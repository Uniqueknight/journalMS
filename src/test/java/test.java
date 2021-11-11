import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class test {
    @Test
    public void fu(){
        int i = 1;
        assertEquals(2,++i);
    }

    @Test
    public void qu(){
        assertEquals(1,1);

    }


    @Test
    public void qq(){
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy_HH:mm:ss");
        String ns = dateTime.format(formatter);
        System.out.println(ns);
    }


}









