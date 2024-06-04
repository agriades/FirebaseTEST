package com.firebase.test

import android.app.Activity
import android.os.Bundle
import com.firebase.test.databinding.ActivityLogInBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

/**
 * Demonstrate Firebase Authentication using a custom minted token. For more information, see:
 * https://firebase.google.com/docs/auth/android/custom-auth
 */

class LogInActivity : Activity() {
    private lateinit var binding: ActivityLogInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val email = binding.etId.text.toString()
            val password = binding.etPassword.text.toString()
            Firebase.auth.signInWithEmailAndPassword(email, password)
        }
    }

}