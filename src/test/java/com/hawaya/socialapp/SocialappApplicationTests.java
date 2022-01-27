package com.hawaya.socialapp;

import java.util.List;

import com.hawaya.socialapp.dto.UserDTO;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
class SocialappApplicationTests {

	@Autowired
    private MockMvc mvc;

	@Test
	void contextLoads() {
	}

	@Test
	public void getUsers() throws Exception {
		// List<UserDTO> usersList; 
		mvc.perform(MockMvcRequestBuilders.get("/v1/users")).andDo(print())
		.andExpect(status().isOk());
	}

}
