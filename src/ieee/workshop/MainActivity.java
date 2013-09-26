package ieee.workshop;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener
{
    Button weightButton,distanceButton;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        weightButton = (Button) findViewById(R.id.weightXML);
        distanceButton = (Button) findViewById(R.id.distanceXML);

        weightButton.setOnClickListener(this);
        distanceButton.setOnClickListener(this);

        
    }

    public void onClick(View but) {
          switch(but.getId()) {
              case R.id.weightXML:
                Intent WeightActivity = new Intent("ieee.workshop.WEIGHT");
                startActivity(WeightActivity);
                break;

              case R.id.distanceXML:
                Intent DistanceActivity = new Intent("ieee.workshop.DISTANCE");
                startActivity(DistanceActivity);
                break;
          }
    }
}
