package negocio

import bbdd.AnimalesDAOImp
import utilities.Constantes
import utilities.Factoria

object CantidadKG {
    var perros = mutableListOf<Perro>()
    var cantidadKilosComida:Double=0.0

    fun calcularCantidadPienso():Double{
        var perros = Factoria.cargarPerros()
        var pienso=0.0
        perros.forEach{
            var edadEnMeses:Int = it.edad*12
            if (edadEnMeses>18){
                when(it.peso){
                    in Constantes.PESO_PERRO_PEQUEÑO ->{
                        pienso+=200
                    }
                    in Constantes.PESO_PERRO_MEDIANO ->{
                        pienso+=300
                    }
                    in Constantes.PESO_PERRO_GRANDE->{
                        pienso+= (it.peso*1000)*0.015
                    }
                }
            }
        }

        return pienso/1000
    }


}