package sdacademy.pl.applifecycleandintentresult;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ResultActivity extends AppCompatActivity {

    @BindView(R.id.editText)
    protected EditText editText;

    @OnClick(R.id.buttonFinish)
    protected void finishClicked() {

        Intent returnIntent = new Intent();

//        wszystkie extra's to HashMapa, wiec 1sza wartosc musi byc Stringiem
//        to intent powrotny
//        umieszczamy dodatkowe informacje (zawartosc text fielda)

        returnIntent.putExtra("resultString", editText.getText().toString());
        setResult(RESULT_OK, returnIntent);
        finish();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ButterKnife.bind(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Resume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Pause", Toast.LENGTH_SHORT).show();
    }
}
