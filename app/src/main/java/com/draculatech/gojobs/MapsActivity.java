package com.draculatech.gojobs;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    private ArrayList<PointOfInterest> universityList = new ArrayList<>();
    private ArrayList<PointOfInterest> schoolList = new ArrayList<>();
    private ArrayList<PointOfInterest> softwareCompaniesList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }

    private void populateUniversityList() {
        universityList.add(new PointOfInterest("University Of Dubai", 25.1060803, 55.4143739));
        universityList.add(new PointOfInterest("Heriot Watt Universiy", 0.0, 0.0));
        universityList.add(new PointOfInterest("Canadian University of Dubai", 0.0, 0.0));
        universityList.add(new PointOfInterest("University of Balamand", 0.0, 0.0));
        universityList.add(new PointOfInterest("MODUL university Dubai", 0.0, 0.0));
        universityList.add(new PointOfInterest("Zayed University", 0.0, 0.0));
        universityList.add(new PointOfInterest("University of Manchester Dubai", 0.0, 0.0));
        universityList.add(new PointOfInterest("University of Wollongong in Dubai (UOWD)", 25.1037098, 55.164907));
        universityList.add(new PointOfInterest("American University in Dubai", 25.0912151, 55.1560664));
        universityList.add(new PointOfInterest("Manipal Academy of Higher Education", 25.133309, 55.4251456));
        universityList.add(new PointOfInterest("Birla Institute of Technology & Science, Pilani", 25.1314441, 55.4196417));
        universityList.add(new PointOfInterest("Hult International business school", 0.0, 0.0));
        universityList.add(new PointOfInterest("S P Jain School of Global Management", 0.0, 0.0));
        universityList.add(new PointOfInterest("Murdoch University Dubai", 0.0, 0.0));
        universityList.add(new PointOfInterest("Al dar university college", 0.0, 0.0));
        universityList.add(new PointOfInterest("middlesex university dubai", 0.0, 0.0));
        universityList.add(new PointOfInterest("SAE Dubai", 0.0, 0.0));
        universityList.add(new PointOfInterest("Uk college of business and computing", 0.0, 0.0));
        universityList.add(new PointOfInterest("Curtin University Dubai", 0.0, 0.0));
        universityList.add(new PointOfInterest("University of Strathclyde", 0.0, 0.0));
        universityList.add(new PointOfInterest("Babson College", 0.0, 0.0));
        universityList.add(new PointOfInterest("nest academy of management education", 0.0, 0.0));
        universityList.add(new PointOfInterest("university of birmingham", 0.0, 0.0));
        universityList.add(new PointOfInterest("university of south wales", 0.0, 0.0));
        universityList.add(new PointOfInterest("Institute of management technology", 0.0, 0.0));
        universityList.add(new PointOfInterest("rochester institute of technology", 0.0, 0.0));
        universityList.add(new PointOfInterest("Emirates Aviation University", 0.0, 0.0));
        universityList.add(new PointOfInterest("Synergy University Dubai", 0.0, 0.0));
        universityList.add(new PointOfInterest("center for executive education", 0.0, 0.0));
        universityList.add(new PointOfInterest("American College of dubai", 0.0, 0.0));
        universityList.add(new PointOfInterest("hamdan bin mohammed smart university", 0.0, 0.0));
        universityList.add(new PointOfInterest("jumeira university", 0.0, 0.0));
        universityList.add(new PointOfInterest("Al ghurair university", 0.0, 0.0));
        universityList.add(new PointOfInterest("JSS Academy dubai", 0.0, 0.0));
        universityList.add(new PointOfInterest("Amity University Dubai", 0.0, 0.0));
        universityList.add(new PointOfInterest("The British University in Dubai", 0.0, 0.0));
        universityList.add(new PointOfInterest("MENA College of Management", 0.0, 0.0));
        universityList.add(new PointOfInterest("SZABIST", 0.0, 0.0));
        universityList.add(new PointOfInterest("Al falah university dubai", 0.0, 0.0));
        universityList.add(new PointOfInterest("Dubai Medical College", 0.0, 0.0));
        universityList.add(new PointOfInterest("Dubai Pharmacy college", 0.0, 0.0));
        universityList.add(new PointOfInterest("Dublin business school in dubai", 0.0, 0.0));
        universityList.add(new PointOfInterest("Harvard medical school dubai", 0.0, 0.0));
        universityList.add(new PointOfInterest("saint petersburg state university of engineering and economics dubai", 0.0, 0.0));
        universityList.add(new PointOfInterest("University of modren sciences Dubai", 0.0, 0.0));
        universityList.add(new PointOfInterest("University of sunderland PGCE", 0.0, 0.0));
        universityList.add(new PointOfInterest("City university of London Dubai", 0.0, 0.0));
        universityList.add(new PointOfInterest("European Universty college", 0.0, 0.0));
        universityList.add(new PointOfInterest("Higher College of Technology", 0.0, 0.0));
    }

    private void populateSchoolList() {
    }

    private void populateSoftwareCompaniesList() {
        schoolList.add(new PointOfInterest("TechGropse", 25.1888869, 55.2674599));
        schoolList.add(new PointOfInterest("Celadon", 25.18587, 55.259984));
        schoolList.add(new PointOfInterest("CreITive – Beyond Digital", 25.1024447, 55.1698649));
        schoolList.add(new PointOfInterest("Approxen", 25.218931, 55.279288));
        schoolList.add(new PointOfInterest("Mocell Solutions", 25.185234, 55.261894));
        schoolList.add(new PointOfInterest("Incubasys", 25.1811951, 55.262857));
        schoolList.add(new PointOfInterest("Fingnet", 0.0, 0.0));
        schoolList.add(new PointOfInterest("Sunflower lab", 0.0, 0.0));
        schoolList.add(new PointOfInterest("iflexion", 0.0, 0.0));
        schoolList.add(new PointOfInterest("Inflexion", 0.0, 0.0));
        schoolList.add(new PointOfInterest("IndiaNIC", 0.0, 0.0));
        schoolList.add(new PointOfInterest("CyberInfrastructure inc", 0.0, 0.0));
        schoolList.add(new PointOfInterest("Syberry Corporation", 0.0, 0.0));
        schoolList.add(new PointOfInterest("OpenGeeksLab", 0.0, 0.0));
        schoolList.add(new PointOfInterest("S-pro", 0.0, 0.0));
        schoolList.add(new PointOfInterest("Al Kendi Computer Systems", 25.2571439, 55.2998498));
        schoolList.add(new PointOfInterest("AppsTec Consulting", 0.0, 0.0));
    }
}
