package com.firebase.test.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class LoginViewModel: ViewModel() {
    private val _email = MutableLiveData<String>()
    private val _password = MutableLiveData<String>()
    val email: LiveData<String>
        get() = _email // get() 사용: _email 값이 바뀔 때마다 email에 _email 값이 반영된다.
    val password: LiveData<String>
        get() = _password

    init{
        _email.value = ""
        _password.value = ""
    }

    fun updateLoginPage(type: actionType){
        when(type) {
            actionType.LoginButtonClicked -> _email
            actionType.SignupButtonClicked -> _email
        }
    }
}

enum class actionType{
    SignupButtonClicked, LoginButtonClicked
}