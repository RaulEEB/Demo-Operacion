package com.innovapp.demoavan.presentation.util

import androidx.lifecycle.ViewModel

abstract class ScopeViewModel : ViewModel(), Scope by Scope.Impl() {

    override fun onCleared() {
        destroyScope()
        super.onCleared()
    }
}