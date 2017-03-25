package sdacademy.pl.twolabelsapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    //tworzymy zmienne, puste
//    private TextView line1;
//    private TextView line2;
//
//    private Button clickButton, clickButton2, clickButton3;

    private static final String LINE_1_CONTENT = "SDA jest fajne.";
    private static final String LINE_2_CONTENT = "Java tez";


    //ButterKnife - aby nie powtarzac findViewById
    @BindView(R.id.line1)
    protected TextView line1;

    @BindView(R.id.line2)
    protected TextView line2;

    @BindView(R.id.actionButton)
    protected Button clickButton;

    @BindView(R.id.actionButton2)
    protected Button clickButton2;

    @BindView(R.id.actionButton3)
    protected Button clickButton3;

    @OnClick({R.id.actionButton, R.id.actionButton2, R.id.actionButton3})
    protected void onButtonsClick(View v) {
        if (v instanceof Button) { //czy v jest typu button
            Button rzutowany = (Button) v;
            if (rzutowany == clickButton) {
                line1.setText(LINE_1_CONTENT);
            } else if (rzutowany == clickButton2) {
                line2.setText(LINE_2_CONTENT);
            } else {
                line1.setText(null);
                line2.setText(null);
            }
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //aby cale podbindowanie zaszlo to:
        ButterKnife.bind(this);

        //powiazanie zmiennych z widokiem/podbindowane
//        line1 = (TextView) findViewById(R.id.line1);
//        line2 = (TextView) findViewById(R.id.line2);

//        //przypisujemy do nowego obiektu , aby dzialalo jesli klikniemy w ktorykolwiek button
//        View.OnClickListener listener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//            }
//        };
//        clickButton = (Button) findViewById(R.id.actionButton);
//        clickButton.setOnClickListener(listener);
//
//        clickButton2 = (Button) findViewById(R.id.actionButton2);
//        clickButton2.setOnClickListener(listener);
//
//        clickButton3 = (Button) findViewById(R.id.actionButton3);
//        clickButton3.setOnClickListener(listener);
    }
}
