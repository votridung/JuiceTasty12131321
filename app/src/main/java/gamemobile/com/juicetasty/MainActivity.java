package gamemobile.com.juicetasty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imvtea;//Khởi tạo biến
    private ImageView imvst;
    private ImageView imvcafe;
    private ImageView imvne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imvtea = (ImageView) findViewById(R.id.tea);//gán các biến vào các địa chỉ các nút bên layout
        imvst = (ImageView) findViewById(R.id.st);
        imvcafe = (ImageView) findViewById(R.id.imv_cf) ;
        imvne = (ImageView) findViewById(R.id.imv_juice);

        imvtea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TeaActivity.class);
                startActivity(intent);//câu lệnh thực thi khởi tạo activity
            }
        });// set câu lệnh chuyển trang vào các biến vừa gán ở trên
        imvst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,StActivity.class);
                startActivity(intent);
            }
        });
        imvcafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CafeActivity.class);
                startActivity(intent);
            }
        });
        imvne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,NeActivity.class);
                startActivity(intent);
            }
        });
    }
}
