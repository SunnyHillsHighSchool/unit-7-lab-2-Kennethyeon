//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListLast
{
	public static boolean go( List<Integer> ray)
	{
    //set a boolean variable called flag to false
    boolean flag = false;
    //if size of list is less than 2 return false
    if (ray.size() < 2)
    {
      return flag;
    }
    //set an integer called val equal to the value of the last number in the list
    int val = ray.get(ray.size()-1);
    //loop through each number in the list using a for loop
    for(int i = 0; i < ray.size() - 1; i++)
    {
      //if the number is equal to val return true
      if (ray.get(i) == val)
      {
        flag = true;
        return flag;
      }
    }
    //else return false
		return false;
	}
}