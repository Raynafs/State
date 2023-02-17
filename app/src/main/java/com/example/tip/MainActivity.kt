package com.example.tip

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tip.ui.theme.TipTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TipTheme {
                Surface()
                {
                    Tip()
                }
            }
        }
    }
}

@Composable
fun Tip()
{
    var input by remember {mutableStateOf("0")}

Column (modifier = Modifier
    .fillMaxSize()
    .padding(top=250.dp),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.spacedBy(32.dp)

)
{
    Text(
        text = stringResource(id = R.string.calculate_tip),
        fontSize= 24.sp,
        modifier = Modifier.align(Alignment.CenterHorizontally)
    )
    TextField(value = input, onValueChange = {input=it} )
    Button(onClick = { /*TODO*/ }) {
        Text(text= "Calculate")
    }
}
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TipTheme {
        Tip()
    }
}