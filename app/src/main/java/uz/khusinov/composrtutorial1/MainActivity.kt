package uz.khusinov.composrtutorial1

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uz.khusinov.composrtutorial1.ui.theme.ComposrTutorial1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposrTutorial1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(Message("" , "Programmer"))
                }
            }
        }
    }
}

data class Message(val author: String, val body:String)

@Composable
fun Greeting(msg: Message, modifier: Modifier = Modifier) {
    Row(modifier = Modifier.padding(all = 8.dp)) {
        Image(painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Profile picture",
        modifier = Modifier
            .size(40.dp)
            // Set image size to 40 dp
            .clip(CircleShape)
            )
        Spacer(modifier = Modifier.width(8.dp))
        Column() {
            Text(
                text = msg.author ,
                modifier = modifier
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = msg.body ,
                modifier = modifier
            )
            Text(text = "Take a lot at this beautiful text" ,
            modifier = modifier)

        }  
    }
    

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposrTutorial1Theme {
        Greeting(Message("Shaxriyor" , "Androidchi"))
    }
}