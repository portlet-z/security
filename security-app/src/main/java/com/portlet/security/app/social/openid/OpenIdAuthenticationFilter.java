package com.portlet.security.app.social.openid;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.portlet.security.core.properties.SecurityConstants;
import lombok.Data;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

/**
 * @author zhangxinzheng
 *
 */
@Data
public class OpenIdAuthenticationFilter extends AbstractAuthenticationProcessingFilter {
	private String openIdParameter = SecurityConstants.DEFAULT_PARAMETER_NAME_OPENID;
	private String providerIdParameter = SecurityConstants.DEFAULT_PARAMETER_NAME_PROVIDERID;
	private boolean postOnly = true;

	public OpenIdAuthenticationFilter() {
		super(new AntPathRequestMatcher(SecurityConstants.DEFAULT_LOGIN_PROCESSING_URL_OPENID, "POST"));
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException {
		if (postOnly && !request.getMethod().equals("POST")) {
			throw new AuthenticationServiceException("Authentication method not supported: " + request.getMethod());
		}

		String openid = obtainOpenId(request);
		String providerId = obtainProviderId(request);

		if (openid == null) {
			openid = "";
		}
		if (providerId == null) {
			providerId = "";
		}

		openid = openid.trim();
		providerId = providerId.trim();

		OpenIdAuthenticationToken authRequest = new OpenIdAuthenticationToken(openid, providerId);

		setDetails(request, authRequest);

		return this.getAuthenticationManager().authenticate(authRequest);
	}


	/**
	 * 获取openId
	 */
	protected String obtainOpenId(HttpServletRequest request) {
		return request.getParameter(openIdParameter);
	}
	
	/**
	 * 获取提供商id
	 */
	protected String obtainProviderId(HttpServletRequest request) {
		return request.getParameter(providerIdParameter);
	}

	protected void setDetails(HttpServletRequest request, OpenIdAuthenticationToken authRequest) {
		authRequest.setDetails(authenticationDetailsSource.buildDetails(request));
	}

}