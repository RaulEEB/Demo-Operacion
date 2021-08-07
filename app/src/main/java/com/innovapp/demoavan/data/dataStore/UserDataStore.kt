package com.innovapp.demoavan.data.dataStore

import com.innovapp.demoavan.domain.model.ErrorModel
import com.innovapp.demoavan.domain.model.UserModel
import com.innovapp.demoavan.domain.util.ResultType

interface UserDataStore {

    suspend fun createUser(): ResultType<UserModel, ErrorModel>

    suspend fun verifyUser(): ResultType<UserModel, ErrorModel>

}