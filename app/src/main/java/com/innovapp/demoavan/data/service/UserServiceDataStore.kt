package com.innovapp.demoavan.data.service

import com.innovapp.demoavan.data.dataStore.UserDataStore
import com.innovapp.demoavan.data.entity.User
import com.innovapp.demoavan.data.mapper.UserMapper
import com.innovapp.demoavan.domain.model.ErrorModel
import com.innovapp.demoavan.domain.model.UserModel
import com.innovapp.demoavan.domain.util.ResultType

class UserServiceDataStore(
    private val userModel: UserModel
) : UserDataStore {

    override suspend fun createUser(): ResultType<UserModel, ErrorModel> {
        when {
            1 == 3 -> {
                return ResultType.Success(UserMapper.transformDTOtoModel(User("", "", "", "")))
            }
            else -> {
                return ResultType.Error(ErrorModel(""))
            }
        }
    }

    override suspend fun verifyUser(): ResultType<UserModel, ErrorModel> {
        when {
            1 == 3 -> {
                return ResultType.Success(UserMapper.transformDTOtoModel(User("", "", "", "")))
            }
            else -> {
                return ResultType.Error(ErrorModel(""))
            }
        }
    }
}