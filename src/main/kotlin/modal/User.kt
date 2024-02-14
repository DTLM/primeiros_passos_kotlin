package thiago.modal

import java.text.DateFormatSymbols
import java.time.LocalDate

data class User(var nome: String? = null, var email: String? = null, var dataNascimento: LocalDate? = null, var id: Long? = null) {
    public fun trocarNome(nome: String?){
        this.nome = nome
    }
    public fun trocarEmail(email: String?){
        this.email = email
    }
    public fun trocarDataNascimento(dataNascimento: LocalDate?){
        this.dataNascimento = dataNascimento
    }
    public fun trocarId(id: Long?){
        this.id = id
    }

}
