package com.innovapp.demoavan.presentation.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.innovapp.demoavan.domain.model.ErrorModel
import com.innovapp.demoavan.domain.model.UserModel
import com.innovapp.demoavan.domain.usecase.UserUseCase
import com.innovapp.demoavan.domain.util.ResultType
import com.innovapp.demoavan.presentation.util.ScopeViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class UserViewModel(private val userUseCase: UserUseCase) : ScopeViewModel() {

    private val mutableViewModel = MutableLiveData<UiViewModelUser>()

    val model: LiveData<UiViewModelUser>
        get() {
            return mutableViewModel
        }

    init {
        initScope()
    }

    fun createUser() {
        GlobalScope.launch(Dispatchers.Main) {
            when (val result = userUseCase.createUser()) {
                is ResultType.Success -> mutableViewModel.value = UiViewModelUser.ShowData(
                    result.value
                )
                is ResultType.Error -> mutableViewModel.value =
                    UiViewModelUser.ShowError(result.value)
            }
        }
    }

    fun verifyUser() {
        GlobalScope.launch(Dispatchers.Main) {
            when (val result = userUseCase.verifyUser()) {
                is ResultType.Success -> mutableViewModel.value =
                    UiViewModelUser.ShowData(result.value)
                is ResultType.Error -> mutableViewModel.value =
                    UiViewModelUser.ShowError(result.value)
            }
        }
    }

    sealed class UiViewModelUser() {
        class ShowData(val userModel: UserModel) : UiViewModelUser()
        class ShowError(val error: ErrorModel) : UiViewModelUser()
    }

}