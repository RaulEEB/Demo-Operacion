package com.innovapp.demoavan.domain.repository

import com.innovapp.demoavan.domain.model.ErrorModel
import com.innovapp.demoavan.domain.model.UserModel
import com.innovapp.demoavan.domain.util.ResultType

interface UserRepository {

    suspend fun createUser(): ResultType<UserModel,ErrorModel>

    suspend fun verifyUser(): ResultType<UserModel,ErrorModel>

}