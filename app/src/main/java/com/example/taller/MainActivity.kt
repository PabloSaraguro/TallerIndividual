package com.example.taller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        Validar si una persona es mayor o menor de edad
        Presentar la tabla de multiplicar de n numero de forma ascendente y descendente.
        Mostrar el listado de paralelo de la materia de Plataformas móviles y los subgrupos
        por proyectos (Mostrar los resultados ordenados).
        Presentar las propiedades de un vehículo utilizando clases, como tracción, motor,
        tipo de vehículo, capacidad
        Algoritmo cálculo de iva 12%
        Validación de cédula

         */


        mayoredad()
        tablamult()
        listadoparalelo()
        calculariva()

    }

    fun mayoredad(){

        println("Prueba de Mayor de Edad")

        var edad = 25;

        if(edad < 18){
            println("Menor de Edad")
        }else{
            println("MAYOR de Edad")
            println( 5 * 5)
        }

    }

    fun tablamult(){

        println("Tabla de Multiplicar")

        var num = 5
        println("Ascendente")
        for (x in 0..10){
            println(num * x)
        }

        println("Descendente")
        for (y in 10 downTo 0){

            println(num * y)

        }

    }

    fun listadoparalelo(){

        val listado= arrayListOf<String>()

        listado.addAll(listOf("Pablo","Bryan","Diego","Mateo","Miguel"))

        println("Listado de estudiantes")
        listado.forEach{
            println(it)
        }

        listado.sort()

        println("Listado de estudiantes Ordenado")
        listado.forEach{
            println(it)
        }
    }

    fun calculariva(){

        println("Algoritmo cálculo de iva 12%")

        val ivaporc = 12
        var subtotal = 200
        var total = 0
        var iva = 0

        iva = subtotal * ivaporc / 100

        total = subtotal + iva

        println("Subtotal: "+ subtotal)
        println("IVA: "+ iva )
        println("Total: "+ total)

    }

    fun validadcionCI(){

        val ci = 1105721912
        val cedula= arrayListOf<Int>()
        var comprobador = 0
        var a = 0
        var b = 0


        cedula.add(1)
        cedula.add(1)
        cedula.add(0)
        cedula.add(5)
        cedula.add(7)
        cedula.add(2)
        cedula.add(1)
        cedula.add(9)
        cedula.add(1)
        cedula.add(2)

        for (x in 0..8){

            if ((x+1)%2!=0){

                if((cedula[x]*2)>9){
                    a = cedula[x] * 2 - 9
                }else{
                    a = cedula[x] * 2
                }
                comprobador = comprobador + a
            }else{
                comprobador = comprobador + cedula[x]
            }

        }

        if ((comprobador%10)!=0){
            b = comprobador/10
            b.toInt()
            b = (b++)*10

        }else{
            b = 0
        }

        if(( b- comprobador) = cedula.last()){

        }



    }
}




