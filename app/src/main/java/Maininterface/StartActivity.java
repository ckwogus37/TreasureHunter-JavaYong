package Maininterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.captech.ar.MainActivity;
import com.captech.ar.R;



import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class StartActivity extends AppCompatActivity {

    Button btn_start;
    Button btn_multi;
    Button btn_exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        btn_start = findViewById(R.id.btn_start);
        btn_multi = findViewById(R.id.btn_multi);
        btn_exit = findViewById(R.id.btn_exit);

        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btn_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(StartActivity.this, "지금은 준비중이예요", Toast.LENGTH_SHORT).show();
            }
        });

        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

}