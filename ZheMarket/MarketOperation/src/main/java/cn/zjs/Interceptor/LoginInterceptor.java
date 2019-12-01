package cn.zjs.Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginInterceptor implements HandlerInterceptor{
	
	
	
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
	
		
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)throws Exception {
         	// 在拦截点执行前拦截，如果返回true则不执行拦截点后的操作（拦截成功）
			// 返回false则不执行拦截
		System.out.println("进入拦截器");
			HttpSession session = request.getSession();
			//String uri = request.getRequestURI(); // 获取登录的uri，这个是不进行拦截的
			//if(session.getAttribute("LOGIN_USER")!=null || uri.indexOf("system/login")!=-1) {// 说明登录成功 或者 执行登录功能			
			if(session.getAttribute("user")!=null) {
				// 登录成功不拦截
				System.out.println("登录成功不拦截");
				return true;
			}else {
				// 拦截后进入登录页面
				System.out.println("拦截成功");
				response.sendRedirect("login.jsp");
				return false;
			}
		}

}
