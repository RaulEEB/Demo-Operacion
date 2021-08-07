package com.innovapp.demoavan.domain.model

import java.util.*

data class TeamModel(
    val name:String,
    val sentence: String,
    val listMember: ArrayList<MemberModel>
)