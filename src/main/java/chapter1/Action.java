package chapter1;

import java.lang.annotation.*;

/**
 * created by xdCao on 2017/10/21
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Action {
    String name();
}
