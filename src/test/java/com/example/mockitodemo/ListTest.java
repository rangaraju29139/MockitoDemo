package com.example.mockitodemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

public class ListTest {

    @Test
    void simpleTest(){
        List listMock = Mockito.mock(List.class);
        Mockito.when(listMock.size()).thenReturn(3);
        Assertions.assertEquals(3,listMock.size());
    }
    @Test
    void multipleReturns(){
        List listMock = Mockito.mock(List.class);
        Mockito.when(listMock.get(0)).thenReturn("SomeString");
        Assertions.assertEquals("SomeString", listMock.get(0));
        Assertions.assertEquals(null,listMock.get(1));

    }

    @Test
    void genericParameters(){
        List listMock = Mockito.mock(List.class);
        Mockito.when(listMock.get(Mockito.anyInt())).thenReturn("SomeString");
        Assertions.assertEquals("SomeString", listMock.get(0));
        Assertions.assertEquals("SomeString",listMock.get(1));

    }
}
