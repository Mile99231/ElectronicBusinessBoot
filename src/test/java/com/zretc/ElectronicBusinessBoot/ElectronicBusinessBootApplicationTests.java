package com.zretc.ElectronicBusinessBoot;

import com.zretc.dao.AddressDao;
import com.zretc.pojo.Address;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ElectronicBusinessBootApplicationTests {
@Autowired
	private AddressDao addressDao;
	@Test
	void contextLoads() {
		List<Address> mile = addressDao.select("Mile");
		for (Address address:mile) {
			System.out.println(address);
		}

	}

}
