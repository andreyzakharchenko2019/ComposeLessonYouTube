package com.andreyzakharchenko.composelessonyoutube

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Gray)
            ) {
                itemsIndexed(
                    listOf(
                        ItemRowModel(R.drawable.man, "John", "test"),
                        ItemRowModel(R.drawable.ic_launcher_foreground, "Michle", "Равным образом реализация намеченных плановых заданий в значительной степени обуславливает создание направлений прогрессивного развития. Таким образом укрепление и развитие структуры позволяет выполнять важные задания по разработке системы обучения кадров, соответствует насущным потребностям. С другой стороны дальнейшее развитие различных форм деятельности требуют определения и уточнения дальнейших направлений развития. "),
                        ItemRowModel(R.drawable.ic_launcher_foreground, "Nick", "Не следует, однако забывать, что новая модель организационной деятельности играет важную роль в формировании направлений прогрессивного развития. Равным образом дальнейшее развитие различных форм деятельности позволяет оценить значение системы обучения кадров, соответствует насущным потребностям. "),
                        ItemRowModel(R.drawable.ic_launcher_foreground, "Fred", "С другой стороны реализация намеченных плановых заданий обеспечивает широкому кругу (специалистов) участие в формировании существенных финансовых и административных условий. С другой стороны консультация с широким активом требуют определения и уточнения дальнейших направлений развития. Идейные соображения высшего порядка, а также постоянный количественный рост и сфера нашей активности влечет за собой процесс внедрения и модернизации систем массового участия. "),
                        ItemRowModel(R.drawable.man, "Racketa", "Равным образом новая модель организационной деятельности позволяет выполнять важные задания по разработке существенных финансовых и административных условий. Равным образом консультация с широким активом позволяет оценить значение форм развития.")
                    )
                ) { _, item ->
                    ItemRow(item = item)
                }
            }
        }
    }
}