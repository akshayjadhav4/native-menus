package expo.modules.nativemenus

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ExitToApp
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun IconWithString(icon: String) {
    val iconList: Map<String, ImageVector> = remember {
        mapOf(
            "Build" to Icons.Default.Build,
            "Call" to Icons.Default.Call,
            "CheckCircle" to Icons.Default.CheckCircle,
            "Check" to Icons.Default.Check,
            "Clear" to Icons.Default.Clear,
            "Close" to Icons.Default.Close,
            "Create" to Icons.Default.Create,
            "DateRange" to Icons.Default.DateRange,
            "Delete" to Icons.Default.Delete,
            "Done" to Icons.Default.Done,
            "Edit" to Icons.Default.Edit,
            "Email" to Icons.Default.Email,
            "ExitToApp" to Icons.AutoMirrored.Filled.ExitToApp,
            "Face" to Icons.Default.Face,
            "FavoriteBorder" to Icons.Default.FavoriteBorder,
            "Favorite" to Icons.Default.Favorite,
            "Home" to Icons.Default.Home,
            "Info" to Icons.Default.Info,
            "KeyboardArrowDown" to Icons.Default.KeyboardArrowDown,
            "KeyboardArrowLeft" to Icons.AutoMirrored.Filled.KeyboardArrowLeft,
            "KeyboardArrowRight" to Icons.AutoMirrored.Filled.KeyboardArrowRight,
            "KeyboardArrowUp" to Icons.Default.KeyboardArrowUp,
            "List" to Icons.AutoMirrored.Filled.List,
            "LocationOn" to Icons.Default.LocationOn,
            "Lock" to Icons.Default.Lock,
            "MailOutline" to Icons.Default.MailOutline,
            "Menu" to Icons.Default.Menu,
            "MoreVert" to Icons.Default.MoreVert,
            "Notifications" to Icons.Default.Notifications,
            "Person" to Icons.Default.Person,
            "Phone" to Icons.Default.Phone,
            "Place" to Icons.Default.Place,
            "PlayArrow" to Icons.Default.PlayArrow,
            "Refresh" to Icons.Default.Refresh,
            "Search" to Icons.Default.Search,
            "Send" to Icons.AutoMirrored.Filled.Send,
            "Settings" to Icons.Default.Settings,
            "Share" to Icons.Default.Share,
            "ShoppingCart" to Icons.Default.ShoppingCart,
            "Star" to Icons.Default.Star,
            "ThumbUp" to Icons.Default.ThumbUp,
            "Warning" to Icons.Default.Warning,
        )
    }

    val iconVector: ImageVector? = iconList[icon]

    if (iconVector != null) {
        Icon(
            imageVector = iconVector,
            contentDescription = icon,
        )
    }
}