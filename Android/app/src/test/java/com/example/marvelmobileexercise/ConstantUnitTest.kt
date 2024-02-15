package com.example.marvelmobileexercise

import com.example.marvelmobileexercise.core.Constant
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class ConstantUnitTest {
    @Test
    fun check_creating_hashcode() {
        val createdHash = Constant.createHash()
        assertThat(createdHash).isNotNull()
    }

    @Test
    fun check_conversion_hashcode() {
        val createdHash = Constant.createHash()
        val concatToken = "${Constant.timeStamp}${Constant.API_PRIVATE_KEY}${Constant.API_PUBLIC_KEY}"
        assertThat(createdHash != concatToken).isTrue()
    }
}