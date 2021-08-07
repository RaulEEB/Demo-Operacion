package com.innovapp.demoavan.domain.usecase

import com.innovapp.demoavan.domain.model.ErrorModel
import com.innovapp.demoavan.domain.model.SuccessModel
import com.innovapp.demoavan.domain.model.UserModel
import com.innovapp.demoavan.domain.repository.UserRepository
import com.innovapp.demoavan.domain.util.ResultType

class UserUseCase(private val repository: UserRepository) {

    suspend fun createUser():ResultType<UserModel, ErrorModel> = repository.createUser()

    suspend fun verifyUser():ResultType<UserModel,ErrorModel> = repository.verifyUser()

}