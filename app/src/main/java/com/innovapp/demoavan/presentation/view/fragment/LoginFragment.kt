package com.innovapp.demoavan.presentation.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.innovapp.demoavan.R
import com.innovapp.demoavan.databinding.FragmentLoginBinding
import com.innovapp.demoavan.domain.model.UserModel
import com.innovapp.demoavan.presentation.model.UserViewModel
import com.innovapp.demoavan.presentation.modelFactory.UserViewModelFactory

class LoginFragment : Fragment() {

    private lateinit var viewModel: UserViewModel

    private lateinit var binding: FragmentLoginBinding
    private lateinit var navController: NavController

    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(layoutInflater)

        navController = findNavController()
        return binding.root
    }

    private fun observableUser(model: UserViewModel.UiViewModelUser) {
        when (model) {
            is UserViewModel.UiViewModelUser.ShowData -> {
                navController.navigate(R.id.home_activity)

            }
            is UserViewModel.UiViewModelUser.ShowError -> {

            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textNewAccount.setOnClickListener {
            navController.navigate(R.id.newaccount_fragment)
        }
        binding.btnCreate.setOnClickListener {
            viewModel =
                ViewModelProviders.of(
                    this,
                    UserViewModelFactory(
                        activity!!.application,
                        UserModel(
                            "",
                            "",
                            binding.tieEmail.text.toString(),
                            binding.tiePassword.text.toString()
                        )
                    )
                ).get(UserViewModel::class.java)

            viewModel.model.observe(viewLifecycleOwner, Observer(::observableUser))
            viewModel.verifyUser()
        }
    }

    companion object {
        /*fun newInstance(param1: String, param2: String) =
            LoginFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }*/
    }
}