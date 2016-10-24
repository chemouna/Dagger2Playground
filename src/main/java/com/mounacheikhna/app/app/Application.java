package com.mounacheikhna.app.app;

import com.mounacheikhna.app.dagger.ComponentFactory;
import com.mounacheikhna.app.dagger.components.ApplicationComponent;

public class Application {

    private static Application INSTANCE;

    public static void main(String args[]) {
        INSTANCE = new Application();
        INSTANCE.onCreate();
    }

    public static Application getInstance() {
        return INSTANCE;
    }

    private ApplicationComponent applicationComponent;

    public void onCreate() {
        daggerInject();
    }

    private void daggerInject() {
        applicationComponent = ComponentFactory.createMainComponent(this);
        applicationComponent.inject(this);
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

}
