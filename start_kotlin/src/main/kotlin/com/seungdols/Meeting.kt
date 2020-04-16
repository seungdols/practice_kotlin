package com.seungdols

/**
 * @PACKAGE com.seungdols
 * @Author seungdols
 * @Date 2020-04-16
 */
class Meeting(val title: String) {
    var location: String = ""
    @JvmField
    var description: String = ""

    companion object {
        @JvmField
        val APP_VERSION: String = "0.0.1"
    }
}
