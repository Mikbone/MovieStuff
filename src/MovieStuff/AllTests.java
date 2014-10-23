package MovieStuff;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import junit.framework.TestSuite;

@RunWith(Suite.class)
@SuiteClasses({TestMovieListWithEmptyList.class, TestMovieListWithOneMovie.class,TestMovieListWithTwoMovies.class })
public class AllTests
{
	 TestSuite suite = new TestSuite("Test for com.saorsa.nowplaying.tests");
}
