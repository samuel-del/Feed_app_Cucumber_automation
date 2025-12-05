package com.bptn.feedAppAutomation.provider;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import com.bptn.feedAppAutomation.provider.factory.YamlPropertySourceFactory;
import org.springframework.beans.factory.annotation.Value;

@Component
@PropertySource(value = "classpath:config.yml", factory = YamlPropertySourceFactory.class)
public class ResourceProvider {
	
    @Value("${test.url.backend}")
    private String backEndUrl;

    @Value("${test.url.frontend}")
    private String frontEndUrl;

    @Value("${test.browser}")
    private String browser;

    @Value("${test.default.timeout}")
    private String timeout;

    @Value("${jwt.secret}")
    private String jwtSecret;

    @Value("${jwt.expiration}")
    private long jwtExpiration;

    @Value("${jwt.issuer}")
    private String jwtIssuer;
    
    @Value("${jwt.audience}")
    private String jwtAudience;

    @Value("${jwt.prefix}")
    private String jwtPrefix;

	public String getBackEndUrl() {
		return backEndUrl;
	}

	public void setBackEndUrl(String backEndUrl) {
		this.backEndUrl = backEndUrl;
	}

	public String getFrontEndUrl() {
		return frontEndUrl;
	}

	public void setFrontEndUrl(String frontEndUrl) {
		this.frontEndUrl = frontEndUrl;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public String getTimeout() {
		return timeout;
	}

	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}

	public String getJwtSecret() {
		return jwtSecret;
	}

	public void setJwtSecret(String jwtSecret) {
		this.jwtSecret = jwtSecret;
	}

	public long getJwtExpiration() {
		return jwtExpiration;
	}

	public void setJwtExpiration(long jwtExpiration) {
		this.jwtExpiration = jwtExpiration;
	}

	public String getJwtIssuer() {
		return jwtIssuer;
	}

	public void setJwtIssuer(String jwtIssuer) {
		this.jwtIssuer = jwtIssuer;
	}

	public String getJwtAudience() {
		return jwtAudience;
	}

	public void setJwtAudience(String jwtAudience) {
		this.jwtAudience = jwtAudience;
	}

	public String getJwtPrefix() {
		return jwtPrefix;
	}

	public void setJwtPrefix(String jwtPrefix) {
		this.jwtPrefix = jwtPrefix;
	}
}
