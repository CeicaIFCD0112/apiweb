package com.apiweb.apiweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 //@RestController
 //@RequestMapping("/api")
 /*public class ApiController{

        @GetMapping("/hello")
        public String prueba(){
            return "hola mundo";
        }
    }
*/
@RestController
@RequestMapping("/web")
public class ApiController{

     @GetMapping("/hola")
    public String test(){
         return "Ya me puedes ver";
     }
}