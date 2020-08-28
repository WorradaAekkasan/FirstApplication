package com.example.firstapplication

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.firstapplication.database.ContactDao
import com.example.firstapplication.databinding.FragmentContactBinding

class ContactViewModel (
    val database: ContactDao,
    private val binding: FragmentContactBinding,
    application: Application
) : AndroidViewModel(application) {
}