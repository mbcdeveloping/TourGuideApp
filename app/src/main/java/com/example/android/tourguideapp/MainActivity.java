package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }

    public static class HistoricFragment extends Fragment {
        public HistoricFragment() {

        }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);
            recyclerView.setHasFixedSize(true);

            ArrayList<ListItem> historic = new ArrayList<>();
            historic.add(new ListItem(getResources().getString(R.string.OradeaFortress_title), getResources().getString(R.string.fortress_description), R.drawable.oradea_cetatea));
            historic.add(new ListItem(getResources().getString(R.string.oradea_bazar_tilte), getResources().getString(R.string.oradea_bazar_description), R.drawable.bazar));
            historic.add(new ListItem(getResources().getString(R.string.house_adorjan1_title), getResources().getString(R.string.house_adorjan1_description), R.drawable.adorjan_house));
            historic.add(new ListItem(getResources().getString(R.string.adorjan_house2_title), getResources().getString(R.string.adorjan_house2_description), R.drawable.adorjan2));
            historic.add(new ListItem(getResources().getString(R.string.deutsch_house_title), getResources().getString(R.string.deutsch_house_description), R.drawable.deutsch));
            historic.add(new ListItem(getResources().getString(R.string.fuchsl_house_title), getResources().getString(R.string.fuchsl_house_description), R.drawable.fuchsl));
            historic.add(new ListItem(getResources().getString(R.string.ursuline_complex_title), getResources().getString(R.string.ursuline_complex_description), R.drawable.ursuline));
            historic.add(new ListItem(getResources().getString(R.string.ortpalace_title), getResources().getString(R.string.ortpalace_description), R.drawable.eportodoxa));
            historic.add(new ListItem(getResources().getString(R.string.med_faculty_title), getResources().getString(R.string.med_faculty_description), R.drawable.medicin));
            historic.add(new ListItem(getResources().getString(R.string.astoria_hotel_title), getResources().getString(R.string.astoria_hotel_description), R.drawable.astoria));
            historic.add(new ListItem(getResources().getString(R.string.apollo_palace_title), getResources().getString(R.string.apollo_palace_description), R.drawable.apollo));

            RecyclerViewAdapter adapter = new RecyclerViewAdapter(historic);
            recyclerView.setAdapter(adapter);
            LinearLayoutManager llm = new LinearLayoutManager(getActivity());
            recyclerView.setLayoutManager(llm);

            return rootView;
        }


    }

    //Fragments

    public static class RestaurantFragment extends Fragment {
        public RestaurantFragment() {

        }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);
            recyclerView.setHasFixedSize(true);
            ArrayList<ListItem> restaurants = new ArrayList<>();
            restaurants.add(new ListItem(getResources().getString(R.string.Rivo_resturant_title), getResources().getString(R.string.Rivo_restaurant_description), R.drawable.rivo));
            restaurants.add(new ListItem(getResources().getString(R.string.spoon_restaurant_title), getResources().getString(R.string.spoon_restaurant_description), R.drawable.spoon));
            restaurants.add(new ListItem(getResources().getString(R.string.ristretto_title), getResources().getString(R.string.ristretto_description), R.drawable.ristretto));
            restaurants.add(new ListItem(getResources().getString(R.string.corsarul_title), getResources().getString(R.string.corsarul_description), R.drawable.corsarul));
            restaurants.add(new ListItem(getResources().getString(R.string.american_grill_title), getResources().getString(R.string.america_grill_description), R.drawable.american_grill));
            restaurants.add(new ListItem(getResources().getString(R.string.hanul_cu_noroc_title), getResources().getString(R.string.hanul_cu_noroc_description), R.drawable.hanul));
            restaurants.add(new ListItem(getResources().getString(R.string.lactobar_title), getResources().getString(R.string.lactobar_description), R.drawable.lactobar));
            RecyclerViewAdapter adapter = new RecyclerViewAdapter(restaurants);
            recyclerView.setAdapter(adapter);
            LinearLayoutManager llm = new LinearLayoutManager(getActivity());
            recyclerView.setLayoutManager(llm);
            return rootView;
        }


    }

    public static class NightLifeFragment extends Fragment {
        public NightLifeFragment() {

        }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);
            recyclerView.setHasFixedSize(true);
            ArrayList<ListItem> nightLife = new ArrayList<>();
            nightLife.add(new ListItem(getResources().getString(R.string.lords_title), getResources().getString(R.string.lords_description), R.drawable.lords));
            nightLife.add(new ListItem(getResources().getString(R.string.moscka_title), getResources().getString(R.string.mosca_description), R.drawable.moszca));
            nightLife.add(new ListItem(getResources().getString(R.string.excess_title), getResources().getString(R.string.excess_description), R.drawable.excess));
            nightLife.add(new ListItem(getResources().getString(R.string.life_title), getResources().getString(R.string.life_description), R.drawable.life_club));
            nightLife.add(new ListItem(getResources().getString(R.string.select_poker_title), getResources().getString(R.string.select_poker_description), R.drawable.select_poker));
            nightLife.add(new ListItem(getResources().getString(R.string.green_title), getResources().getString(R.string.green_description), R.drawable.green_pub));
            nightLife.add(new ListItem(getResources().getString(R.string.black_title), getResources().getString(R.string.black_description), R.drawable.black));
            RecyclerViewAdapter adapter = new RecyclerViewAdapter(nightLife);
            recyclerView.setAdapter(adapter);
            LinearLayoutManager llm = new LinearLayoutManager(getActivity());
            recyclerView.setLayoutManager(llm);
            return rootView;
        }


    }

    public static class HotelsFragment extends Fragment {
        public HotelsFragment() {

        }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);
            recyclerView.setHasFixedSize(true);
            ArrayList<ListItem> hotels = new ArrayList<>();
            hotels.add(new ListItem(getResources().getString(R.string.nymphaea_title), getResources().getString(R.string.nymphaea_description), R.drawable.nymphaea));
            hotels.add(new ListItem(getResources().getString(R.string.double_hotel_title), getResources().getString(R.string.double_hotel_description), R.drawable.double_hotel));
            hotels.add(new ListItem(getResources().getString(R.string.ramada_hotel_title), getResources().getString(R.string.ramada_hotel_description), R.drawable.ramada_hotel));
            hotels.add(new ListItem(getResources().getString(R.string.continental_forum_title), getResources().getString(R.string.continental_forum_description), R.drawable.continental_forum));
            hotels.add(new ListItem(getResources().getString(R.string.astoria_hotel_title), getResources().getString(R.string.astoria_hotel_hotel_description), R.drawable.astoria));
            hotels.add(new ListItem(getResources().getString(R.string.elite_hotel_title), getResources().getString(R.string.elite_hotel_description), R.drawable.elit));
            hotels.add(new ListItem(getResources().getString(R.string.class_hotel_title), getResources().getString(R.string.class_hotel_description), R.drawable.class_hotel));
            hotels.add(new ListItem(getResources().getString(R.string.robinson_title), getResources().getString(R.string.robinson_description), R.drawable.robinson_camp));
            RecyclerViewAdapter adapter = new RecyclerViewAdapter(hotels);
            recyclerView.setAdapter(adapter);
            LinearLayoutManager llm = new LinearLayoutManager(getActivity());
            recyclerView.setLayoutManager(llm);
            return rootView;
        }


    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            switch (position) {
                case 0:
                    return new HistoricFragment();
                case 1:
                    return new RestaurantFragment();
                case 2:
                    return new NightLifeFragment();
                case 3:
                    return new HotelsFragment();
                default:
                    return new HistoricFragment();
            }

        }

        @Override
        public int getCount() {
            // Show 4 total pages.
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return getString(R.string.historic);
                case 1:
                    return getString(R.string.restaurants);
                case 2:
                    return getString(R.string.night_life);
                case 3:
                    return getString(R.string.hotels);
            }
            return null;
        }
    }

}
