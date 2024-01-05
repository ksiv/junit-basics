package suite;


import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

/*

 mvn test -Dtest="onlyASuite"
 */
@Suite
@SelectPackages("suite")
@IncludeTags("a")
public class onlyASuite {
    // Runs all tests tagged with "a" in the package "com.ksiv.app"
}