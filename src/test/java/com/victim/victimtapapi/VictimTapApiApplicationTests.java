package com.victim.victimtapapi;

import com.victim.victimtapapi.entities.User;
import com.victim.victimtapapi.services.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class VictimTapApiApplicationTests {
	@Autowired
	UserService userService;


	@Test
	void getUserById() {
		User user = userService.getUserById(7L);
		String email = user.getEmail();
		assertEquals("Telly.Hoeger@billy.biz",email);
	}
	@Test
	void getUserByUserName() {
		User user = userService.getUserByUsername("Karianne");
		String phone = user.getPhone();
		assertEquals("493-170-9623 x156",phone);
	}
}
