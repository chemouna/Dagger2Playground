package com.mounacheikhna.app.scope;

import javax.inject.Scope;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by m.cheikhna on 24/10/2016.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ScopeSingleton {
    Class<?> value();
}
