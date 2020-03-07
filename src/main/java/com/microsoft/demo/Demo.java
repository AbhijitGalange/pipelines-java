package com.microsoft.demo;

public class Demo {
    public void DoSomething(boolean flag){
        if(flag){
            System.out.println("I am covered");
            System.out.println("This is Microsoft Azure DevOps CI CD POC done for ADT Project");
            return;
        }

        System.out.println("I am not covered");
        System.out.println("This is Microsoft Azure DevOps CI CD POC done for ADT Project");
    }
}