package com.creativespringbok.terra;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    private ArrayAdapter<String> mForecastAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        String[] forecastArray = {
                "Day1",
                "Day2",
                "Day3",
                "Day4",
                "Day5",
                "Day6",
                "Day7"
        };

        List<String> weekForecast = new ArrayList<String>(Arrays.asList(forecastArray));
        mForecastAdapter = new ArrayAdapter<String>(
                //current context
                getActivity(),
                //layout
                R.layout.list_item_forecast,
                //view to populate
                R.id.list_item_forecast_textview,
                //data / array/list
                weekForecast);

        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(mForecastAdapter);

        return rootView;
    }
}
