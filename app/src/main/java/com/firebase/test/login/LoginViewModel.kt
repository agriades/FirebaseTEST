package com.firebase.test.login

import android.util.Log
import androidx.lifecycle.ViewModel

class LoginViewModel: ViewModel() {
    fun loginRequest(email: String, password: String, isAutoLogin: Boolean) {
        Log.d("LoginViewModel", "email : $email | password : $password | isAutoLogin : $isAutoLogin")
    }
}
