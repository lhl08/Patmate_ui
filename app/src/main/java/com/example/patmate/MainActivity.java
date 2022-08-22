package com.example.patmate;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.login_btn_forgetregister);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){new AlertDialog.Builder(MainActivity.this).setTitle("系统提示").setMessage("请输入验证信息进行验证!")
                    .setPositiveButton("确定",new DialogInterface.OnClickListener(){
                        @Override
                        public void onClick(DialogInterface dialog,int which){
                            finish();
                        }
                    }).setNegativeButton("返回",new DialogInterface.OnClickListener(){
                        @Override
                        public void onClick(DialogInterface dialog,int which){
                        }

                    }).show();
            }
        });
        Button button1=(Button)findViewById(R.id.login_btn_login);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                new AlertDialog.Builder(MainActivity.this).setTitle("系统提示").setMessage("验证成功!")
                        .setNegativeButton("确定",new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialog,int which){
                            }
                        }).show();
            }
        });
        Button button2=(Button)findViewById(R.id.login_btn_register);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                new AlertDialog.Builder(MainActivity.this).setTitle("系统提示").setMessage("注册成功!")
                        .setNegativeButton("确定",new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialog,int which){
                            }
                        }).show();
            }
        });
    }
}
public class MainActivity extends