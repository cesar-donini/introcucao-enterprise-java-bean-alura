package br.com.caelum.livraria.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LogInterceptor {

	@AroundInvoke
	public Object intercept(InvocationContext context) throws Exception {
		
		long initMillis = System.currentTimeMillis();
		
		Object object = context.proceed();
		
		String className = context.getTarget().getClass().getSimpleName();
		String methodName = context.getMethod().getName();
		
		System.out.println("Classe " + className + " executando o método " + methodName
				+ " levou " + (System.currentTimeMillis() - initMillis) + " milisegundo(s) para executar.");
		
		return object;
	}
	
}
