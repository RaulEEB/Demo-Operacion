package com.innovapp.demoavan.data.storage

import com.innovapp.demoavan.data.service.UserServiceDataStore
import com.innovapp.demoavan.domain.model.UserModel

class UserStoreFactory(
    private val userModel: UserModel
) {
    fun create(): UserServiceDataStore {
        return UserServiceDataStore(userModel)
    }


}