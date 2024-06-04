package com.firebase.test.login

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.firebase.test.MainActivity
import com.firebase.test.databinding.ActivityLogInBinding
import com.firebase.test.signup.SignupActivity
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

/**
 * Demonstrate Firebase Authentication using a custom minted token. For more information, see:
 * https://firebase.google.com/docs/auth/android/custom-auth
 */

class LoginActivity : Activity() {
    private lateinit var loginViewModel: LoginViewModel
    private lateinit var binding: ActivityLogInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onButtons(binding)
    }

    private fun onButtons(binding: ActivityLogInBinding) {
        onLoginButton(binding)
        onSignupButton(binding)
    }
    private fun onLoginButton(binding: ActivityLogInBinding) {
        binding.btnLogIn.setOnClickListener {
            val email = binding.etEmail.text.toString()
            val password = binding.etPassword.text.toString()
            Firebase.auth.signInWithEmailAndPassword(email, password)

            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("email", email)
            startActivity(intent)
        }
    }
    private fun onSignupButton(binding: ActivityLogInBinding) {
        binding.btnSignUp.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }
    }

}