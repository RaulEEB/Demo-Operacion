package com.innovapp.demoavan.data.dataStore

import com.innovapp.demoavan.domain.model.ErrorModel
import com.innovapp.demoavan.domain.model.MemberModel
import com.innovapp.demoavan.domain.model.SuccessModel
import com.innovapp.demoavan.domain.util.ResultType

interface MemberDataStore {

    suspend fun createMember(): ResultType<SuccessModel, ErrorModel>

    suspend fun getMembers(): ResultType<MemberModel, ErrorModel>

    suspend fun deleteMember(): ResultType<SuccessModel, ErrorModel>

}