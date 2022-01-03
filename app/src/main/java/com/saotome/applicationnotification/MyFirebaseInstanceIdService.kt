package com.saotome.applicationnotification


import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService

open class MyFirebaseInstanceIdService : FirebaseInstanceIdService() {

    // Servico de Tokens - e, sim, está tudo deprecado...
    override fun onTokenRefresh() {
        Log.i("**NovoTokenService", FirebaseInstanceId.getInstance().token.toString())
    }

}