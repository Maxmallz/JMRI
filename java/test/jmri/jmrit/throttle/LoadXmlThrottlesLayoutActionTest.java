package jmri.jmrit.throttle;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

/**
 * Test simple functioning of LoadXmlThrottlesLayoutAction
 *
 * @author	Paul Bender Copyright (C) 2016
 */
public class LoadXmlThrottlesLayoutActionTest extends TestCase {

    public void testCtor() {
        LoadXmlThrottlesLayoutAction panel = new LoadXmlThrottlesLayoutAction();
        Assert.assertNotNull("exists", panel );
    }

    // from here down is testing infrastructure
    public LoadXmlThrottlesLayoutActionTest(String s) {
        super(s);
    }

    // Main entry point
    static public void main(String[] args) {
        String[] testCaseName = {"-noloading", LoadXmlThrottlesLayoutActionTest.class.getName()};
        junit.textui.TestRunner.main(testCaseName);
    }

    // test suite from all defined tests
    public static Test suite() {
        TestSuite suite = new TestSuite(LoadXmlThrottlesLayoutActionTest.class);
        return suite;
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        jmri.util.JUnitUtil.setUp();

    }
    
    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        jmri.util.JUnitUtil.tearDown();

    }
}
