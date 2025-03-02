package co.unipiloto.constraintlayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void onClickEjercicio1(View view) {
        Intent intent = new Intent(this, Ejercicio1.class);
        startActivity(intent);
    }

    public void onClickEjercicio2(View view) {
        Intent intent = new Intent(this, Ejercicio2.class);
        startActivity(intent);
    }

    public void onClickEjercicio3(View view) {
        Intent intent = new Intent(this, Ejercicio3.class);
        startActivity(intent);
    }

    public void onClickEjercicio4(View view) {
        Intent intent = new Intent(this, Ejercicio4.class);
        startActivity(intent);
    }
    public void onClickEjercicio5(View view) {
        Intent intent = new Intent(this, Ejercicio5.class);
        startActivity(intent);
    }

    public void onClickEjercicio6(View view) {
        Intent intent = new Intent(this, Ejercicio6.class);
        startActivity(intent);
    }

}