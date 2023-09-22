package com.example.mockitodemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SomeBusinessImplStubTest {
    @Test
    void test(){
        DataServiceStub dataServiceStub = new DataServiceStub();
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
       int result =  businessImpl.findtheGreatestFromAllTheData();

       Assertions.assertEquals(3,result);
    }
}
class DataServiceStub implements DataService{
    @Override
    public int[] retrieveAllData() {
        return new int[]{1,2,3};
    }
}
