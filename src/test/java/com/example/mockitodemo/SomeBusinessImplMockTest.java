package com.example.mockitodemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class SomeBusinessImplMockTest {
    @Test
    void findGreatestFromAllData_basicScenario(){
        DataService dataServiceMock = Mockito.mock(DataService.class);
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
        Mockito.when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1,2,3});

        Assertions.assertEquals(3, businessImpl.findtheGreatestFromAllTheData());
    }
    @Test
    void findGreatestFromAllData_OneValue(){
        DataService dataServiceMock = Mockito.mock(DataService.class);
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
        Mockito.when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{35});

        Assertions.assertEquals(35, businessImpl.findtheGreatestFromAllTheData());
    }
}
