package io.appium.uiautomator2;

import android.content.Context;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getTargetContext;

@RunWith(AndroidJUnit4.class)
public class AppiumTest {

    private static final int port = 4456;
    private static ServerInstrumentation serverInstrumentation = null;
    private Context mContext;

    @Before
    public void startNetty(){
        mContext = getTargetContext();
//        Intent i = mContext.getPackageManager().getLaunchIntentForPackage("io.selendroid.testapp");
//        mContext.startActivity(i);

        if (serverInstrumentation == null) {
            serverInstrumentation = ServerInstrumentation.getInstance(mContext, port);
            serverInstrumentation.startServer();
        }
    }

    @Test
    public void verifyResourceString() {
        System.out.println("Blank Test");
    }

}
