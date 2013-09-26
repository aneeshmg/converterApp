package ieee.workshop;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Distance extends Activity implements OnClickListener
{
    EditText mET,feetET;
    Button mB,feetB;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.distance);

        mET = (EditText) findViewById(R.id.mET);
        feetET = (EditText) findViewById(R.id.feetET);
        mB = (Button) findViewById(R.id.mB);
        feetB = (Button) findViewById(R.id.feetB);

        mB.setOnClickListener(this);
        feetB.setOnClickListener(this);
    }
    public void onClick(View but) {
          switch(but.getId()) {
              case R.id.mB:
                String s = mET.getText().toString();
                Double value = Double.parseDouble(s);
                value*=3.28084;
                s = Double.toString(value);
                feetET.setText(s);
                //Toast.makeText(getApplicationContext(), s ,Toast.LENGTH_SHORT).show();
                break;
              case R.id.feetB:
                s = feetET.getText().toString();
                value = Double.parseDouble(s);
                value*=0.3048;
                s = Double.toString(value);
                mET.setText(s);
                break;
          }
    }
}
