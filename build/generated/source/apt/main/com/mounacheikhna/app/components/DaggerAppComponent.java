package com.mounacheikhna.app.components;

import com.mounacheikhna.app.Application;
import com.mounacheikhna.app.LogInElement;
import com.mounacheikhna.app.LoginRequiredElement;
import com.mounacheikhna.app.LoginRequiredElement_MembersInjector;
import com.mounacheikhna.app.User;
import com.mounacheikhna.app.modules.ApplicationModule;
import com.mounacheikhna.app.modules.ApplicationModule_ProvideUserFactory;
import com.mounacheikhna.app.modules.UserModule;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import java.util.Optional;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private Provider<Optional<User>> provideUserProvider;

  private MembersInjector<LoginRequiredElement> loginRequiredElementMembersInjector;

  private DaggerAppComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideUserProvider =
        DoubleCheck.provider(
            ApplicationModule_ProvideUserFactory.create(builder.applicationModule));

    this.loginRequiredElementMembersInjector =
        LoginRequiredElement_MembersInjector.create(provideUserProvider);
  }

  @Override
  public void inject(final Application application) {
    MembersInjectors.<Application>noOp().injectMembers(application);
  }

  @Override
  public void inject(LogInElement logInElement) {
    MembersInjectors.<LogInElement>noOp().injectMembers(logInElement);
  }

  @Override
  public void inject(LoginRequiredElement loginRequiredElement) {
    loginRequiredElementMembersInjector.injectMembers(loginRequiredElement);
  }

  @Override
  public UserComponent plus(UserModule userModule) {
    return new UserComponentImpl(userModule);
  }

  public static final class Builder {
    private ApplicationModule applicationModule;

    private Builder() {}

    public AppComponent build() {
      if (applicationModule == null) {
        throw new IllegalStateException(
            ApplicationModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerAppComponent(this);
    }

    public Builder applicationModule(ApplicationModule applicationModule) {
      this.applicationModule = Preconditions.checkNotNull(applicationModule);
      return this;
    }
  }

  private final class UserComponentImpl implements UserComponent {
    private final UserModule userModule;

    private UserComponentImpl(UserModule userModule) {
      this.userModule = Preconditions.checkNotNull(userModule);
    }

    @Override
    public void inject(LoginRequiredElement loginRequiredElement) {
      DaggerAppComponent.this.loginRequiredElementMembersInjector.injectMembers(
          loginRequiredElement);
    }
  }
}
