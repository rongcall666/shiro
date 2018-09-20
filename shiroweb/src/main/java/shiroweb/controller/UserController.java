package shiroweb.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.web.util.SavedRequest;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@RequestMapping("/login")
	public String login(String username, String password) {

		org.apache.shiro.subject.Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);

		String error = "";
		try {
			subject.login(token);
		} catch (UnknownAccountException e) {
			error = "用户名/密码错误";
		} catch (IncorrectCredentialsException e) {
			error = "用户名/密码错误";
		} catch (AuthenticationException e) {
			// 其他错误，比如锁定，如果想单独处理请单独catch处理
			error = "其他错误：" + e.getMessage();
		}
		if (!error.equals("")) {// 出错了，返回登录页面
			return "login";
		} else {// 登录成功
			return "info";
		}

	}

	@RequestMapping("/info")
	public String success() {
		return "info";
	}

	@RequestMapping("/admin")
	public String admin() {
		System.out.println("adminhaha");
		return "admin";
	}

	@RequestMapping("/user")
	public String user() {
		System.out.println("userhaha");
		return "user";
	}

	@RequestMapping("/under")
	public String under() {
		System.out.println("userhaha");
		return "403";
	}
}
