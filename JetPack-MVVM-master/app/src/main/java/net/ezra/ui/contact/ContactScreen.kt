package net.ezra.ui.contact


import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_HOME


@Composable
fun ContactScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .background(color = Color.LightGray)
    ) {

     Image(painter = painterResource(id = R.drawable.four),
         modifier = Modifier
             ,
         contentDescription = "")
        Text(text = "Reach to  me at 0766099765  or email at clairehome@gmail.com")





     Text(
        modifier = Modifier
            .clickable {
                navController.navigate(ROUTE_HOME) {
                    popUpTo(ROUTE_CONTACT) { inclusive = true }
                }
            },
        text = "Contact"
    )






    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    ContactScreen(rememberNavController())
}

