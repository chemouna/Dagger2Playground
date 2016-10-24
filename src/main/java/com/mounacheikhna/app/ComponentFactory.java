package com.mounacheikhna.app;

import com.mounacheikhna.app.components.AppComponent;
import com.mounacheikhna.app.components.DaggerAppComponent;
import com.mounacheikhna.app.modules.ApplicationModule;

//import com.mounacheikhna.app.components.DaggerAppComponent;

public final class ComponentFactory {

    private ComponentFactory() {
        throw new AssertionError("Can't create instances of ComponentFactory");
    }

    public static AppComponent createMainComponent(final Application application) {
        return DaggerAppComponent.builder().applicationModule(new ApplicationModule(application)).build();
    }

}
