package com.test;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import java.util.HashMap;
import android.util.Log;


public class TestModule extends ReactContextBaseJavaModule {
    TestModule(ReactApplicationContext context) {
       super(context);
   }

    @Override
    public String getName() {
        return "TestModule";
    }

@ReactMethod
public void createCalendarEvent(String name, String location) {
   Log.d("TestModule", "Create event called with name: " + name
   + " and location: " + location);
}
}