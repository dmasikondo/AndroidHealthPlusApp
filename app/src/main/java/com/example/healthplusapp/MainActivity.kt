package com.example.healthplusapp

import android.app.Service
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import android.net.NetworkInfo as NetworkInfo1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Declaring the textView from the layout file
        // This textView will display the type of connection
        // Either WIFI, MOBILE DATA, or Not Connected
    /*    val networkConnectionStatus = findViewById<TextView>(R.id.tvNetwork)

        // A Thread that will continuously monitor the Connection Type
        Thread(Runnable {
            while (true) {
                // This string is displayed when device is not connected
                // to either of the aforementioned states
                var conStant: String = "You have no Internet"

                // Invoking the Connectivity Manager
                val cm = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

                // Fetching the Network Information
                val netInfo = cm.allNetworkInfo

                // Finding if Network Info typeName is WIFI or MOBILE (Constants)
                // If found, the conStant string is supplied WIFI or MOBILE DATA
                // respectively. The supplied data is a Variable
                for (ni in netInfo) {
                    if (ni.typeName.equals("WIFI", ignoreCase = true))
                        if (ni.isConnected) conStant = "You are using WIFI"
                    if (ni.typeName.equals("MOBILE", ignoreCase = true))
                        if (ni.isConnected) conStant = "You are using MOBILE DATA"
                }

                // To update the layout elements in real-time, use runOnUiThread method
                // We are setting the text in the TextView as the string conState
                runOnUiThread {
                    networkConnectionStatus.text = conStant
                }
            }
        }).start() // Starting the thread*/

       // Toast.makeText(this, "Welcome", Toast.LENGTH_LONG )
    }

}