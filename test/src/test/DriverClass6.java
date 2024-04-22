package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class DriverClass6 {
	public static void main(String[] args)
	{
		int[] frogs= {8,10,5};
		int leaves=80;
		HashSet<Integer> list= new HashSet<>();
        int count=0;
        for(int i=0;i<frogs.length;i++)
        {
            int sum=frogs[i];
            while(sum<=leaves)
            {
                list.add(sum);
                sum+=frogs[i];
            }   
        }
        System.out.println(list);
        for(int i=1;i<=leaves;i++)
        {
            if(!list.contains(i))
            {
                count++;
            }
        }
        if(count!=0)
        {
            System.out.println(count);
        }
        else
        System.out.println(0);
}
	}
