package com.example.tetrisbarrotview

import android.app.Activity
import android.content.Context
import android.graphics.Paint
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.RectF
import android.view.View
import android.view.MotionEvent

val parts : Int = 4
val scGap : Float = 0.02f / parts
val strokeFactor : Float = 90f
val barHFactor : Float = 9.8f
val rot : Float = 90f
val delay : Long = 20
val backColor : Int = Color.parseColor("#BDBDBD")
val colors : Array<Int> = arrayOf(
    "#F44336",
    "#009688",
    "#2196F3",
    "#FF9800",
    "#795548"
).map {
    Color.parseColor(it)
}.toTypedArray()
