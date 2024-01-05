package suite;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

/*

 mvn test -Dtest="onlyBSuite"
 */
@Suite
@SelectPackages("suite")
@ExcludeTags("a")
public class onlyBSuite {
    // Runs all tests except those tagged with "a" in the package "suite"
}
