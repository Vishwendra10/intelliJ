package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class DriverClass8 {

	public static void main(String[] args)
	{
		String seisEntitledUser= "angha,mona"; //dir user
        String dirProject=null;	//dir project
        String project="P_ARCH";	//prosource selected project
        String user="mona";	//prosource admin
        
        List<String> entiltledUserList=new ArrayList<>();
        
        if(seisEntitledUser!=null) 
        {
        	String[] strA= seisEntitledUser.split(",");
	        for(String x: strA)
	        {
	            entiltledUserList.add(x);
	        }
        }


        if( (dirProject==null && seisEntitledUser==null) ||

                (dirProject==null && (entiltledUserList.contains(user) || user.equalsIgnoreCase("sis_admin"))) ||
                
                (project.equalsIgnoreCase(dirProject) && (entiltledUserList.contains(user) || user.equalsIgnoreCase("sis_admin"))) ||
                
                (project.equalsIgnoreCase(dirProject) && seisEntitledUser==null)
        )
        {
            System.out.println("success");
        }
        else
        {
            System.out.println("not success");
        }
	}
}

