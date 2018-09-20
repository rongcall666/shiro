package shiroweb.service;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class MyRealm extends AuthorizingRealm {
	
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String username = (String)super.getAvailablePrincipal(principals);  
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		if(username.equals("ddq")) {
			authorizationInfo.addRole("admin");
			return authorizationInfo;
		}else if(username.equals("xiao666")) {
			authorizationInfo.addRole("user");
			return authorizationInfo;
		}
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken passwordToken = (UsernamePasswordToken)token;
		if(passwordToken.getUsername().equals("ddq")) {
			return new SimpleAuthenticationInfo("ddq","123456","xiaoqiang");
		}else if(passwordToken.getUsername().equals("xiao666")) {
			return new SimpleAuthenticationInfo("xiao666","123456","xiaohai");
		}
		return null;
	}
}
