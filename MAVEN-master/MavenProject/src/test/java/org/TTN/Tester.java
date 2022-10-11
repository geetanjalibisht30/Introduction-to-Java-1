package org.TTN;

import org.junit.Assert;
import org.junit.Test;

import static org.TTN.TestClass.*;

public class Tester {

    @Test
    public  void Test()
    {
        int n= TestClass.add(5);

        Assert.assertEquals("OUTPUT DOESN'T MATCH",10,n);
    }
}
