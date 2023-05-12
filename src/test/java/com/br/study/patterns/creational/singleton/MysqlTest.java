package com.br.study.patterns.creational.singleton;

import org.junit.Assert;
import org.junit.Test;

public class MysqlTest {

    @Test
    public void shouldReturnTrueWhenCallingSingleton() {
        Mysql hostUnderTest01 = Mysql.getInstance();
        Mysql hostUnderTest02 = Mysql.getInstance();

        Assert.assertEquals(hostUnderTest01.getUser(), hostUnderTest02.getUser());
        Assert.assertEquals(hostUnderTest01.getHost(), hostUnderTest02.getHost());
        Assert.assertEquals(hostUnderTest01.getPassword(), hostUnderTest02.getPassword());
    }

    @Test
    public void shouldReturnTrueWhenChangingAttribute() {
        Mysql hostUnderTest01 = Mysql.getInstance();
        Mysql hostUnderTest02 = Mysql.getInstance();
        hostUnderTest01.setHost("New User");
        hostUnderTest01.setUser("New host");
        hostUnderTest01.setPassword("New password");

        Assert.assertEquals(hostUnderTest01.getUser(), hostUnderTest02.getUser());
        Assert.assertEquals(hostUnderTest01.getHost(), hostUnderTest02.getHost());
        Assert.assertEquals(hostUnderTest01.getPassword(), hostUnderTest02.getPassword());
    }

}

