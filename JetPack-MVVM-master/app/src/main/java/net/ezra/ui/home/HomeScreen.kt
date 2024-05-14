package net.ezra.ui.home

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_VIEWPRODUCTS

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavHostController) {
    Scaffold(
       topBar = {
           TopAppBar(
               title = {
                   Text(text = "New Arrivals!!!")
               },
               navigationIcon = {
                   IconButton(onClick = {}) {
                       Icon(Icons.Filled.ShoppingCart, "backIcon")
                   }
               },
               backgroundColor = MaterialTheme.colors.primary,
               contentColor = Color.White,
               elevation = 10.dp
           )
       },
        content = {
            Column(
                modifier = Modifier
                        )
            {
                Text(text = "Shoe Wear")



                Box(
                    modifier = Modifier
                    //  .background(color = Color.Cyan)
                ) {
                    // androidx.compose.material3.Text(text = "Your Final Search Ends Here!!")
                    Spacer(modifier = Modifier.height(25.dp))
                    Button(onClick = { }) {
                        //Text(text = "About")

                        Button(onClick = { }) {
                            Text(text = "About")
                        }


                        Button(onClick = { navController.navigate(ROUTE_VIEWPRODUCTS){
                            popUpTo(ROUTE_HOME){inclusive = true}
                        } }) {
                            Text(text = "view")
                            }


                        Button(onClick = { navController.navigate(ROUTE_CONTACT){
                            popUpTo(ROUTE_HOME){inclusive = true}
                        } }) {
                            Text(text = "Contact")
                        }

                    }

                }
                Row {
                    Box(

                    ) {
                        //Text(text ="Your final search ends here!!", color = Color.Green)
                        Image(painter = painterResource(id = R.drawable.one), contentDescription = "")
                    }
                    Spacer(modifier = Modifier.width(17.dp))
                    Box {
                        Image(painter = painterResource(id = R.drawable.two), contentDescription ="" )
                    }
                    Spacer(modifier = Modifier.width(17.dp))

                    Box {
                        Image(painter = painterResource(id = R.drawable.three), contentDescription = "")
                    }

                }
                Column(
                    modifier = Modifier
                    // .background(color = Color.Green)
                    // .fillMaxSize()
                ) {
                    Text(text = "Your final search ends here")

                    // Image(painter = painterResource(id = R.drawable.seven), contentDescription ="" )
                }

                Image(painter = painterResource(id = R.drawable.twe), contentDescription ="" )


                Column {
                    Image(painter = painterResource(id = R.drawable.home),
                        modifier = Modifier
                            .fillMaxSize()
                        // .fillMaxHeight()
                        ,


                        contentDescription ="" )


                }




            }

        },
        bottomBar = { net.ezra.ui.home.BottomBar()}
    )



}
@Composable
fun BottomBar(){
    val selectedIndex = remember { mutableStateOf(0) }
    BottomNavigation(elevation = 10.dp) {
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Home,"")
        },
            label = { Text(text = "Home") }, selected = (selectedIndex.value == 0), onClick = {
                selectedIndex.value = 0
            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Favorite,"")
        },
            label = { Text(text = "Favorite") }, selected = (selectedIndex.value == 1), onClick = {
                selectedIndex.value = 1
            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Call, "")
        },
            label = { Text(text = "Call") }, selected = (selectedIndex.value == 2), onClick = {
                selectedIndex.value = 2
            })
    }


}












    


@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
}

