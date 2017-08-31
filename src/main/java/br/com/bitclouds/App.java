package br.com.bitclouds;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Hello world!
 *
 */
@RestController
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    @RequestMapping("/")
    String home(){
	"Hello World!";
    }
}
