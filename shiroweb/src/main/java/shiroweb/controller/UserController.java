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
			error = "�û���/�������";
		} catch (IncorrectCredentialsException e) {
			error = "�û���/�������";
		} catch (AuthenticationException e) {
			// �������󣬱�������������뵥�������뵥��catch����
			error = "��������" + e.getMessage();
		}
		if (!error.equals("")) {// �����ˣ����ص�¼ҳ��
			return "login";
		} else {// ��¼�ɹ�
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
