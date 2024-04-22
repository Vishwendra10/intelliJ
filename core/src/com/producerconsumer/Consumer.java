package com.producerconsumer;

public class Consumer extends Thread{
    Company c;
    Consumer(Company c)
    {
        this.c=c;
    }
    public void run()
    {
        while(true)
        {
            this.c.consumerMethod();
            try{Thread.sleep(500);}catch(Exception e){}
        }
    }
}
