package com.innovapp.demoavan.presentation.view.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.innovapp.demoavan.R

/**
 * CREATE by RaulEB on 6/08/2021
 **/
class BottomSheetDialogTeam: BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val inflater = inflater.inflate(R.layout.bottom_sheet_dialog_team,container,false)

        return inflater
    }
}