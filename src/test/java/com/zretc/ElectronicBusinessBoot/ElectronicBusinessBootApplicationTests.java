package com.zretc.ElectronicBusinessBoot;

import com.zretc.dao.AddressDao;
import com.zretc.dao.OrderDao;
import com.zretc.pojo.Address;
import com.zretc.pojo.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ElectronicBusinessBootApplicationTests {
	@Autowired
	private AddressDao addressDao;
	@Autowired
	private OrderDao orderDao;
	@Test
	void contextLoads() {
		List<Order> orders = orderDao.selOrder("Mile");
		for (Order o:orders) {
			System.out.println(o);
		}

	}

}
