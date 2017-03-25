package sdacademy.pl.applifecycleandintentresult;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textView)
    protected TextView textView;

    @OnClick(R.id.button)
    protected void buttonClicked() {
        Intent intent = new Intent(this, ResultActivity.class);
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Override
    protected void onActivityResult(int requestCode,
                                    int resultCode,
                                    Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data.hasExtra("Result String")) {
            String returnedString = data.getStringExtra("resultString");
            textView.setText(returnedString);
        }
    }
}
