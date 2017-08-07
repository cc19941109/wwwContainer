package com.chen.www;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.chen.www.entity.User;
import com.chen.www.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class test {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void test() {
		User user = userRepository.findByUsername("people");
	}

}
