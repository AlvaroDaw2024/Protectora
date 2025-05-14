package presentacion

import bbdd.AnimalesDAOImp
import bbdd.SolicitudImplFichero
import javafx.collections.FXCollections
import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.ComboBox
import javafx.scene.control.RadioButton
import javafx.scene.control.TextField
import negocio.Animal
import utilities.Constantes
import utilities.TipoSolicitud

class SolicitudController {


    @FXML
    private lateinit var comboAnimales: ComboBox<Animal>

    @FXML
    private lateinit var radioAcoger: RadioButton

    @FXML
    private lateinit var radioAdoptar: RadioButton

    @FXML
    private lateinit var txtEmail: TextField

    @FXML
    fun onPressedEnviar(event: ActionEvent) {
        var nombre = comboAnimales.selectionModel.selectedItem.returnName()
        var email = txtEmail.text
        var adopcion:TipoSolicitud = TipoSolicitud.ADOPCION
        if (radioAcoger.isSelected){
            adopcion = TipoSolicitud.ACOGIDA
        }
        if (nombre.isNotBlank() && email.isNotBlank()){
            SolicitudImplFichero.solicitudAnimal(nombre,email,adopcion)
            txtEmail.clear()
            comboAnimales.selectionModel.clearSelection()
            cargarAnimales()
        }else{
            println("Faltan datos")// aqui iria una ventana pero pasando que tardo 10m de mas
        }
    }

    @FXML
    fun initialize (){
        cargarAnimales()
    }

    fun cargarAnimales(){
        var animales = AnimalesDAOImp.getAllAnimales()
        var animalesFiltered = mutableListOf<Animal>()
        animales.forEach{
           if (it.checkCantidadSolicitudes() < Constantes.LIMITE_ADOPCIONES){
               animalesFiltered.add(it)
           }
        }
        val lista = FXCollections.observableArrayList(animalesFiltered)
        comboAnimales.items = lista
    }

}
