package com.mounacheikhna.app.components;

import com.mounacheikhna.app.LoginRequiredElement;
import com.mounacheikhna.app.modules.UserModule;
import com.mounacheikhna.app.scope.ScopeSingleton;
import dagger.Subcomponent;

/**
 * Created by m.cheikhna on 24/10/2016.
 */
@ScopeSingleton(UserComponent.class)
@Subcomponent(modules = { UserModule.class })
public interface UserComponent {
    void inject(LoginRequiredElement loginRequiredElement);
}
