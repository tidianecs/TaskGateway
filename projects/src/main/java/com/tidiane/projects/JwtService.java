package com.tidiane.projects;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Service;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

@Service
public class JwtService {
    public static String getConnectedUserId() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication.getPrincipal() instanceof Jwt jwt) {
            return jwt.getSubject();
        } else {
            throw new IllegalStateException("JWT principal not found in SecurityContext");
        }
    }

}
