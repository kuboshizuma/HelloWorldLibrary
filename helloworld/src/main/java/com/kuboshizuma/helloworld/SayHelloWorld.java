package com.kuboshizuma.helloworld;

import android.content.Context;
import android.widget.Toast;

public class SayHelloWorld {
    public static void s(Context c, String message){
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();
    }
}
