package com.zretc.ElectronicBusinessBoot;

import com.zretc.dao.AdminDao;
import com.zretc.dao.GwcDao;
import com.zretc.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ElectronicBusinessBootApplicationTests {

	@Autowired
	private GwcDao gwcDao;
	@Test
	void contextLoads() {

	}

}
