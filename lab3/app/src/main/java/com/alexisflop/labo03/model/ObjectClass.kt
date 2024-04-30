package com.alexisflop.labo03.model

data class ObjectClass(
     var propertyOne: String,
    private var propertyTwo: String
) {
    fun GetPropertyOne(): String {
        return propertyOne;
    }

    fun GetPropertyTwo(): String {
        return propertyTwo;
    }
} /*TODO: Hace ruso de buenas praticas de POO para poder asignar o obtener valores de las properties a utilizar*/
