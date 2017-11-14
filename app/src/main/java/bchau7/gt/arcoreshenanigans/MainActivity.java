package bchau7.gt.arcoreshenanigans;

import android.opengl.GLSurfaceView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Toast;

import com.google.ar.core.Config;
import com.google.ar.core.Session;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import bchau7.gt.arcoreshenanigans.rendering.PlaneAttachment;

public class MainActivity extends AppCompatActivity implements GLSurfaceView.Renderer {

    private Session mSession;
    private Config mConfig;
    private GLSurfaceView mSurfaceView;

    private final float[] mAnchorMatrix = new float[16];

    private ArrayBlockingQueue<MotionEvent> mQueuedSingleTaps = new ArrayBlockingQueue<MotionEvent>(16);
    private ArrayList<PlaneAttachment> mTouches = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSurfaceView = (GLSurfaceView) findViewById(R.id.surfaceview);
        mSession = new Session(this);

        mConfig = Config.createDefaultConfig();

        if (!mSession.isSupported(mConfig)) {
            Toast.makeText(this, "Your device doesn't support AR.", Toast.LENGTH_LONG);
            finish();
            return ;
        }
    }

    /**
     * onSurfaceCreated - called when GLSurfaceView is created.
     * USE FOR SETTING, ONLY HAPPENS ONCE
     * @param gl GL interface.
     * @param config EGLConfig of created surface.
     */
    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {

    }


    /**
     * onDrawFrame - called on each redraw of the surface
     * USE AS PRIMARY EXECUTION POINT FOR DRAW/REDRAW OF GRAPHICS
     * @param gl GL interface.
     */
    @Override
    public void onDrawFrame(GL10 gl) {

    }

    /**
     * onSurfaceChanged - called when surface changes size and when surface is created.
     * @param gl GL interface
     * @param width changed(?) width
     * @param height changed(?) height
     */
    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {

    }

}
