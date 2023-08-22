package com.task.movie.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn

abstract class BaseViewModel<T> : ViewModel() {

    protected abstract val viewModelState: MutableStateFlow<T>

    val uiState by lazy {
        viewModelState
            .stateIn(
                viewModelScope,
                SharingStarted.Eagerly,
                viewModelState.value
            )
    }
}