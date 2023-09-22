package com.example.mockitodemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class SomeBusinessImplMockTest {

    @Mock
    private DataService dataServiceMock;

    @InjectMocks
    private SomeBusinessImpl businessImpl;


    @Test
    void findGreatestFromAllData_basicScenario(){


        Mockito.when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1,2,3});

        Assertions.assertEquals(3, businessImpl.findtheGreatestFromAllTheData());
    }
    @Test
    void findGreatestFromAllData_OneValue(){
        Mockito.when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{35});
        Assertions.assertEquals(35, businessImpl.findtheGreatestFromAllTheData());
    }
}
