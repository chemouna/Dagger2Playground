package com.mounacheikhna.app.dagger.modules;

import com.mounacheikhna.app.Application;
import dagger.Module;
import dagger.Provides;

@Module
public final class ApplicationModule {

    private final Application application;

    public ApplicationModule(final Application application) {
        this.application = application;
    }

    @Provides
    public Application provideApplication() {
        return application;
    }

    public interface Exposes {

        Application application();


    }

}
