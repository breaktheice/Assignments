package com.example.helloworld.icebreakers;

import java.math.BigInteger;

/**
 * Author : Balamurali
 * Created by IceBreakers on 1/29/17 HW 1 AddUtil.java
 * Add two numbers or two strings irrespective of the length of the input.
 */
public class AddUtil {

    public static void myassert(boolean  x) {
        //CANNOT CHANGE CODE BELOW. MUST USE AS IS
        if (!x) {
            throw new IllegalArgumentException("Assert fail") ;
        }
    }
    private static int add(int a, int b){
        //Write your code here
        return (a + b);
    }

    private static String add(String a, String b) {
        //Write your code here
        if((a.charAt(0) == '-') && (b.charAt(0) == '-')) {
            return "-" + addPvt(a.substring(1), b.substring(1));
        }
        else {
            return addPvt(a, b);
        }
    }

        private static String addPvt(String a, String b) {
        // Handle some base cases
        if(a.length() == 0){
            return b;
        }
        if(b.length() == 0){
            return a;
        }
        StringBuilder sum = new StringBuilder();
        int aLen = a.length()-1, bLen = b.length()-1;
        int tempSum = 0, remainder = 0;
        try {
            while ((aLen >= 0) && (bLen >= 0)) {
                tempSum = (a.charAt(aLen) - '0') + (b.charAt(bLen) - '0') + remainder;
                remainder = tempSum / 10;
                tempSum = tempSum % 10;
                sum.append(tempSum);
                aLen--;
                bLen--;
            }
            while(aLen >= 0){
                tempSum = (a.charAt(aLen) - '0') + remainder;
                sum.append(tempSum);
                remainder = 0;
                aLen--;
            }
            while(bLen >= 0){
                tempSum = (b.charAt(bLen) - '0') + remainder;
                sum.append(tempSum);
                remainder = 0;
                bLen--;
            }
            if(remainder >0){
                sum.append(remainder);
            }

        }catch(NumberFormatException ne){
            ne.printStackTrace();
            return null;
        }
        return sum.reverse().toString();
    }

    private static boolean testStringAdd(String a, String b){
        //CANNOT CHANGE CODE BELOW. MUST USE AS IS
        String s = add(a,b);
        BigInteger sum = new BigInteger(s);
        BigInteger a1 = new BigInteger(a);
        BigInteger b1 = new BigInteger(b);
        return (sum.equals(a1.add(b1)) );
    }

    private static boolean testIntAdd(int a, int b){
        //CANNOT CHANGE CODE BELOW. MUST USE AS IS
        int c = add(a,b);
        return (c == (a+b));
    }
    private static void testBench(){
        //CANNOT CHANGE CODE BELOW. MUST USE AS IS
        myassert(testIntAdd(10,20));
        System.out.println("Pass: 10+20");
        myassert(testStringAdd("11", "22"));
        System.out.println("Pass: 11+22");
        myassert(testStringAdd("1111", "22"));
        System.out.println("Pass: 1111+22");
        myassert(testStringAdd("93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000",
                "93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000"));
        System.out.println("Pass: 100!+100!");
        myassert(testStringAdd("-11", "-22"));
        System.out.println("Pass: -11 + -22");

    }

    public static void main(String args[]){
        //CANNOT CHANGE CODE BELOW. MUST USE AS IS
        System.out.println("AddUtil.java");
        testBench();
        System.out.println("DONE");
    }
}
