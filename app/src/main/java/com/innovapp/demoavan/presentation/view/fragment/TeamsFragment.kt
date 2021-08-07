package com.innovapp.demoavan.presentation.view.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.innovapp.demoavan.R
import com.innovapp.demoavan.databinding.FragmentTeamsBinding
import com.innovapp.demoavan.presentation.view.activity.TeamMemberActivity
import com.innovapp.demoavan.presentation.view.adapter.TeamAdapter
import com.innovapp.demoavan.presentation.view.dialog.BottomSheetDialogMember
import com.innovapp.demoavan.presentation.view.dialog.BottomSheetDialogTeam

private const val ADD_MEMBERS = 0
private const val VIEW_MEMBERS = 1

class TeamsFragment : Fragment() {

    private lateinit var binding: FragmentTeamsBinding
    private lateinit var list: ArrayList<String>
    private lateinit var recyclerView: TeamAdapter
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTeamsBinding.inflate(layoutInflater)
        navController =findNavController()
        list = arrayListOf(
            "Hello word",
            "Hello word 2",
            "Hello word 3",
            "Hello word 4",
            "Hello word 5"
        )
        recyclerView = TeamAdapter(list)
        recyclerView.setOnClickListener(object : TeamAdapter.ClickListener {
            override fun onAddClick(team: String, typeAction: Int) {
                when (typeAction) {
                    ADD_MEMBERS -> {
                        val bottom = BottomSheetDialogMember()
                        bottom.show(childFragmentManager, "TAG-Member")
                    }
                    VIEW_MEMBERS -> {
                        startActivity(Intent(context,TeamMemberActivity::class.java))
                    }
                }

            }
        })
        binding.recyclerView.adapter = recyclerView
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.setHasFixedSize(true)
        binding.floatingButton.setOnClickListener {
            val bottom = BottomSheetDialogTeam()
            bottom.show(childFragmentManager, "TAG-Team")
        }

        //val root = inflater.inflate(R.layout.fragment_teams, container, false)

        return binding.root
    }
}