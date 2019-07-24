package com.demo.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.demo.controller.MyController;
import com.demo.repository.BookRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/beans.xml")
public class MyControllerTest {

	private MockMvc mockMvc;
	@Mock
	private BookRepository bookRepository;
	@InjectMocks
	private MyController controller=new MyController();
	@Before
	public void setUp()
	{
		MockitoAnnotations.initMocks(this);
		mockMvc=MockMvcBuilders.standaloneSetup(controller).build();
	}
	
	@Test
	public void display() throws Exception {
		mockMvc.perform(get("/")).andExpect(status().isOk()).andExpect(view().name("disp")).andExpect(forwardedUrl("disp"));
	}
	
	@Test
	public void add() throws Exception {
		mockMvc.perform(post("/add").param("id","1").param("name","Java")).andExpect(redirectedUrl("/"));
	}
	}
	
	

