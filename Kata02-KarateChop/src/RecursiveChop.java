/**
 * A class that implements simple binary search using recursive algorithm.
 * @author PéterIvanics
 */
public class RecursiveChop implements IKarateChop
{
    @Override
    public int chop(int number, int[] array) 
    {
        return this.recursiveChop(number, array, 0, array.length - 1);
    }
    
    /**
     * Performs a binary search on the given parameters.
     * @param number The number to look for.
     * @param array The array in which the number is searched.
     * @param beginIndex The first index to start the search from.
     * @param endIndex The last index to finish the search with.
     * @return The index of the integer in the array if it was found or -1 if the integer does not exists in the array.
     */
    private int recursiveChop(int number, int[] array, int beginIndex, int endIndex)
    {
        if (beginIndex <= endIndex)
        {
            int currentIndex = (endIndex + beginIndex) / 2;
            if (number == array[currentIndex]) // key has been found
                return currentIndex;
            else if (array[currentIndex] < number)
                return this.recursiveChop(number, array, currentIndex + 1, endIndex);
            else if (array[currentIndex] > number) 
                return this.recursiveChop(number, array, beginIndex, currentIndex - 1);
        }
        return -1; 
    }
}
