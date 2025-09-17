package com.paymentchain.billing;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BasicApplicationTests  {

    @Test
    public void contextLoads() {
       String message = "Default Message cambio test devops";
        Assert.assertNotNull(message);
    }
}
