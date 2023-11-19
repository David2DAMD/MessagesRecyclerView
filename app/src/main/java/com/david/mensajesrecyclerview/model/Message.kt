package com.david.mensajesrecyclerview.model

import androidx.annotation.DrawableRes

data class Message(val authorName: String, @DrawableRes val imgAuthor: Int, val text: String) {

}