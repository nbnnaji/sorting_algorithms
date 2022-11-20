package com.nkechinnaji.datasorting

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.nkechinnaji.datasorting.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), SortPicsAdapter.OnItemClickListener {

    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = viewBinding.root
        setContentView(view)
        val numList = intArrayOf(9, 4, 7, 2, 6, 10, 20, 34, 1, 3)
        viewBinding.unSortedList.text = "Prior sorting: ${numList.joinToString(",")}"
        sortSelection(numList)
        viewBinding.sortedList.text = "Sorted List: ${numList.joinToString(",")}"

        var picAdapter = SortPicsAdapter(this)
        viewBinding.recyclerview.adapter = picAdapter

    }


    fun sortSelection(numberList: IntArray) {
        //Holds temp data
        var temp = 0
        var data = numberList.size - 1
        for (i in 0 until data) {
            //Holds outer loop position
            var miniValue = i
            //Inner loop starts from last index all the way back to position of outer loop
            for (j in data downTo miniValue) {
                if (numberList[j] < numberList[miniValue]) {
                    miniValue = j
                }

                //Check that index positions are not the same
                if (i != miniValue) {
                    temp = numberList[i]
                    numberList[i] = numberList[miniValue]
                    numberList[miniValue] = temp
                }
            }
        }
    }

    override fun onItemClick(itemPosition: Int, numClicks: Int) {
        Toast.makeText(this, "Reversing the words", Toast.LENGTH_SHORT).show()

    }


}