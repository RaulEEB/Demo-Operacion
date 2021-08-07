package com.innovapp.demoavan.presentation.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.innovapp.demoavan.R
import com.innovapp.demoavan.databinding.ActivityTeamMemberBinding
import com.innovapp.demoavan.presentation.view.dialog.BottomSheetDialogMember

class TeamMemberActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTeamMemberBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_team_member)
        binding = DataBindingUtil.setContentView(
            this, R.layout.activity_team_member
        )
        binding.btnBack.setOnClickListener { onBackPressed() }
        binding.floatingButtonMember.setOnClickListener {
            val bottom = BottomSheetDialogMember()
            bottom.show(supportFragmentManager, "TAG-Member")
        }
    }

}