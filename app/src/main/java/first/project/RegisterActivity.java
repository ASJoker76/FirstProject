package first.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void pindah(View view) {
        Intent intent = new Intent(RegisterActivity.this, RegisterNoTlpActivity.class);
        finish();
        startActivity(intent);
    }
}