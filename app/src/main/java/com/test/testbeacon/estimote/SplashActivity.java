package com.test.testbeacon.estimote;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.test.testbeacon.BeaconsModel;
import com.test.testbeacon.BeaconService;
import com.test.testbeacon.MainActivity;
import com.test.testbeacon.R;
import java.io.Serializable;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by MTTUser on 25/03/2017.
 */

public class SplashActivity extends AppCompatActivity {

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.splash_activity);

    downloadData();
  }

  private void downloadData() {
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("https://coolestprojectsapp.firebaseio.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build();

    BeaconService service = retrofit.create(BeaconService.class);
    service.listBecons().enqueue(new Callback<BeaconsModel>() {
      @Override
      public void onResponse(Call<BeaconsModel> call, Response<BeaconsModel> response) {

        Intent intent = new Intent(SplashActivity.this, MainActivity.class);
        intent.putExtra("beacons", (Serializable) response.body().getBeacons());
        startActivity(intent);
      }

      @Override
      public void onFailure(Call<BeaconsModel> call, Throwable t) {
        Log.d("test_","Err");
      }
    });
  }
}
