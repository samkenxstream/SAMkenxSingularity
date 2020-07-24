package com.hubspot.singularity.auth.datastore;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.hubspot.singularity.SingularityUser;
import java.util.Collections;
import java.util.Optional;

@Singleton
public class SingularityDummyDatastore implements SingularityAuthDatastore {

  @Inject
  public SingularityDummyDatastore() {}

  @Override
  public java.util.Optional<SingularityUser> getUser(String username) {
    return java.util.Optional.of(
      new SingularityUser(
        username,
        Optional.of(username),
        Optional.of(username),
        Collections.emptySet()
      )
    );
  }

  @Override
  public Optional<Boolean> isHealthy() {
    return Optional.of(true);
  }
}
