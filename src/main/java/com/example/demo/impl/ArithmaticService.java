package com.example.demo.impl;

import com.example.demo.interface1.IArithmaticSvc;
import com.example.demo.interface1.IDataSvc;

public class ArithmaticService implements IArithmaticSvc {

    IDataSvc dataSvc;

    public void setDataSvc(IDataSvc dataSvc) {
        this.dataSvc = dataSvc;
    }




    public int sumArray(int[] nums){

        int sum=0;
        for(int num:nums){
            sum+=num;
        }

        return sum;
    }

    public int sumArrayDataSvc(){
        int[] nums = dataSvc.retrieveData();
        int sum=0;
        for(int num:nums){
            sum+=num;
        }

        return sum;
    }

}
