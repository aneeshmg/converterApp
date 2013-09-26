package ieee.workshop;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Weight extends Activity implements OnClickListener
{
    EditText kgET,poundET;
    Button kgB,poundB;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weight);

        kgET = (EditText) findViewById(R.id.kgET);
        poundET = (EditText) findViewById(R.id.poundET);
        kgB = (Button) findViewById(R.id.kgB);
        poundB = (Button) findViewById(R.id.poundB);

        kgB.setOnClickListener(this);
        poundB.setOnClickListener(this);
    }
    public void onClick(View but) {
          switch(but.getId()) {
              case R.id.kgB:
                String s = kgET.getText().toString();
                Double value = Double.parseDouble(s);
                value*=2.20462;
                s = Double.toString(value);
                poundET.setText(s);
                //Toast.makeText(getApplicationContext(), s ,Toast.LENGTH_SHORT).show();
                break;
              case R.id.poundB:
                s = poundET.getText().toString();
                value = Double.parseDouble(s);
                value*=0.453592;
                s = Double.toString(value);
                kgET.setText(s);
                break;
          }
    }
}
