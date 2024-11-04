package com.example.conce.liner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class LineExample implements CommandLineRunner {


    @Override
  public void run(String... args) throws Exception {

   // System.out.println("Spring Boot application has started!");
    //... custom code ...

        Runnable r = new Runnable(){
            public void run(){

                System.out.println("Hello wwwwww");
            }
        };
            Thread t = new Thread(r);
            t.start();

            Thread t2 = new Thread(()->{
                System.out.println("Hello from t2");
            });
            t2.start();
  }
    
}
