package com.mounacheikhna.app.modules;

import com.mounacheikhna.app.User;
import com.mounacheikhna.app.components.UserComponent;
import com.mounacheikhna.app.scope.ScopeSingleton;
import dagger.Module;
import dagger.Provides;

import java.util.Optional;

/**
 * Created by m.cheikhna on 24/10/2016.
 */
@Module
public class UserModule {

    private User user;

    public UserModule(User user) {
        this.user = user;
    }

    @ScopeSingleton(UserComponent.class)
    @Provides
    Optional<User> provideUser() {
        return Optional.of(user);
    }
}
