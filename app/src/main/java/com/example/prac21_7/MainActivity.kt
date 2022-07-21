package com.example.prac21_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.prac21_7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    // in java Student s;  so in kotlin  var s:Student(this is data type)
    // lateint means binding this variable which data type is ActivityMainBinding will be declare/inialize future .


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        var student = Student("pgs", "RIT", 18)

        binding.btnSetValue.setOnClickListener() {
//            binding.tvAge.text=student.age.toString()
//            binding.pgs1 =student

            student.age = 16

            student.name="sohai"

            binding.apply() {
                invalidateAll()
            }
            //if update any field in dataclass need force UI to update or else will not update
//        }

            binding.btnGetValue.setOnClickListener() {
//            binding.tvAge.text=student.age.toString()
                binding.pgs1 = student
            }
        }
    }
}