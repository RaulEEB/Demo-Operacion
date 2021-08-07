package com.innovapp.demoavan.domain.usecase

import com.innovapp.demoavan.domain.model.ErrorModel
import com.innovapp.demoavan.domain.model.MemberModel
import com.innovapp.demoavan.domain.model.SuccessModel
import com.innovapp.demoavan.domain.repository.MembersRepository
import com.innovapp.demoavan.domain.util.ResultType

class MemberUseCase(private val repository: MembersRepository) {

    suspend fun createMember(): ResultType<SuccessModel, ErrorModel> = repository.createMember()

    suspend fun getMembers(): ResultType<MemberModel, ErrorModel> = repository.getMembers()

    suspend fun deleteMember(): ResultType<SuccessModel, ErrorModel> = repository.deleteMember()
}