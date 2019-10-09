package xyz.bradibarus.pestovocommunity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ApplicationTest {
    @Autowired
    Application application;

    @Test
    public void contextLoad() {
        assert application != null;
    }
}
