package v3.spring.aop.pointcuts;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Pointcut("execution(public String getName())")
	public void allGetters(){
		//dummy method - holds point cut expression
	}
	
	//@Before("execution(public String getName())")
	@Before("allGetters()")
	public void loggingFirstAdvice() {
		System.out
				.println("advice run (first): method public String getName() was called");
	}
	
	//@Before("execution(public String getName())")
	@Before("allGetters()")
	public void loggingSecondFirstAdvice() {
		System.out
				.println("advice run (second): method public String getName() was called");
	}
}
