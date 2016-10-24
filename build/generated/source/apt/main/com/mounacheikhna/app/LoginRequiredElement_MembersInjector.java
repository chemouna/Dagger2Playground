package com.mounacheikhna.app;

import dagger.MembersInjector;
import java.util.Optional;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoginRequiredElement_MembersInjector
    implements MembersInjector<LoginRequiredElement> {
  private final Provider<Optional<User>> userProvider;

  public LoginRequiredElement_MembersInjector(Provider<Optional<User>> userProvider) {
    assert userProvider != null;
    this.userProvider = userProvider;
  }

  public static MembersInjector<LoginRequiredElement> create(
      Provider<Optional<User>> userProvider) {
    return new LoginRequiredElement_MembersInjector(userProvider);
  }

  @Override
  public void injectMembers(LoginRequiredElement instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.user = userProvider.get();
  }

  public static void injectUser(
      LoginRequiredElement instance, Provider<Optional<User>> userProvider) {
    instance.user = userProvider.get();
  }
}
