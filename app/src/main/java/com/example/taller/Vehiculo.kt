package com.example.taller

class Vehiculo (val name: String, val age: Int, val propiedades: Array<Propiedad>){
    enum class Propiedad{
        TRACCION,
        MOTOR,
        TIPO,
        CAPACIDAD
        }

    fun code(){
        for (propiedad in propiedades){
            println("Propiedad del vehículo: " + propiedad)
        }
    }

}