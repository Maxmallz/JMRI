package jmri.jmrit.simpleprog;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BundleTest.class,
        SimpleProgActionTest.class,
        SimpleProgFrameTest.class,
})

/**
 * Invokes complete set of tests in the jmri.jmrit.simpleprog tree
 *
 * @author	Bob Jacobsen Copyright 2001, 2003, 2012
 */
public class PackageTest  {
}
