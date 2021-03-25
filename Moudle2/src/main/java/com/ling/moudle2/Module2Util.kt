package com.ling.moudle2

import android.content.Context
import android.widget.Toast


/**
 * Created by ChenLingyun on 2021/3/25.
 */

fun Context.module2Toast(){
    Toast.makeText(this, "来自子模块2的招呼：你好", Toast.LENGTH_SHORT).show()
}