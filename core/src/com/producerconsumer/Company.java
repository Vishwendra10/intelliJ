package com.producerconsumer;

public class Company {
    int n;
    boolean flag=false;
    synchronized public void producerMethod(int n)
    {
        if(flag)
        {
            try{wait();}catch(Exception e){}
        }
        this.n=n;
        System.out.println("Producer : "+this.n);
        flag=true;
        notify();
    }
    synchronized public int consumerMethod()
    {
        if(!flag){
            try{wait();}catch(Exception e){}
        }
        System.out.println("Consumer : "+this.n);
        flag=false;
        notify();
        return this.n;

    }
}
