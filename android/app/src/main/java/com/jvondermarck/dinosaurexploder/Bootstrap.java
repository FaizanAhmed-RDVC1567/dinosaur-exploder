package com.jvondermarck.dinosaurexploder;

import com.almasb.fxgl.app.GameApplication;

public class Bootstrap {
    public static void main(String[] args) {
        // Launch the FXGL GameApplication subclass (MainActivity.kt)
        // GluonFX actually expects a `main`-style entry to call, which this class provides.
        GameApplication.launch(MainActivity.class, args);
    }
}
