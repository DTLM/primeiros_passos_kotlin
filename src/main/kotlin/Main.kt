package thiago

import thiago.modal.User
import thiago.service.imple.ServiceImple
import java.util.prefs.Preferences

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    var serviceImple = ServiceImple()
    serviceImple.sendMensgam("ola, mundo.")
    var usuario = User()
    usuario.trocarNome("thiago")
    println(usuario.nome)
    println(usuario.id)
}