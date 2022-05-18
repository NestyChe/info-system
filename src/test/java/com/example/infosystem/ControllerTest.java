package com.example.infosystem;

import com.example.infosystem.controller.InfoSystemController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ExtendWith(SpringExtension.class)
public class ControllerTest {

    @LocalServerPort
    private int port;
    @Autowired
    private InfoSystemController controller;

    @Test
    public void contextLoadsTest() {
        assertThat(controller).isNotNull();
    }
    @Test
    public void whenGetDataFromFile(){

    }

    @Test
    public void whenGetDataFromDB(){}

    @Test
    public void whenPutDataToFile(){}

    @Test
    public void whenPutDataToDB(){}
}
