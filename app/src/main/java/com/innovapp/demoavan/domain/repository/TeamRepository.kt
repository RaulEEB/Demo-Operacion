package com.innovapp.demoavan.domain.repository

import com.innovapp.demoavan.domain.model.ErrorModel
import com.innovapp.demoavan.domain.model.TeamModel
import com.innovapp.demoavan.domain.util.ResultType

interface TeamRepository {

    suspend fun createNewTeam(): ResultType<TeamModel, ErrorModel>

    suspend fun getTeams(): ResultType<List<TeamModel>, ErrorModel>

    suspend fun getTeamId(): ResultType<TeamModel, ErrorModel>
}