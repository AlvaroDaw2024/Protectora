package bbdd

import utilities.SQL

object GastoFechaImpl:GastoFechaDAO{
private var conexion = ConexionBBDD()
    override fun insertarGasto(gasto: Double): Boolean {
        conexion.conectar()
        var statement = conexion.getPreparedStatement(SQL.INSERT_GASTO)
        statement?.setDouble(1, gasto)
        var correcto = statement?.executeUpdate()
        statement?.close()
        conexion.desconectar()
        return correcto == 1
    }
}