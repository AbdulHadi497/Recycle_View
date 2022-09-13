package com.example.recycleview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.Rec_V)


        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        val hashMap: HashMap<Int, ItemView> = HashMap<Int, ItemView>()
        hashMap[1] = ItemView(
            image = R.drawable.image001,
            text = "ORANGE",
            text_2 = "APPLE",
            text_3 = "PINEAPPLE"
        )
        hashMap[2] = ItemView(
            image = R.drawable.image001,
            text = "ORANGE",
            text_2 = "APPLE",
            text_3 = "PINEAPPLE"
        )
        hashMap[3] = ItemView(
            image = R.drawable.image001,
            text = "ORANGE",
            text_2 = "APPLE",
            text_3 = "PINEAPPLE"
        )
        hashMap[4] = ItemView(
            image = R.drawable.image001,
            text = "ORANGE",
            text_2 = "APPLE",
            text_3 = "PINEAPPLE"
        )
        hashMap[5] = ItemView(
            image = R.drawable.image001,
            text = "ORANGE",
            text_2 = "APPLE",
            text_3 = "PINEAPPLE"
        )
        hashMap[6] = ItemView(
            image = R.drawable.image001,
            text = "ORANGE",
            text_2 = "APPLE",
            text_3 = "PINEAPPLE"
        )
        hashMap[7] = ItemView(
            image = R.drawable.image001,
            text = "ORANGE",
            text_2 = "APPLE",
            text_3 = "PINEAPPLE"
        )
        hashMap[8] = ItemView(
            image = R.drawable.image001,
            text = "ORANGE",
            text_2 = "APPLE",
            text_3 = "PINEAPPLE"
        )
        hashMap[9] = ItemView(
            image = R.drawable.image001,
            text = "ORANGE",
            text_2 = "APPLE",
            text_3 = "PINEAPPLE"
        )
        hashMap[10] = ItemView(
            image = R.drawable.image001,
            text = "ORANGE",
            text_2 = "APPLE",
            text_3 = "PINEAPPLE"
        )
        hashMap[11] = ItemView(
            image = R.drawable.image001,
            text = "ORANGE",
            text_2 = "APPLE",
            text_3 = "PINEAPPLE"
        )

        val list_data = ArrayList<ItemView>()
        for (entry in hashMap.entries) {
//                if(entry.value.text.startsWith("O")){
//                    hashMap.remove(entry.key)
//                }
//            Log.d("TAG", "onCreate: ${entry.key} : ${entry.value} ")
            list_data.add(entry.value)
        }

        // ArrayList of class ItemView
        /* val list_data = ArrayList<ItemView>()
        list_data.add(ItemView(image = R.drawable.image001, text = "ORANGE", text_2 = "APPLE", text_3 = "PINEAPPLE" ))
        list_data.add(ItemView(image = R.drawable.image001, text = "ORANGE", text_2 = "APPLE", text_3 = "PINEAPPLE"))
        list_data.add(ItemView(image = R.drawable.image001, text = "ORANGE", text_2 = "APPLE", text_3 = "PINEAPPLE"))
        list_data.add(ItemView(image = R.drawable.image001, text = "ORANGE", text_2 = "APPLE", text_3 = "PINEAPPLE"))
        list_data.add(ItemView(image = R.drawable.image001, text = "ORANGE", text_2 = "APPLE", text_3 = "PINEAPPLE"))
        list_data.add(ItemView(image = R.drawable.image001, text = "ORANGE", text_2 = "APPLE", text_3 = "PINEAPPLE"))
        list_data.add(ItemView(image = R.drawable.image001, text = "ORANGE", text_2 = "APPLE", text_3 = "PINEAPPLE"))
        list_data.add(ItemView(image = R.drawable.image001, text = "ORANGE", text_2 = "APPLE", text_3 = "PINEAPPLE"))
*/

        val adapter = AdapterView(list_data)
        recyclerview.adapter = adapter

    }
}
