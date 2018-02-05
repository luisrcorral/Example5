package mx.itesm.sensors;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class call extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        Button phoneButton =(Button)findViewById(R.id.button_call);
        phoneButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent phoneintent = new Intent(Intent.ACTION_CALL);
                phoneintent.setData(Uri.parse("tel:00000000" ));
                startActivity(phoneintent);
            }
        });
    }


}
