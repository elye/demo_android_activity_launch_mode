package com.example.launchmodeexperiment

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.launchmodeexperiment.databinding.ActivityAllBinding

open class BasedActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAllBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAllBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonA.setOnClickListener {
            startActivity(Intent(this, AStandardActivity::class.java))
        }

        binding.buttonB.setOnClickListener {
            startActivity(Intent(this, BStandardActivity::class.java))
        }

        binding.buttonC.setOnClickListener {
            startActivity(Intent(this, CStandardActivity::class.java))
        }

        binding.buttonD.setOnClickListener {
            startActivity(Intent(this, DStandardActivity::class.java))
        }

        binding.buttonE.setOnClickListener {
            startActivity(Intent(this, EStandardActivity::class.java))
        }

        binding.buttonStopA.setOnClickListener {
            startActivity(Intent(this, ASingleTopActivity::class.java))
        }

        binding.buttonStopB.setOnClickListener {
            startActivity(Intent(this, BSingleTopActivity::class.java))
        }

        binding.buttonStopC.setOnClickListener {
            startActivity(Intent(this, CSingleTopActivity::class.java))
        }

        binding.buttonStopD.setOnClickListener {
            startActivity(Intent(this, DSingleTopActivity::class.java))
        }

        binding.buttonStopE.setOnClickListener {
            startActivity(Intent(this, ESingleTopActivity::class.java))
        }

        binding.buttonStaskA.setOnClickListener {
            startActivity(Intent(this, ASingleTaskActivity::class.java))
        }

        binding.buttonStaskB.setOnClickListener {
            startActivity(Intent(this, BSingleTaskActivity::class.java))
        }

        binding.buttonStaskC.setOnClickListener {
            startActivity(Intent(this, CSingleTaskActivity::class.java))
        }

        binding.buttonStaskD.setOnClickListener {
            startActivity(Intent(this, DSingleTaskActivity::class.java))
        }

        binding.buttonStaskE.setOnClickListener {
            startActivity(Intent(this, ESingleTaskActivity::class.java))
        }

        binding.buttonSinstanceA.setOnClickListener {
            startActivity(Intent(this, ASingleInstanceActivity::class.java))
        }

        binding.buttonSinstanceB.setOnClickListener {
            startActivity(Intent(this, BSingleInstanceActivity::class.java))
        }

        binding.buttonSinstanceC.setOnClickListener {
            startActivity(Intent(this, CSingleInstanceActivity::class.java))
        }

        binding.buttonSinstanceD.setOnClickListener {
            startActivity(Intent(this, DSingleInstanceActivity::class.java))
        }

        binding.buttonSinstanceE.setOnClickListener {
            startActivity(Intent(this, ESingleInstanceActivity::class.java))
        }
    }
}
