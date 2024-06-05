package com.example.myfirstjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myfirstjetpackcompose.ui.theme.MyFirstJetpackComposeTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Column(modifier =Modifier.fillMaxSize(),
                   horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center) {
                MyOutLineTextField()
            }
        }
    }
    @Composable
    fun MyTextField(){
        var textValue= remember {
            mutableStateOf("")
        }
        TextField(value = textValue.value, onValueChange = {text->
            textValue.value=text

        },
            label = {
                Text(text = "this is TextField...")
            })
    }
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun MyOutLineTextField(){
        var textValue=remember{
            mutableStateOf("")
        }
        OutlinedTextField(value = textValue.value,
                onValueChange = {text->
                    textValue.value=text

                },
            label = {
                Text(text = "this is outline textField")
            }, keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Number
            ),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedLabelColor = colorResource(R.color.teal_200)
                    , focusedBorderColor = colorResource(R.color.purple_500)
            )
        )
    }



}
