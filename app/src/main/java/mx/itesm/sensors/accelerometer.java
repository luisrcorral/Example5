package mx.itesm.sensors;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class accelerometer extends AppCompatActivity implements SensorEventListener {

    private SensorManager sensorManager;
    double ax,ay,az;   // these are the acceleration in x,y and z axis
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accelerometer);

        sensorManager=(SensorManager) getSystemService(SENSOR_SERVICE);
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);
    }
    @Override
    public void onAccuracyChanged(Sensor arg0, int arg1) {
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType()==Sensor.TYPE_ACCELEROMETER){

            ax = event.values[0];
            ay = event.values[1];
            az = event.values[2];

            TextView xValues = (TextView) findViewById(R.id.valueX);
            TextView yValues = (TextView) findViewById(R.id.valueY);
            TextView zValues = (TextView) findViewById(R.id.valueZ);

            xValues.setText("" + ax);
            yValues.setText("" + ay);
            zValues.setText("" + az);
        }
    }
}