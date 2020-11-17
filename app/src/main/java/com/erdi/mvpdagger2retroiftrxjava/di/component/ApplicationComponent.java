package com.erdi.mvpdagger2retroiftrxjava.di.component;

import android.content.Context;


import com.erdi.mvpdagger2retroiftrxjava.MyApplication;
import com.erdi.mvpdagger2retroiftrxjava.di.module.ContextModule;
import com.erdi.mvpdagger2retroiftrxjava.di.module.RetrofitModule;
import com.erdi.mvpdagger2retroiftrxjava.di.qualifier.ApplicationContext;
import com.erdi.mvpdagger2retroiftrxjava.di.scopes.ApplicationScope;
import com.erdi.mvpdagger2retroiftrxjava.retrofit.APIInterface;

import dagger.Component;

@ApplicationScope
@Component(modules = {ContextModule.class, RetrofitModule.class})
public interface ApplicationComponent {

    APIInterface getApiInterface();

    @ApplicationContext
    Context getContext();

    void injectApplication(MyApplication myApplication);
}
