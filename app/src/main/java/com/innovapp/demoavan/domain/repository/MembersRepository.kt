package com.innovapp.demoavan.domain.repository

import com.innovapp.demoavan.domain.model.ErrorModel
import com.innovapp.demoavan.domain.model.MemberModel
import com.innovapp.demoavan.domain.model.SuccessModel
import com.innovapp.demoavan.domain.util.ResultType

interface MembersRepository {

    suspend fun createMember(): ResultType<SuccessModel, ErrorModel>

    suspend fun getMembers(): ResultType<MemberModel, ErrorModel>

    suspend fun deleteMember(): ResultType<SuccessModel, ErrorModel>
}