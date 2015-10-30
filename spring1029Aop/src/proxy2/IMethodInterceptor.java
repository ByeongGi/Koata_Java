package proxy2;

import java.lang.reflect.Method;

public interface IMethodInterceptor {

	public Object interceptBefore(Object proxy, Method method, Object[] args, Object realtarget);

	public void interceptAfter(Object proxy, Method method, Object[] args, Object realtarget, Object retObject,
			Object interceptBeforeReturnObject);
}
