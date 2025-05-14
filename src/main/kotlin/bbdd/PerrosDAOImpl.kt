package bbdd

import negocio.Perro
import utilities.Constantes
import utilities.SQL
import utilities.Sexo

object PerrosDAOImpl:PerrosDAO {
    private var conexion = ConexionBBDD()
    override fun getAllPerros(): List<Perro> {
        conexion.conectar()
        var statement = conexion.getStatement()
        var preparedStatement = statement.executeQuery(SQL.SELECT_ALL_PERROS)
        var perros = mutableListOf<Perro>()

        while (preparedStatement.next()) {
            var sexo: Sexo = Sexo.HEMBRA
            if (preparedStatement.getString("Sexo").uppercase() == Constantes.MACHO.uppercase()) {
                sexo = Sexo.MACHO
            }
            val nombre = preparedStatement.getString("Nombre")
            val edad = preparedStatement.getInt("Edad")

            var sociable = false
            if (preparedStatement.getInt("Sociable") == 1) {
                sociable = true
            }
            var apadrinado = false
            if (preparedStatement.getInt("Apadrinado") == 1) {
                apadrinado = true
            }

                var leishmania = false
                if (preparedStatement.getInt("Leishmania") == 1) {
                    leishmania = true
                }
                var ppp = false
                if (preparedStatement.getInt("PPP") == 1) {
                    ppp = true
                }
                val peso = preparedStatement.getInt("Tamaño")
                val raza = preparedStatement.getString("Raza")
                perros.add(
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
            }
        statement.close()
        preparedStatement.close()
        conexion.desconectar()
        return perros
    }
}