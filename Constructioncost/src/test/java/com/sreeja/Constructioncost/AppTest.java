package com.sreeja.Constructioncost;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	 CostCalculation costcalculate = new CostCalculation ();
         assertEquals(10500,costcalculate.Cost("standard", 7 , false),0.0);
         assertEquals(15300,costcalculate.Cost("aboveStandard", 9, false),0.0);
         assertEquals(29700,costcalculate.Cost("highStandard", 11 , false),0.0);
         assertEquals(25200,costcalculate.Cost("highStandard", 12 , true),0.0);
    }
}
