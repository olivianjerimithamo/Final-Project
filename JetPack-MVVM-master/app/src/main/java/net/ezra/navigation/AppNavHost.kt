package net.ezra.navigation

//import androidx.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.ezra.ui.SplashScreen
import net.ezra.ui.about.AboutScreen
import net.ezra.ui.auth.LoginScreen
import net.ezra.ui.auth.SignupScreen
import net.ezra.ui.contact.ContactScreen
import net.ezra.ui.evening.EveningScreen
import net.ezra.ui.home.HomeScreen
import net.ezra.ui.mit.MitScreen
import net.ezra.ui.products.AddProductScreen
import net.ezra.ui.products.ViewProductsScreen
//import net.ezra.ui.products.ProductsScreen
import net.ezra.ui.services.ServicesScreen
import net.ezra.ui.shop.ShopScreen
import net.ezra.ui.students.AddStudents

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_SPLASH

) {

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {


        composable(ROUTE_LOGIN) {
            LoginScreen(navController)
        }


        composable(ROUTE_SIGNUP) {
            SignupScreen(navController)
        }


        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }


        composable(ROUTE_ABOUT) {
            AboutScreen(navController)
        }

        composable(ROUTE_SERVICES) {
            ServicesScreen(navController)
        }

        composable(ROUTE_MIT) {
            MitScreen(navController)
        }

        composable(ROUTE_CONTACT) {
            ContactScreen(navController)
        }

        composable(ROUTE_SHOP) {
            ShopScreen(navController)
        }

        composable(ROUTE_PRODUCTS) {
            AddProductScreen(navController = navController){}
        }

        composable(ROUTE_EVENING) {
            EveningScreen(navController)
        }
        composable(ROUTE_ADD_STUDENTS) {
            AddStudents(navController)
        }

        composable(ROUTE_SPLASH) {
            SplashScreen(navController)
        }
        composable(ROUTE_PRODUCTS) {
            AddProductScreen(navController ) {

            }
        }

        composable(ROUTE_PRODUCTS) {
            ViewProductsScreen(navController) {

            }
        }}}




       //    composable()

        //composable("productDetail/{productId}") { backStackEntry ->
          //  val productId = backStackEntry.arguments?.getString("productId") ?: ""
          //  ProductDetailScreen(navController, productId)
           // }
































