package `in`.tutorial.oakbroadcastrecv

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class BroadcastExample : BroadcastReceiver(){
    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirplaneMode : Boolean = intent!!.getBooleanExtra("state", false)
        if(isAirplaneMode){
            Toast.makeText(context, "Is in Airplane Mode", Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(context, "Is not in Airplane Mode", Toast.LENGTH_LONG).show()
        }
    }
}