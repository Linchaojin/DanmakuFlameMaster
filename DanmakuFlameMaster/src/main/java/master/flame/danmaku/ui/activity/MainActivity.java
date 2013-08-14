package master.flame.danmaku.ui.activity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.VideoView;
import master.flame.danmaku.activity.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        VideoView video = (VideoView) findViewById(R.id.video);
        video.setVideoPath("/mnt/sdcard/0.mp4");
        video.start();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    
    
}
