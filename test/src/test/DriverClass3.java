package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DriverClass3 {
	public static void main(String[] args)
	{
		int[] nums= {1,2};
		
		String s= "aa aa d f  a";
				
		List<String>a = Arrays.asList(s.split("\\s"));
		a.forEach(e->System.out.println(e));
		int size= nums.length/3, count=0,element=nums[0];
        List<Integer> result= new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
            {
                element=nums[i];
            }
            if(count>size)
            {
                result.add(element);
            }
            if(element==nums[i])
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        System.out.println(result);
	}

}
