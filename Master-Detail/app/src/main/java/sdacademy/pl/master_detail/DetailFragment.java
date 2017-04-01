package sdacademy.pl.master_detail;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by RENT on 2017-03-28.
 */

public class DetailFragment extends Fragment {

    private TextView titleTextView;
    private TextView detailsTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.detail_layout, container);
        titleTextView = (TextView) view.findViewById(R.id.titleTextView);
        detailsTextView = (TextView) view.findViewById(R.id.detailsTextView);
        return view;
    }

    public void showBasicData() {
        titleTextView.setText("Basic data");
        detailsTextView.setText("Janiiii Kowalski");
    }

    public void showDetailsData() {
        titleTextView.setText("Details");
        detailsTextView.setText("34 years");

    }
}
