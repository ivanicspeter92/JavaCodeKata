/**
 * A class that performs binary search with an iterative algorithm.
 * @author Péter Ivanics
 */
public class IterativeChop implements IKarateChop
{
    @Override
    public int chop(int number, int[] array) 
    {
        int beginIndex = 0, endIndex = array.length - 1;
        
        while (beginIndex <= endIndex)
        {
            int currentIndex = (beginIndex + endIndex) / 2;
//            int currentIndex = beginIndex + ((endIndex - beginIndex) / 2);
            
            if (array[currentIndex] == number) // key has been found
                return currentIndex;
            else if (array[currentIndex] < number) // change begin index to search upper subarray
                beginIndex = currentIndex + 1;
            else if (array[currentIndex] > number) // change end index to search lower subarray
                endIndex = currentIndex - 1;
        }
        
        return -1;
    }
}
