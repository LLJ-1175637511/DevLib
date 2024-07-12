package com.llj.android.library.vm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * @author liulinjie @ Zhihu Inc.
 * @since 07-12-2024
 */
class MainViewModel : ViewModel() {

    val data = MutableLiveData<Unit>()

}