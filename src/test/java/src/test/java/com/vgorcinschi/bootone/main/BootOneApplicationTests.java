package src.test.java.com.vgorcinschi.bootone.main;

import src.main.java.com.vgorcinschi.bootone.main.BootOneApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = BootOneApplication.class)
@WebAppConfiguration
public class BootOneApplicationTests {

	@Test
	public void contextLoads() {
	}

}
