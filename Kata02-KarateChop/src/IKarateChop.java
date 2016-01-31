/**
 * Interface declaring the methods of the Karate Chop code kata.
 * 
 * @author Péter Ivanics
 * @date 02.01.2016.
 */
public interface IKarateChop 
{
    /**
     * Performs a binary search of the given number in the given array of integers.
     * @param number The number to look for.
     * @param array The array of integers on which the binary search has to be performed. 
     * @return The index of the integer in the array if it was found or -1 if the integer does not exists in the array.
     */
    public int chop(int number, int[] array);
}