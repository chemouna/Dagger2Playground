package com.mounacheikhna.app.modules;

import com.mounacheikhna.app.User;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserModule_ProvideUserFactory implements Factory<Optional<User>> {
  private final UserModule module;

  public UserModule_ProvideUserFactory(UserModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Optional<User> get() {
    return Preconditions.checkNotNull(
        module.provideUser(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Optional<User>> create(UserModule module) {
    return new UserModule_ProvideUserFactory(module);
  }
}
