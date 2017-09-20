package pe.com.peruInka.webapp.controller.security;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import pe.com.peruInka.core.security.User;
import pe.com.peruInka.service.services.UserService;

public class DAOAuthenticationProvider implements AuthenticationProvider {

	protected final Log logger = LogFactory.getLog(getClass());

	private UserService userService;

	public Authentication authenticate(Authentication authentication) throws AuthenticationException {

		UsernamePasswordAuthenticationToken successToken = null;

		if (SessionDetail.getUserDetails() == null) {
			System.out.println(":: DAO authenticate ::");
			String username = null;
			String password = null;

			try {
				username = authentication.getPrincipal().toString();
				password = authentication.getCredentials().toString();
			} catch (Exception e) {
				logger.info(e.getMessage(), e);
				throw new BadCredentialsException("Username or Password is empty: " + username);
			}

			if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
				throw new BadCredentialsException("Username or Password is empty: " + username);
			}
			System.out.println("username: " + username);

			// System.out.println("userServicescs: " + userService);

			User user = userService.findValidateUser(username, password);
			// User user = null;
			// if (username.equals("admin") && password.equals("admin")) {
			// user = new User();
			// String[] roles = { "ROLE_CLIENT","ROLE_ADMIN","ROLE_SECRE" };
			// user.setRoles(roles);
			// user.setUserName("Cliente-01");
			// user.setUserId(2L);
			// }

			System.out.println("user: " + user);
			if (user == null) {
				throw new BadCredentialsException("DAO: User's Information need to be updated, user " + username);
			}

			// GrantedAuthority[] authorities = null;
			// if (user.getRoles() != null && user.getRoles().length > 0) {
			// int index = 0;
			// authorities = new GrantedAuthorityImpl[user.getRoles().length];
			// for (String role : user.getRoles()) {
			// authorities[index] = new GrantedAuthorityImpl(role);
			// index ++;
			// }
			// }
			// System.out.println("authorities: "+authorities);
			// successToken = new
			// UsernamePasswordAuthenticationToken(authentication.getPrincipal().toString(),
			// authorities);
			// successToken.setDetails(user);
			// System.out.println("USER
			// authenticated>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>:"+username+":<<<<<<<<<<<<<<<<<<<<<<<<");
			// }else {
			// successToken =
			// (UsernamePasswordAuthenticationToken)SessionDetail.getAuthentication();
			// }
			List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
			for (String rol : user.getRoles()) {
				System.out.println("rol " + rol);
				authorities.add(new SimpleGrantedAuthority(rol));
			}
			System.out.println("authorities: " + authorities);
			// successToken = new
			// UsernamePasswordAuthenticationToken(authentication.getPrincipal().toString(),
			// authorities);
			successToken = new UsernamePasswordAuthenticationToken(authentication.getPrincipal().toString(),
					authentication.getCredentials().toString(), authorities);
			successToken.setDetails(user);
			logger.info("USER authenticated>>>>>:" + username + ":<<<<<<<<<<<<");
		} else {
			successToken = (UsernamePasswordAuthenticationToken) SessionDetail.getAuthentication();
		}
		return successToken;
	}

	public boolean supports(Class<? extends Object> authentication) {
		return true;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
