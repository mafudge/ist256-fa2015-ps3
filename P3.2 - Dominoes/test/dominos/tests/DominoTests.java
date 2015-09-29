/**
 *
 * @author [Insert-Your-Name-Here]
 */

package dominos.tests;

import dominos.Domino;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author mafudge
 */
public class DominoTests {
    
    public DominoTests() { }

    
    /**
     * This method expects "true" when the second domino end is a blank
     */
    @Test
    public void TestBlankEndExpectTrueWhenSecondEndIsBlank() {
        //Arrange: setup the objects for the test
        Domino d= new Domino(4,0); // Second end is blank
        boolean expected = true;
        //Act: execute what we are testing
        boolean actual =  d.blankEnd();
        //Assert: did we get what we expected?
        Assert.assertEquals(expected, actual);
    }
    
    /**
     * This method expects "true" when the first domino end is a blank
     */
    @Test
    public void TestBlankEndExpectTrueWhenFirstEndIsBlank() {
        //Arrange: setup the objects for the test
        Domino d= new Domino(0,6); // first end is blank
        boolean expected = true;
        //Act: execute what we are testing
        boolean actual =  d.blankEnd();
        //Assert: did we get what we expected?
        Assert.assertEquals(expected, actual);

    }

    /**
     * This method expects "true" when both second domino ends are a blank
     */
    @Test
    public void TestBlankEndExpectTrueWhenBothEndsAreBlank() {
        //Arrange: setup the objects for the test
        Domino d= new Domino(0,0);  //both ends are blank
        boolean expected = true;
        //Act
        boolean actual =  d.blankEnd();
        //Assert: are they equal?
        Assert.assertEquals(expected, actual);
    }
    
    /**
     * This method expects "true" when both ends are the same
     */
    @Test
    public void TestSameEndsExpectTrueWhenBothEndsAreTheSame() {
        //Arrange: setup the objects for the test
        Domino d= new Domino(3,3); // Both ends are "3"... thus the same.
        boolean expected = true;
        //Act
        boolean actual =  d.sameEnds();
        //Assert: are they equal?
        Assert.assertEquals(expected, actual);
    }
    
    /**
     * This method expects "false " when both ends are not the same
     */
    @Test
    public void TestSameEndsExpectFalseWhenBothEndsAreNotTheSame() {
        //Arrange: setup the objects for the test
        Domino d= new Domino(5,2);  // these are different ends
        boolean expected = false;
        //Act
        boolean actual =  d.sameEnds();
        //Assert: are they equal?
        Assert.assertEquals(expected, actual);
    }

    /**
     * This method expects "false " when two Dominos are not the same
     */
    @Test
    public void TestEqualsExpectFalseWhenTwoDominosAreNotTheSame() {
        //Arrange: setup the objects for the test
        Domino d1= new Domino(3,2); 
        Domino d2= new Domino(3,6); // not the same!
        boolean expected = false;
        //Act
        boolean actual =  d1.equals(d2);
        //Assert: are they equal?
        Assert.assertEquals(expected, actual);
    }

    /**
     * This method expects "true " when two Dominos are exactly the same
     * eg. [6|0] and [6|0]
     */
    @Test
    public void TestEqualsExpectTrueWhenTwoDominosAreExactlyTheSame() {
        //Arrange: setup the objects for the test
        Domino d1= new Domino(3,5);
        Domino d2= new Domino(3,5); // exactly the same!
        boolean expected = true;
        //Act
        boolean actual =  d1.equals(d2);
        //Assert: are they equal?
        Assert.assertEquals(expected, actual);
    }

    /**
     * This method expects "true " when two Dominos are opposites, but still 
     * in essence the same Domino eg. [5|1] and [1|5]
     */
    @Test
    public void TestEqualsExpectTrueWhenTwoDominosAreOppositesButTheSame() {
        //Arrange: setup the objects for the test
        //TODO: Edit the two lines below to make two identical dominos,
        Domino d1= new Domino(5,2);
        Domino d2= new Domino(2,5); // these are opposite dominoes
        boolean expected = true;
        //Act
        boolean actual =  d1.equals(d2);
        //Assert: are they equal?
        Assert.assertEquals(expected, actual);
    }

}
