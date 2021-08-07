package com.innovapp.demoavan.data.repository

import com.innovapp.demoavan.data.storage.UserStoreFactory
import com.innovapp.demoavan.domain.model.ErrorModel
import com.innovapp.demoavan.domain.model.UserModel
import com.innovapp.demoavan.domain.repository.UserRepository
import com.innovapp.demoavan.domain.util.ResultType

class UserRepository(private val userDataStoreFactory: UserStoreFactory) : UserRepository {

    override suspend fun createUser(): ResultType<UserModel, ErrorModel> {
        val userDataStore = userDataStoreFactory.create()
        return userDataStore.createUser()
    }

    override suspend fun verifyUser(): ResultType<UserModel, ErrorModel> {
        val userDataStore = userDataStoreFactory.create()
        return userDataStore.verifyUser()
    }
}