package ru.kirshov.presentation

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import ru.kirshov.data.actions.NavigationActions

@Composable
fun RootBottomBar(modifier: Modifier = Modifier, selected: (NavigationActions) -> Unit) {
    var selectedItem by remember {
        mutableStateOf(0)
    }
    val list = listOf(
        BottomBarItemState("Input"),
        BottomBarItemState("two"),
        BottomBarItemState("three")
    )
    BottomAppBar(modifier = modifier.fillMaxWidth()) {
        list.forEachIndexed { index, bottomBarItemState ->
            BottomNavigationItem(selected = selectedItem == index,
                onClick = {
                    selectedItem = index
                    when(index){
                        0 -> selected(NavigationActions.INPUT)
                        1->selected(NavigationActions.HISTORY)
                        2->selected(NavigationActions.SETTING)
                    }
                }, icon = {
                    Text(text = bottomBarItemState.title)
                })
        }
    }
}

private data class BottomBarItemState(
    val title: String,

    )