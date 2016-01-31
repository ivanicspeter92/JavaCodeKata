/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PéterIvanics
 */
public class IntegerArray {
        /**
     * Gets the subset of an integer array in between the given indeces. 
     * @param ofArray The array for which the subset has to be generated.
     * @param from The index in the original array that has to be included in the subset.
     * @param to The last index in the original array that has to be included in the subset. 
     * @return The subset array of integers including the elements at the "from" and "to" indeces.
     */
    static public int[] subSet(int[] ofArray, int from, int to)
    {
        int[] result = new int[to - from + 1];
        int i = 0; // counter for the elements in the result array
        
        for (int j = from; j <= to; j++) 
        {
            result[i] = ofArray[j];
            i++;
        }
        
        return result; 
    }
}
