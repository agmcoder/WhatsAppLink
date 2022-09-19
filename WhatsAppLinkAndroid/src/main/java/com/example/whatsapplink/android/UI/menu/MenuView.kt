package com.example.whatsapplink.android.UI.menu

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

//composable view with text-field for a phone number
@Composable
fun MenuView(menuViewModel: MenuViewModel){
    val number = rememberSaveable{ mutableStateOf("") }

    Column {
        Spacer(modifier=Modifier.padding(bottom = 200.dp))
        NumberField(number)
        Spacer(modifier=Modifier.padding(top=200.dp))

    }

}



@Composable
fun NumberField(number : MutableState<String>){


    TextField(
        value = number.value,
        onValueChange = {number.value = it},
        modifier= Modifier
            .fillMaxWidth()
            .padding(10.dp),
        placeholder = { Text(text = "Phone Number")},
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),

    )
}


