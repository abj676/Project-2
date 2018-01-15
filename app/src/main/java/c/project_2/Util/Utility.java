package c.project_2.Util;

import android.content.Context;

import c.project_2.Database.DBhelper;

import java.util.ArrayList;
import java.util.Random;


public class Utility
{
    public static boolean isnumber(String price)
    {
        for (int i = 0; i < price.length(); i++) {
            if (!Character.isDigit(price.charAt(i)))
                return false;
        }
        return true;
    }
    public static int randomnumber()
    {
        Random rand=new Random();
        int ran_picked=rand.nextInt(200);
        return ran_picked;
    }
}
