package com.example.demo.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ArithmaticServiceTest {
    @InjectMocks
    ArithmaticService arithmaticSvc= new ArithmaticService();

    @Mock
    DataSvc dataSvcMock;

    @Test
    public void serviceTest(){
        assertEquals(arithmaticSvc.sumArray(new int[]{2, 3, 4}),9);
    }


    @Test
    void sumArrayDataSvc() {
        when(dataSvcMock.retrieveData()).thenReturn(new int[]{1,2,3});
        assertEquals(arithmaticSvc.sumArrayDataSvc(),6);
    }
}