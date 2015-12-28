package or.kosta.mymapand1219;

import android.Manifest;
import android.annotation.TargetApi;
import android.app.Service;
import android.content.pm.PackageManager;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationProvider;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.location.LocationServices;

/**
 * Created by kosta on 2015-12-19
 */
public class OnlyGeoLocation extends AppCompatActivity {

    private double altitude;
    private double latitude;
    private double bearing;

    private LocationListener locationListener;
    private LocationServices locationServices;
    private LocationManager locationManager;
    private Location location;
    private LocationProvider locationProvider;

    @TargetApi(Build.VERSION_CODES.M)
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);


        if (locationManager == null) {
            locationManager = (LocationManager) getSystemService(Service.LOCATION_SERVICE);
        }
        if (locationListener == null) {
            locationListener = new MyLocationListener();
        }

        Criteria criteria = new Criteria();
        criteria.setAccuracy(Criteria.ACCURACY_FINE);
        criteria.setAltitudeRequired(true);
        criteria.setSpeedRequired(true);


        String provider = locationManager.getBestProvider(criteria, true);

        if (checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && checkSelfPermission(Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    public void requestPermissions(@NonNull String[] permissions, int requestCode)
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for Activity#requestPermissions for more details.
            return;
        }
        locationManager.requestLocationUpdates(provider, 3000L, 3.0f, locationListener);
    }
}


class MyLocationListener implements LocationListener{

    @Override
    public void onLocationChanged(Location location) {
        location.getAltitude();
        location.getLatitude();
        location.getBearing();
        location.getLongitude();
        location.getTime();
        location.getSpeed();
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
}