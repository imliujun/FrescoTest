package info.liujun.frescotest;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(getApplicationContext());
        setContentView(R.layout.activity_main);
        SimpleDraweeView gifAbnormal = (SimpleDraweeView) findViewById(R.id.gif_abnormal);

        //this GIF image w=194 h=194 setAutoPlayAnimations(true)
        //in 'com.facebook.fresco:fresco:1.1.0' Play normal
        //in 'com.facebook.fresco:fresco:0.14.1' Play abnormal
        PipelineDraweeControllerBuilder giftAbnormalBuilder = Fresco
                .newDraweeControllerBuilder()
                .setUri("http://heixiucrm-test.img-cn-beijing.aliyuncs.com/20160623175055_gift_select_animation_1466675455807.gif@194w_194h_1l_1e_1an.gif")
                .setAutoPlayAnimations(true);
        gifAbnormal.setController(giftAbnormalBuilder.build());

        //this GIF image w=195 h=195
        //in 'com.facebook.fresco:fresco:1.1.0' Play normal
        //in 'com.facebook.fresco:fresco:0.14.1' Play normal
        SimpleDraweeView gifNormal = (SimpleDraweeView) findViewById(R.id.gif_normal);
        PipelineDraweeControllerBuilder gifNormalBuilder = Fresco
                .newDraweeControllerBuilder()
                .setUri("http://heixiucrm-test.img-cn-beijing.aliyuncs.com/20160623175055_gift_select_animation_1466675455807.gif@195w_195h_1l_1e_1an.gif")
                .setAutoPlayAnimations(true);
        gifNormal.setController(gifNormalBuilder.build());

        //fresco:roundAsCircle="true"
        //in 'com.facebook.fresco:fresco:1.1.0'  Show squares
        //in 'com.facebook.fresco:fresco:0.14.1' Show circle
        SimpleDraweeView circleImage = (SimpleDraweeView) findViewById(R.id.circle_image);
        circleImage.setImageURI(Uri
                .parse("http://q.qlogo.cn/qqapp/1105162427/6A30867E7F0BE97F943C31F32A094584/100"));
    }
}
