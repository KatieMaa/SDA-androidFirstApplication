package sdacademy.pl.master_detail;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showBasicData() {
        DetailFragment detailFragment = getDetailFragment();
        if (detailFragment != null) {
            detailFragment.showBasicData();
        } else {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.TO_SHOW, DetailActivity.DETAILS);
            startActivity(intent);
        }
    }


    private DetailFragment getDetailFragment() {
        FragmentManager fm = getFragmentManager();
        return (DetailFragment) fm.findFragmentById(R.id.detailFragment);
    }

    public void showDetailsData() {
        DetailFragment detailFragment = getDetailFragment();
        if (detailFragment != null) {
            detailFragment.showDetailsData();
        } else {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra("nazwa", 1);
            startActivity(intent);
        }


    }
}

