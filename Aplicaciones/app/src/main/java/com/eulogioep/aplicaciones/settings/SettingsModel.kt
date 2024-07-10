package com.eulogioep.aplicaciones.settings

data class SettingsModel(
    var volume: Int,
    var bluetooth: Boolean,
    var vibration: Boolean,
    var darkMode: Boolean
)
