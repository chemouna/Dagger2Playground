package com.mounacheikhna.app.components;

import com.mounacheikhna.app.Application;
import com.mounacheikhna.app.LogInElement;
import com.mounacheikhna.app.LoginRequiredElement;
import com.mounacheikhna.app.modules.ApplicationModule;
import com.mounacheikhna.app.modules.UserModule;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = { ApplicationModule.class })
public interface AppComponent {

    UserComponent plus(UserModule userModule);

    void inject(final Application application);

    void inject(LogInElement logInElement);

    void inject(LoginRequiredElement loginRequiredElement);
}
