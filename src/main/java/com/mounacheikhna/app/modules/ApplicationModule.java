package com.mounacheikhna.app.modules;

import com.mounacheikhna.app.Application;
import com.mounacheikhna.app.User;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;
import java.util.Optional;

@Module
public final class ApplicationModule {

    private final Application application;

    public ApplicationModule(final Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    public Application provideApplication() {
        return application;
    }

    @Provides
    @Singleton
    Optional<User> provideUser() {
        return Optional.empty();
    }

}
