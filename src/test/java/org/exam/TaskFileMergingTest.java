package org.exam;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.Arrays;

import static org.exam.TaskFileMerging.removeDuplicates;

/**
 * Unit test for simple App.
 */
public class TaskFileMergingTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TaskFileMergingTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TaskFileMergingTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testRemoveDuplicates() {
        int nums[] = new int[] {-7,-5,-5,-2,-2,0,0,2,2,2,3,5,5,6,8,9,9,10};
        System.out.print(Arrays.toString(nums));
        int k = removeDuplicates(nums);
        System.out.println("<" + k + "> ");
        System.out.print(Arrays.toString(nums));
    }
}
