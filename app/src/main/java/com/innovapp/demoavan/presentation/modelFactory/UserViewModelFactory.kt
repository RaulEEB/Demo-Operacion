package com.innovapp.demoavan.presentation.modelFactory

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.innovapp.demoavan.data.repository.UserRepository
import com.innovapp.demoavan.data.storage.UserStoreFactory
import com.innovapp.demoavan.domain.model.UserModel
import com.innovapp.demoavan.domain.usecase.UserUseCase
import com.innovapp.demoavan.presentation.model.UserViewModel
import java.lang.IllegalArgumentException

class UserViewModelFactory constructor(
    private val application: Application,
    private val userModel: UserModel
) : ViewModelProvider.AndroidViewModelFactory(application) {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(UserViewModel::class.java)) {
            val request = UserRepository(
                UserStoreFactory(userModel)
            )
            val useCase = UserUseCase(request)
            UserViewModel(useCase) as T
        }else {
            throw IllegalArgumentException("ViewModel not Found")
        }
    }

}