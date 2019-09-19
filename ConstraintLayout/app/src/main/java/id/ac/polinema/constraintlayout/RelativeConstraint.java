package id.ac.polinema.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RelativeConstraint extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_constraint);
    }

    public void pindah(View view) {
        Intent i = new Intent(RelativeConstraint.this, LinearConstraint.class);
        startActivity(i);
        finish();
    }
}
