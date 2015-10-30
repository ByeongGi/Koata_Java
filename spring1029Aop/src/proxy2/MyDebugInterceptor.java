package proxy2;

import java.lang.reflect.Method;

public class MyDebugInterceptor implements IMethodInterceptor {
	@Override
	public Object interceptBefore(Object proxy, Method method, Object[] args, Object realtarget) {

		System.out.println("MyDebugInterceptor: Going to execute method : ");
		return null;
	}
	@Override
	public void interceptAfter(Object proxy, Method method, Object[] args, Object realtarget, Object retObject,
			Object interceptBefore) {

		System.out.println("MyDebugInterceptor: After execute method : ");
	}
}
