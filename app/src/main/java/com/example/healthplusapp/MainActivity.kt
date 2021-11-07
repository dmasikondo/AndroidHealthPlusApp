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
import androidx.cardview.widget.CardView
import android.net.NetworkInfo as NetworkInfo1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cvPrevention = findViewById<CardView>(R.id.cvPrevention)
        val cvTreatment = findViewById<CardView>(R.id.cvTreatment)
        val cvPmtct = findViewById<CardView>(R.id.cvPmtct)
        val cvVideo = findViewById<CardView>(R.id.cvVideo)
        val cvFactsheet = findViewById<CardView>(R.id.cvFactsheet)
        val cvQuiz = findViewById<CardView>(R.id.cvQuiz)
        cvPrevention.setOnClickListener{
            Toast.makeText(this, "Prevention",Toast.LENGTH_SHORT).show()
        }
        cvVideo.setOnClickListener{
            Toast.makeText(this, "Video",Toast.LENGTH_SHORT).show()
        }
        cvTreatment.setOnClickListener{
            Toast.makeText(this, "Treatment",Toast.LENGTH_SHORT).show()
        }
        cvPmtct.setOnClickListener{
            Toast.makeText(this, "Pmtct",Toast.LENGTH_SHORT).show()
        }
        cvFactsheet.setOnClickListener{
            Toast.makeText(this, "Factsheet",Toast.LENGTH_SHORT).show()
        }
        cvQuiz.setOnClickListener{
            Toast.makeText(this, "Quiz",Toast.LENGTH_SHORT).show()
        }


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