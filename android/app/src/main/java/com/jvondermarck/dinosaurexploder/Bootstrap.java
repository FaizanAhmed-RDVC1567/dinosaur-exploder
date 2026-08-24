package com.jvondermarck.dinosaurexploder;

import com.almasb.fxgl.app.GameApplication;

public class Bootstrap {
    public static void main(String[] args) {
        // Launch the FXGL GameApplication subclass (MainActivity.kt)
        GameApplication.launch(MainActivity.class, args);
    }
}
