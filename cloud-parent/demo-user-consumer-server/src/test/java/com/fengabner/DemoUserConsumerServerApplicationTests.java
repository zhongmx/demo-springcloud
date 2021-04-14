package com.fengabner;

import com.fengabner.test.Test01;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@Import(Test01.class)
public class DemoUserConsumerServerApplicationTests{

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private Test01 test01;

    @Test
    public void contextLoads() throws Exception {
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(">>>>>>" + name);
        }
        System.out.println("------\nBean 总计:" + applicationContext.getBeanDefinitionCount());

        test01.toString();
    }
}
