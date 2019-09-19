package id.ac.polinema.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LinearConstraint extends AppCompatActivity {

//    private View klik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_constraint);

//        klik = findViewById(R.id.view2);
    }

    public void aaaa(View view) {
        Intent i = new Intent(LinearConstraint.this, RelativeConstraint.class);
        startActivity(i);
        finish();
    }
}
