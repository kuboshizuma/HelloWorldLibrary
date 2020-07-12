package com.kuboshizuma.helloworldlibrary;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;

        import com.kuboshizuma.helloworld.SayHelloWorld;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SayHelloWorld.s(MainActivity.this, "Hello World!");
    }
}