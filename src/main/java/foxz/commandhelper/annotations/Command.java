// 
// Decompiled by Procyon v0.5.30
// 

package foxz.commandhelper.annotations;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Documented;
import java.lang.annotation.Annotation;

@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Command {
    String name();
    
    String desc();
    
    String usage() default "";
    
    Class[] sub() default {};
}
