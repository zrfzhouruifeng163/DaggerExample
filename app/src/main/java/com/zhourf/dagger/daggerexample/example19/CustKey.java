package com.zhourf.dagger.daggerexample.example19;

import dagger.MapKey;

/**
 * 描述：
 * 作者：zhourf on 2018/4/28
 * 邮箱：zhourf@glodon.com
 */
@MapKey
public @interface CustKey {
    TestEnum value();
}
