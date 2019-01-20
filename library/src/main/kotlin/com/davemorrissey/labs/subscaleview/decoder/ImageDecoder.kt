package com.davemorrissey.labs.subscaleview.decoder

import android.content.Context
import android.graphics.Bitmap
import android.net.Uri

interface ImageDecoder {
    fun decode(context: Context, uri: Uri): Bitmap
}
