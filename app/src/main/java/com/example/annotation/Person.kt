package com.example.annotation

import com.example.autoadapter.annotations.AdapterModel
import com.example.autoadapter.annotations.ViewHolderBinding

@AdapterModel(layoutId = "com.example.annotation.R.layout.layout_person")
data class Person(
    @ViewHolderBinding("com.example.annotation.R.id.name", "name") val name: String,
    @ViewHolderBinding("com.example.annotation.R.id.address", "address") val address: String
)

