package dominos;
/** P3.2 - Dominoes
 * @author [Insert-Your-Name-Here and email here]
 */

public class Domino {
    
    // private members required to implement a Domino. Do not change these.
    private final int end1=0;
    private final int end2=0;
    
    /**
     * This is the Constructor method for a new Domino object. Each domino
     * has two ends with values between 0 and 6.
     * @param end1 the value of the first end, as an int
     * @param end2 the value of the second end, as an int
     */
    public Domino( int end1, int end2 ) {
        //TODO: Write code to assign the end1 and end2 coming into the constructor
        //      as input to the end1 and end2 of the Domino class.
        
    }
    
    /**
     * This method converts a Domino to a string (for printing out)
     * Examples: 
     * the Domino(1,6) should return this string: [1|6]
     * the Domino(0,3) should return this string: [ |3]
     * 
     * @return a String representation of a Domino
     */
    @Override 
    public String toString()
    {
        // TODO: Replace this code with the correct code        
        return "";
    }            
    
    /**
     * Gets the first end of the Domino
     * @return an integer representing the first end
     */
    public int firstEnd() {
        // TODO: Replace this code with the correct code
        return 0;
    }
    
    /**
     * Gets the second end of the Domino
     * @return an integer representing the second end
     */
    public int secondEnd() {
        // TODO: Replace this code with the correct code
        return 0;
    }
    
    /**
     * This method will return true or false based on whether the ends are the same
     * for example [4|3] == false [6|6] == true
     * @return returns true when the domino has identical ends.
     */
    public boolean sameEnds() {
        // TODO: Replace this code with the correct code
        return false;
    }
    
     /**
     * This method will return true or false based on whether one of the ends
     * is a blank (zero)
     * for example [4|3] == false [0|5] == true [3|0] == true [0|0] == true
     * @return returns true when one or both of the ends in blank
     */
    public boolean blankEnd() {
        // TODO: Replace this code with the correct code
        return false;
    }
    
    /**
     * This method adds up both ends on the Domino and returns the total
     * for example [6|2] == 8
     * @return the sum of both ends
     */
    public int total() {
        // TODO: Replace this code with the correct code
        return 0;
    }
    
    /**
     * Checks to see whether two Dominos are the same. Compares this Domino
     * to the Domino passed as a parameter.
     * Examples:
     * [4|2] same as [2|4]
     * [6| ] same as  [6| ]
     * [5|3] not same as [4|4]
     * [4|2] not same as [2|3]
     *      * 
     * @param d the Domino to compare this domino to
     * @return true when the Dominos are the same
     */
    public boolean equals(Domino d) {
        //TODO: Replace this code with the correct code
        return false;
    }
}
