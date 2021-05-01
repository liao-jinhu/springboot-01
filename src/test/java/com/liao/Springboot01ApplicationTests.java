package com.liao;

import com.liao.pogo.Dog;
import com.liao.pogo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot01ApplicationTests {
    @Autowired
    private Dog dog;
    @Autowired
    private Person person;


    @Test
    void contextLoads() {
        System.out.println(dog.toString());
        System.out.println(person.toString());

    }

}
