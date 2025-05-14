package bbdd

import negocio.Animal
import negocio.Gato
import negocio.Perro
import utilities.Constantes
import utilities.SQL
import utilities.Sexo

object AnimalesDAOImp : AnimalesDAO {
    private val conexion = ConexionBBDD()

    override fun deleteAnimal(): Boolean {
        conexion.conectar()

        TODO("Not yet implemented")
        conexion.desconectar()
    }

    override fun getAllAnimales(): List<Animal> {
        conexion.conectar()

        val statement = conexion.getStatement()
        val readyStatement = statement.executeQuery(SQL.SELECT_ALL_ANIMALES)
        val animales = mutableListOf<Animal>()

        while (readyStatement.next()) {
            var sexo: Sexo = Sexo.HEMBRA
            if (readyStatement.getString("Sexo").uppercase() == Constantes.MACHO.uppercase()) {
                sexo = Sexo.MACHO
            }
            val nombre = readyStatement.getString("Nombre")
            val edad = readyStatement.getInt("Edad")

            var sociable = false
            if (readyStatement.getInt("Sociable") == 1) {
                sociable = true
            }
            var apadrinado = false
            if (readyStatement.getInt("Apadrinado") == 1) {
                apadrinado = true //ejemplo para mirar esta tarde
            }

            if (readyStatement.getString("Tipo") == Constantes.PERRO) {
                var leishmania = false
                if (readyStatement.getInt("Leishmania") == 1) {
                    leishmania = true
                }
                var ppp = false
                if (readyStatement.getInt("PPP") == 1) {
                    ppp = true
                }
                val peso = readyStatement.getInt("Tamaño")
                val raza = readyStatement.getString("Raza")
                animales.add(
                    Perro(
                        sociable,
                        sexo,
                        nombre,
                        edad,
                        apadrinado,
                        leishmania,
                        peso,
                        ppp,
                        raza
                    )
                )
            } else {
                var esterilizado = false
                if (readyStatement.getInt("Esterilizado") == 1) {
                    esterilizado = true
                }
                animales.add(
                    Gato(
                        sociable,
                        sexo,
                        nombre,
                        edad,
                        apadrinado,
                        esterilizado
                    )
                )
            }

        }
        statement.close()
        readyStatement.close()
        conexion.desconectar()
        return animales

    }

    override fun getAnimalNombre(nombre: String): Animal? {
        conexion.conectar()

        TODO("Not yet implemented")
        conexion.desconectar()

    }

    override fun insertAnimal(): Boolean {
        conexion.conectar()

        TODO("Not yet implemented")
        conexion.desconectar()

    }

    override fun updateAnimal(): Boolean {
        conexion.conectar()

        TODO("Not yet implemented")
        conexion.desconectar()

    }
}