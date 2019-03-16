package software.kloud.KMSPluginSDK;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface KMSPlugin {
    String author();
    String version();
    short priority() default 0;
}
