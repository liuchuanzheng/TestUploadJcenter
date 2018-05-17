package com.liuchuanzheng.toastutil;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by 刘传政 on 2018/5/17 0017.
 * QQ:1052374416
 * 电话:18501231486
 * 作用:
 * 注意事项:
 */

public class MyToast {
    public static void show(Context context,String msg){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show();
    }
}
