package com.mounacheikhna.app;

/**
 * Created by m.cheikhna on 24/10/2016.
 */
public class LogInElement {

    public LogInElement() {
        Application.getInstance().getAppComponent().inject(this);
    }

    public void logUser() {
        User user = new User("TestUser");
        Application.getInstance().createUserComponent(user);
    }

    public void show() {
        System.out.println("Show LogInElement");
    }

}
