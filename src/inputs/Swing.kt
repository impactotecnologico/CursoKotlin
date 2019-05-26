package inputs

import javax.swing.JOptionPane

object Swing {
    @JvmStatic
    fun main(args:Array<String>){
        val fecha = java.util.Date()
        JOptionPane.showMessageDialog(null,"Hoy es $fecha")
        val nombre:String = JOptionPane.showInputDialog("Escribe tu nombre:")
        JOptionPane.showMessageDialog(null,"Hola $nombre")
    }
}