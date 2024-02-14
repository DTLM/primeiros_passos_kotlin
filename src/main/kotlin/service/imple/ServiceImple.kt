package thiago.service.imple

import thiago.service.Service

class ServiceImple() : Service{
    override fun sendMensgam(mensagem: String): Unit{
        if (mensagem.isBlank()){
            throw Exception("Nenhuma mensagem para printar.");
        }
        println("mensagem: '$mensagem', sent.")
    }
}