/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PéterIvanics
 */
public class MyChop implements IKarateChop 
{
    @Override
    public int chop(int number, int[] array) 
    {
        int min = 0, max = array.length - 1;
        
        while (min <= max)
        {
            int mid = this.midPoint(min, max);
            if (array[mid] == number)
                return mid;
            else if (array[mid] < number)
                min = mid + 1;
            else if (array[mid] > number)
                max = mid - 1;
      }
        
        return -1;
    }
    
    private int midPoint(int[] ofArray)
    {
        return this.midPoint(0, ofArray.length - 1);
    }
    
    private int midPoint(int min, int max)
    {
        // return min + ((max - min) / 2);
        return (min + max) / 2;
    }
}
