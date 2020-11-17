package com.erdi.mvpdagger2retroiftrxjava.di.component;

import android.content.Context;

import com.erdi.mvpdagger2retroiftrxjava.MainActivity;
import com.erdi.mvpdagger2retroiftrxjava.di.module.AdapterModule;
import com.erdi.mvpdagger2retroiftrxjava.di.module.MainActivityMvpModule;
import com.erdi.mvpdagger2retroiftrxjava.di.qualifier.ActivityContext;
import com.erdi.mvpdagger2retroiftrxjava.di.scopes.ActivityScope;
import dagger.Component;


@ActivityScope
@Component(modules = {AdapterModule.class, MainActivityMvpModule.class}, dependencies = ApplicationComponent.class)
public interface MainActivityComponent {

    @ActivityContext
    Context getContext();
    void injectMainActivity(MainActivity mainActivity);
}
