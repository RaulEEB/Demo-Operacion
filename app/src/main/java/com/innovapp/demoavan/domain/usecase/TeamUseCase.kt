package com.innovapp.demoavan.domain.usecase

import com.innovapp.demoavan.domain.model.ErrorModel
import com.innovapp.demoavan.domain.model.TeamModel
import com.innovapp.demoavan.domain.repository.TeamRepository
import com.innovapp.demoavan.domain.util.ResultType

class TeamUseCase(private val repository: TeamRepository) {

    suspend fun createNewTeam(): ResultType<TeamModel, ErrorModel> = repository.createNewTeam()

    suspend fun getTeams(): ResultType<List<TeamModel>, ErrorModel> = repository.getTeams()

    suspend fun getTeamId(): ResultType<TeamModel, ErrorModel> = repository.getTeamId()
}