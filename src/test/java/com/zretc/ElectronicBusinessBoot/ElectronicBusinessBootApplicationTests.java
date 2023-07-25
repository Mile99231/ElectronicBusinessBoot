package com.zretc.ElectronicBusinessBoot;

import com.zretc.dao.AdminDao;
import com.zretc.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ElectronicBusinessBootApplicationTests {

	@Autowired
	private AdminDao adminDao;
	@Test
	void contextLoads() {
		User user = new User(1,"1","12",1,"2000-1-1");
		if(adminDao.UpdUser(user)>0){
			System.out.println(2);
		}else {
			System.out.println(1);

		}

	}

}
