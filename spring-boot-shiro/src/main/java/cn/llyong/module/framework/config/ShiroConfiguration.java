package cn.llyong.module.framework.config;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @description:
 * @author: llyong
 * @date: 2018/8/7
 * @time: 10:41
 * @version: 1.0
 */
@ConfigurationProperties(prefix = "shiro")
@Configuration
public class ShiroConfiguration {

    private List<String> pathDefinitions;

    @Bean
    public Realm realm () {
        HashedCredentialsMatcher matcher = new HashedCredentialsMatcher();
        matcher.setHashAlgorithmName(Sha256Hash.ALGORITHM_NAME);
        //storedCredentialsHexEncoded默认是true，此时用的是密码加密用的是Hex编码；false时用Base64编码
//        matcher.setStoredCredentialsHexEncoded(true);
        matcher.setHashIterations(1024);

        AuthorizingRealm authorizingRealm = new AuthorizingRealm() {
            @Override
            protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
                return null;
            }

            @Override
            protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
                String username = (String) authenticationToken.getPrincipal();
                String db_passwordpassword = new String((char[]) authenticationToken.getCredentials());

                //假设这里的psssword从db查询
                String db_password = "40941538609061b2c98b2cc12860cc52a6abab96230e16ad0f0011088fe52dd8";
//                if (!"admin".equals(password)) {
//                    throw new AuthenticationException("用户名或密码错误！");
//                }
                return new SimpleAuthenticationInfo(username, db_password, ByteSource.Util.bytes(username), getName());
            }
        };
        authorizingRealm.setCredentialsMatcher(matcher);
        return authorizingRealm;
    }

    @Bean
    public ShiroFilterChainDefinition shiroFilterChainDefinition() {
        DefaultShiroFilterChainDefinition chainDefinition = new DefaultShiroFilterChainDefinition();

        this.getPathDefinitions().forEach(d -> {
            String[] defArr = d.split("=");
            chainDefinition.addPathDefinition(defArr[0].trim(), defArr[1]);
        });

        return chainDefinition;
    }

    public List<String> getPathDefinitions() {
        return pathDefinitions;
    }

    public void setPathDefinitions(List<String> pathDefinitions) {
        this.pathDefinitions = pathDefinitions;
    }
}
