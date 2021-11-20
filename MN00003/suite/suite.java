package junit2.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   test1.class,
   test2.class
})

public class suite {

}
