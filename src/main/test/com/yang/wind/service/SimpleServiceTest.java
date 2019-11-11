package com.yang.wind.service;

import com.yang.wind.dto.Simple;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SimpleServiceTest {

    @Autowired
    SimpleService simpleService;

    @Before
    public void setUp() throws Exception {
        System.out.println("test start...");
    }

    @Test
    public void selectAll(){
        List<Simple> simples = simpleService.selectAll();
        System.out.println(simples.toString());
    }

    @Test
    public void selectByKey(){
        Simple simple = simpleService.selectByName("Yangs");
        Assert.assertNotNull(simple);
    }

    @Test
    public void selectByCols(){
        Simple simple = simpleService.selectByCols("Na", 32, "female");
        Assert.assertNotNull(simple);
    }

    @Test
    public void crudTest(){
        Simple simple = new Simple("temp", 1, "none");
        // 초기데이터 삭제
        simpleService.deleteOne(simple.getName());

        // 등록
        simpleService.insertOne(simple);

        Simple temp1 = simpleService.selectByName("temp");
        Assert.assertNotNull(temp1);
        Assert.assertEquals("temp", temp1.getName());
        Assert.assertEquals(1, temp1.getAge());
        Assert.assertEquals("none", temp1.getGender());

        // 수정
        simple.setAge(2);
        simpleService.updateOne(simple);

        Simple updatedTemp = simpleService.selectByName("temp");
        Assert.assertEquals(2, updatedTemp.getAge());

        // 삭제
        simpleService.deleteOne("temp");
        Assert.assertNull(simpleService.selectByName("temp"));
    }

}