package com.mounacheikhna.app;

import com.mounacheikhna.app.components.UserComponent;

import javax.inject.Inject;
import java.util.Optional;

/**
 * Created by m.cheikhna on 24/10/2016.
 */
public class LoginRequiredElement {

    @Inject
    Optional<User> user;

    public LoginRequiredElement() {
        UserComponent userComponent = Application.getInstance().getUserComponent();
        if (userComponent == null) {
            Application.getInstance().getAppComponent().inject(this);
        }
        else {
            userComponent.inject(this);
        }
    }

    public void show() {
        System.out.println("Show LoginRequiredElement");
    }

    public void showUserInfo() {
        String name = null;
        if (user.isPresent()) {
            name = user.get().name;
        }
        System.out.println("Logged in user : "+ name);
    }
}
