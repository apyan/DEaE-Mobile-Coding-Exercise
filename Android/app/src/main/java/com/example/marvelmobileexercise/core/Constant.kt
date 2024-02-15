package com.example.marvelmobileexercise.core

import java.math.BigInteger
import java.security.MessageDigest
import java.sql.Timestamp

object Constant {

    const val BASE_URL = "https://gateway.marvel.com/"

    const val API_PUBLIC_KEY = "b9b09f15d2a0838f2365dae80639c4e1"
    private const val API_PRIVATE_KEY = "2c4c6fcee94d89cf97298cad435e47e2dcc777b9"

    // Comic Book ID samples
    private const val CB_2004_SUB_MARINER = "1231"
    private const val CB_1941_CAPTAIN_AMERICA = "7852"
    private const val CB_1949_LOVE_ROMANCES = "9876"
    private const val CB_2004_X_MEN = "5632"
    private const val CB_2000_ULTIMATE_SPIDER_MAN = "4745"

    const val SELECTED_ID = CB_2000_ULTIMATE_SPIDER_MAN

    val timeStamp = Timestamp(System.currentTimeMillis()).time.toString()

    fun createHash(): String {
        val concatToken = "$timeStamp$API_PRIVATE_KEY$API_PUBLIC_KEY"
        val messageDigest = MessageDigest.getInstance("MD5")
        return BigInteger(1, messageDigest.digest(concatToken.toByteArray()))
                .toString(16)
    }
}