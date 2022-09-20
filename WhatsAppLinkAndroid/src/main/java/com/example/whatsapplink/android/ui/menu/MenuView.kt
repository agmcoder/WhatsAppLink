package com.example.whatsapplink.android.ui.menu
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//composable view with text-field for a phone number
@Composable
fun MenuView(menuViewModel: MenuViewModel) {


    Column {
        Spacer(modifier = Modifier.padding(bottom = 200.dp))
        NumberField(menuViewModel)
        openURLButton(menuViewModel)
        Spacer(modifier = Modifier.padding(top = 200.dp))

    }

}


@Composable
fun NumberField(menuViewModel: MenuViewModel) {
var text= rememberSaveable { mutableStateOf("") }

    TextField(
        value = menuViewModel.number.collectAsState().value,
        onValueChange = { menuViewModel.updateNumber(it) },
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        placeholder = { Text(text = "Phone Number") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),

        )
}

@Composable
fun openURLButton(menuViewModel: MenuViewModel) {


    Column(

        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .fillMaxWidth()

            .padding(5.dp),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {


        // on below line adding a spacer.
        Spacer(modifier = Modifier.height(20.dp))


        val context = LocalContext.current

        Button(onClick = {
            menuViewModel.callAPI(context)
        }) {
            // on below line creating a text for our button.
            Text(
                // on below line adding a text ,
                // padding, color and font size.
                text = "Open URL",
                modifier = Modifier.padding(10.dp),
                color = androidx.compose.ui.graphics.Color.White,
                fontSize = 15.sp
            )
        }
    }


}



