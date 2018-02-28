package css.cis3334.heartratetracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Displays the detail for a heart rate
 *
 * Created by Jon Bernhardt, February 2018
 */
public class detail extends AppCompatActivity {

    TextView tvRate, tvRange, tvDescrip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvRate = (TextView) findViewById(R.id.tvPulse);
        tvRange = (TextView) findViewById(R.id.tvRange);
        tvDescrip = (TextView) findViewById(R.id.tvRangeDesc);

        //Get data from main activity and present the details
        Bundle items = getIntent().getExtras();
        HeartRate data = (HeartRate) items.getSerializable("rate");
        tvRate.setText("Pulse:  " + data.getPulse().toString());
        tvRange.setText("Range:  " + data.getRangeName().toString());
        tvDescrip.setText("Description:  " + data.getRangeDescrtiption().toString());
    }
}
