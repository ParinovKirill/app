package com.example.parinovkirill.Data

import android.util.Log
import com.example.parinovkirill.Data.Database.SignUpRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object ProvideModule {


    init {
        Log.d("MyLog", "ProvideModule Inited!")
    }

    @Provides
    fun provideSignUpRepositoryImpl() : SignUpRepositoryImpl {
        return SignUpRepositoryImpl
    }

}