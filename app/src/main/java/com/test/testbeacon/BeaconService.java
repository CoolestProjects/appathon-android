package com.test.testbeacon;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by MTTUser on 25/03/2017.
 */

public interface BeaconService {

  @GET("beacon.json")
  Call<BeaconsModel> listBecons();
}
