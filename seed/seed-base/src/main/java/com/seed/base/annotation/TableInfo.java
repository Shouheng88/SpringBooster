package com.seed.base.annotation;

import java.lang.annotation.*;

/**
 * This annotation was used to add more information for table defined
 * by {@link javax.persistence.Table}.
 *
 * @author <a href="mailto:shouheng2015@gmail.com">Shouheng.W</a>
 * @version 1.0
 * @date 2020/11/5 14:07
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE})
public @interface TableInfo {

    /** Add comment information for given table, */
    String comment() default "";
}
