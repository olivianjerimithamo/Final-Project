package net.ezra.ui.shop


import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R


@Composable
fun ShopScreen(navController: NavHostController) {
   Text(text = "Go get your taste")
    Spacer(modifier = Modifier.height(25.dp))

    LazyColumn {
        item {
            Row {
                Box {
                    Card {
                        Image(painter = painterResource(id = R.drawable.one), contentDescription ="" )
                    }
                }
                Spacer(modifier = Modifier.width(16.dp))
                Box {
                    Card {
                        Image(painter = painterResource(id = R.drawable.two), contentDescription ="" )
                    }
                    Spacer(modifier = Modifier.width(16.dp))

                }
                Box {
                    Card {
                        Image(painter = painterResource(id = R.drawable.six), contentDescription ="" )
                    }
                }
                Spacer(modifier = Modifier.width(16.dp))
            }

            Row {
                Box {
                    Card {
                        Image(painter = painterResource(id = R.drawable.seven), contentDescription ="" )
                    }

                }
                Spacer(modifier = Modifier.width(16.dp))

                Box {
                    Card {
                        Image(painter = painterResource(id = R.drawable.eight), contentDescription ="" )
                    }
                }
                Spacer(modifier = Modifier.width(16.dp))

                Box {
                    Card {
                        Image(painter = painterResource(id = R.drawable.three), contentDescription ="" )
                    }
                }

            }

        }
    }

    
    
    
    
    
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    ShopScreen(rememberNavController())
}

