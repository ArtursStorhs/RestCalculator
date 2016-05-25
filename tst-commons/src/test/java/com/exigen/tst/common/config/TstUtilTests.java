package com.exigen.tst.common.config;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by astorhs on 2016.05.02..
 */
public class TstUtilTests {

    @Test
    public void getProperty(){
       TstUtil tstUtil= new TstUtil();
        Assert.assertEquals("pizza",tstUtil.getProperty("a"));
        Assert.assertEquals("cheese",tstUtil.getProperty("b"));
        Assert.assertEquals("cocaCola",tstUtil.getProperty("c"));
}
    @Test(expected = TstException.class)
    public void getPropertyExeption() throws Exception {
        TstUtil tstUtil= new TstUtil();
        tstUtil.getProperty("d");
    }
}