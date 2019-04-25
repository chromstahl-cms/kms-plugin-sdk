package software.kloud.ChromPluginSDK;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import java.security.Principal;

public class AbsController {
    public String getUsernameFromPrincipal(Principal principal) {
        return (String) ((UsernamePasswordAuthenticationToken) principal).getPrincipal();
    }
}
