package com.producerconsumer;

public class Producer extends Thread{

    Company c;
    Producer(Company c)
    {
        this.c=c;
    }
    public void run()
    {
        int i=1;
        while(true)
        {
            this.c.producerMethod(i);
            try{Thread.sleep(500);}catch(Exception e){}
            i++;
        }
    }
}
