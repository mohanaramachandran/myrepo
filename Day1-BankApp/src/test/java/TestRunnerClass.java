
import org.cap.test.service.AccountServiceTest;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;



public class TestRunnerClass {
	
	public static void main(String[] args){
		JUnitCore junitCore = new JUnitCore();
		junitCore.addListener(new TextListener(System.out));
		JUnitCore.runClasses(AccountServiceTest.class);
	}
	
}
