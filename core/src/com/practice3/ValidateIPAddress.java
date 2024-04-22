package com.practice3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIPAddress {
    public static boolean validateIp(String str)
    {
        if(str==null)
        {
            return false;
        }
        String bits= "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        //"(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        String ip= bits + "\\." + bits + "\\." + bits + "\\." + bits;

        Pattern p= Pattern.compile(ip);
        Matcher m= p.matcher(str);

        return m.matches();
    }


    public static void main(String[] args)
    // TODO Auto-generated method stub
    {
        System.out.println(validateIp("172.16.254.111"));
    }
}
