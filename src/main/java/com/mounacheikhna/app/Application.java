package com.mounacheikhna.app;

import com.mounacheikhna.app.components.AppComponent;
import com.mounacheikhna.app.components.UserComponent;
import com.mounacheikhna.app.modules.UserModule;

import static java.lang.Thread.sleep;

public class Application {

    private static Application INSTANCE;
    private UserComponent userComponent;

    public static void main(String args[]) throws InterruptedException {
        INSTANCE = new Application();
        INSTANCE.onCreate();
    }

    public static Application getInstance() {
        return INSTANCE;
    }

    private AppComponent appComponent;

    public void onCreate() throws InterruptedException {
        daggerInject();
        System.out.println("OnCreate of Application");
        experiment();
    }

    public void experiment() throws InterruptedException {
        LoginRequiredElement loginRequiredElement = new LoginRequiredElement();
        loginRequiredElement.showUserInfo();
        NonLoginInRequiredElement nonLoginInRequiredElement = new NonLoginInRequiredElement();
        sleep(1000);
        nonLoginInRequiredElement.show();
        System.out.println("Login user....");
        LogInElement logInElement = new LogInElement();
        logInElement.logUser();
        sleep(1000);
        loginRequiredElement.showUserInfo();
        System.out.println("show user before");
        loginRequiredElement = new LoginRequiredElement();
        System.out.println("show user after");
        loginRequiredElement.showUserInfo();
    }

    private void daggerInject() {
        appComponent = ComponentFactory.createMainComponent(INSTANCE);
        appComponent.inject(this);
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public UserComponent createUserComponent(User user) {
        userComponent = appComponent.plus(new UserModule(user));
        return userComponent;
    }

    public UserComponent getUserComponent() {
        return userComponent;
    }
}
