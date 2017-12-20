package com.karan.demo;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest        // we are asking for the whole application context to be created.
@AutoConfigureMockMvc  // Use of the @AutoConfigureMockMvc together with @SpringBootTest is to inject a MockMvc instance.
public class HelloControllerTest {

	@Autowired
	public MockMvc mvc;


	@Test
	public void getGreetingMessage() throws Exception {

	  mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
          .andExpect(status().isOk())
          .andExpect(content().string(equalTo("Greetings!! Karan Arora, push it")));

	}

}
