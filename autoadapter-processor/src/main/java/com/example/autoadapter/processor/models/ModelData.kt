package com.example.autoadapter.processor.models

data class ModelData (
    val packageName: String,
    val modelName: String,
    val layoutId: String,
    val viewHolderBindingData: List<ViewHolderBindingData>
)