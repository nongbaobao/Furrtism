package io.random.util

import okhttp3.OkHttpClient
import okhttp3.Request

object Browser {

    fun get(url: String): String? {
        val client = OkHttpClient()
        val request = Request.Builder()
            .url(url)
            .build()
        val response = client.newCall(request).execute()
        if (response.isSuccessful) {
            val json = response.body?.string()
            response.close()
            return json
        }

        return null
    }

}