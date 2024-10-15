package ru.yandex.practicum.sprint13koh20

import androidx.annotation.StringRes

enum class ScreenMode {
    CATALOG, CART;

    val titleResId: Int
        @StringRes
        get() {
            return when (this) {
                CATALOG -> R.string.catalog_title
                CART -> R.string.cart_title
            }
        }

}


