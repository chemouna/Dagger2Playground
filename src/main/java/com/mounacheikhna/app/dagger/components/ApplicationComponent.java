package com.mounacheikhna.app.dagger.components;

import com.mounacheikhna.app.dagger.modules.ApplicationModule;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent extends ApplicationComponentInjects, ApplicationComponentExposes {

}
