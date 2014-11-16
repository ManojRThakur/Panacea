package com.example.tabexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapViewActivity extends Activity {
	static final LatLng MUMBAI = new LatLng(18.9750, 72.8258);
	static final LatLng[] POSITIONS = {new LatLng(19.1190, 72.8470), new LatLng(19.0587, 72.8997), new LatLng(19.0180, 72.8448), new LatLng(18.9349, 72.8272)};
	private GoogleMap map;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_map_view);
		map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();

		// Move the camera instantly to hamburg with a zoom of 15.
		map.moveCamera(CameraUpdateFactory.newLatLngZoom(MUMBAI, 20));
		// Zoom in, animating the camera.
		map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
		map.setMyLocationEnabled(true);
		
		for(LatLng pos: POSITIONS) {
			 Marker position = map.addMarker(new MarkerOptions()
            .position(pos)
            .title("Dr. Ketan Asawale, MBBS, MD")
            .snippet("Specialization: pediatrics"));
		}
	}
}
