package com.mounacheikhna.app.dagger;

import com.mounacheikhna.app.Application;
import com.mounacheikhna.app.dagger.components.ApplicationComponent;
import com.babic.app.dagger.components.DaggerApplicationComponent;
import com.mounacheikhna.app.dagger.modules.ApplicationModule;

public final class ComponentFactory {

    private ComponentFactory() {
        throw new AssertionError("Can't create instances of ComponentFactory");
    }

    public static ApplicationComponent createMainComponent(final Application application) {
        return DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(application)).build();
    }

}
