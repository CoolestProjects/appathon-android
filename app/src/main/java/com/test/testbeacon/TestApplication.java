package com.test.testbeacon;

import com.estimote.sdk.EstimoteSDK;

import android.app.Application;

/**
 * Created by MTTUser on 05/02/2017.
 */

public class TestApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();

    //  App ID & App Token can be taken from App section of Estimote Cloud.
    EstimoteSDK.initialize(this, "test-app-alessandro-la5", "15b3bbccf4c9c54dac1dc26e04885fad");
// Optional, debug logging.
    EstimoteSDK.enableDebugLogging(true);
  }
}
