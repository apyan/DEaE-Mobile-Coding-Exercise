package com.example.marvelmobileexercise

import com.example.marvelmobileexercise.viewmodel.ComicBookViewModel
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class ComicBookViewModelUnitTest {

    private lateinit var comicBookViewModel: ComicBookViewModel

    @Before
    fun setup() {
        comicBookViewModel = ComicBookViewModel()
    }

    @Test
    fun check_for_initial_data() {
        assertThat(comicBookViewModel.comicBookList.value.isEmpty()).isTrue()
    }
}