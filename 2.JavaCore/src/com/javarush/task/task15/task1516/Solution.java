package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

public class Solution {

    public int intVar;
    public double doubleVar;
    public Double DoubleVar;
    public boolean booleanVar;
    public Object ObjectVar;
    public Exception ExceptionVar;
    public String StringVar;

    public static void main(String[] args) {
        Solution thisClass = new Solution();
        System.out.println(thisClass.intVar);
        System.out.println(thisClass.doubleVar);
        System.out.println(thisClass.DoubleVar);
        System.out.println(thisClass.booleanVar);
        System.out.println(thisClass.ObjectVar);
        System.out.println(thisClass.ExceptionVar);
        System.out.println(thisClass.StringVar);

    }
}
