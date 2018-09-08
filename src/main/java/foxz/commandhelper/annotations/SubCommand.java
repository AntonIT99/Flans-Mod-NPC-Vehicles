// 
// Decompiled by Procyon v0.5.30
// 

package foxz.commandhelper.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Documented;
import java.lang.annotation.Annotation;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD })
public @interface SubCommand {
    String name() default "";
    
    String usage() default "";
    
    boolean hasEmptyCall() default false;
    
    String desc();
    
    Class[] permissions() default {};
}
