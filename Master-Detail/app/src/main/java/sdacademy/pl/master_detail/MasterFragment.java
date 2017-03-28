package sdacademy.pl.master_detail;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by RENT on 2017-03-28.
 */

public class MasterFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        final MainActivity activity = (MainActivity) getActivity();
        View view = inflater.inflate(R.layout.master_layout, container);
        Button basicDataButton = (Button) view.findViewById(R.id.basicDataButton);
        Button detailButton = (Button) view.findViewById(R.id.detailButton);
        detailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.showDetailsData();
            }
        });
        basicDataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.showBasicData();
            }
        });
        return view;
    }

}


