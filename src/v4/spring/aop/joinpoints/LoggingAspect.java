package v4.spring.aop.joinpoints;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Pointcut("within(v4.spring.aop.joinpoints.CircleModel)")
	public void allCircleModelMethods(){}
	
	@Pointcut("execution(* get*())")
	public void allGetters(){
		//dummy method - holds point cut expression
	}
	
	@Before("allCircleModelMethods()")
	public void loggingAdvice(JoinPoint joinPoint) {
		System.out
				.println("advice run: loggingAdvice()");
	}

}
