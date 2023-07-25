package com.zretc.ElectronicBusinessBoot;

import com.zretc.dao.AddressDao;
import com.zretc.dao.OrderDao;
import com.zretc.dao.UserDao;
import com.zretc.pojo.Address;
import com.zretc.pojo.Order;
import com.zretc.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ElectronicBusinessBootApplicationTests {
	@Autowired
	private UserDao userDao;
	@Autowired
	private OrderDao orderDao;
	@Test
	void contextLoads() {
		User user = new User("Mile","123456",238888,"2021-01-01");
		if (userDao.reg(user)>0){
			System.out.println("成功");
		}else {
			System.out.println("失败");
		}


	}

}
