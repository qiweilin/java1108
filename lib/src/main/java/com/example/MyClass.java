package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class MyClass {
    static public void main(String args[])
    {
        MyArrayList n = new MyArrayList() ;

        n.add(1);
        n.add(2);
        n.add(3);
        n.add(4);
        n.add(5);


    }
}

class MyArrayList
{
    Integer [] mArrBase ;

    int mCount = 0 ;

    int maxCount = 3 ;

    MyArrayList() {mArrBase = new Integer[maxCount];}

    public void add(int v)
    {
        if( mCount >= maxCount)
        {
            int oldArr[] = new int[maxCount];

            int i = 0 ;

            for(int n: oldArr)
            {
                oldArr[i] = n;
                i++;
            }
            maxCount *= 2;
            mArrBase = new Integer[maxCount];

            i = 0 ;

            for(int n:oldArr)
            {
                mArrBase[i] = n;
                i++;
            }
            mArrBase[mCount] = v ;
        }
        else
        {
            mArrBase[mCount] = v ;
        }

        System.out.println(mArrBase[mCount]);

        mCount++;
    }


//    ArrayList<Integer>mArr = new ArrayList<Integer>();
//
//    public void add(int index ,Integer value)
//    {
//        mArr.add(10);
//        mArr.add(20);
//        mArr.add(25);
//        mArr.add(30);
//        mArr.add(index,value);
//        System.out.println(mArr);
//    }
//
//    //根据索引来删除
//    //如果删除一个元素后，空余的元素的个数超过整个数组空间的一半
//    //将数组空间缩小到原来的一半
//    public void remove(int index)
//    {
//        mArr.remove(index);
//        System.out.println(mArr);
//        mArr.size();
//
//    }
//    //根据对象来删除
//    public void remove(Integer value)
//    {
//
//    }
//
//    public Integer get(int index)
//    {
//        Integer n = 0 ;
//        return n ;
//    }
//
//    public boolean isContains(Integer value)
//    {
//        return true ;
//    }
//
//    public int indexof(Integer value)
//    {
//        int n = 0 ;
//        return n ;
//    }
}


