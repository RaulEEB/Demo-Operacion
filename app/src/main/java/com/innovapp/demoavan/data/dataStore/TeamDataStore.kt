package com.innovapp.demoavan.data.dataStore

import com.innovapp.demoavan.domain.model.ErrorModel
import com.innovapp.demoavan.domain.model.TeamModel
import com.innovapp.demoavan.domain.util.ResultType

interface TeamDataStore {

    suspend fun createNewTeam(): ResultType<TeamModel, ErrorModel>

    suspend fun getTeams(): ResultType<List<TeamModel>, ErrorModel>

    suspend fun getTeamId(): ResultType<TeamModel, ErrorModel>
}