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
public final class ApplicationModule_ProvideUserFactory implements Factory<Optional<User>> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideUserFactory(ApplicationModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Optional<User> get() {
    return Preconditions.checkNotNull(
        module.provideUser(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Optional<User>> create(ApplicationModule module) {
    return new ApplicationModule_ProvideUserFactory(module);
  }
}
