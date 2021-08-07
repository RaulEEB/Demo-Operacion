package com.innovapp.demoavan.data.mapper

import com.innovapp.demoavan.data.entity.User
import com.innovapp.demoavan.domain.model.UserModel

object UserMapper {

    fun transformDTOtoModel(user: User) = UserModel(user.name, user.lastName, user.email, user.pass)
}