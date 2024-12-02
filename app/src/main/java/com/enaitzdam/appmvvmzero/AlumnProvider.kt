package com.enaitzdam.appmvvmzero

class AlumnProvider {
    companion object {
        fun getAlumns(): List<AlumnModel> {
            return alumns
        }

        private val alumns = listOf(
            AlumnModel(name = "Carlos Gómez", age = 10),
            AlumnModel(name = "María Pérez", age = 11),
            AlumnModel(name = "Juan Rodríguez", age = 12),
            AlumnModel(name = "Ana Sánchez", age = 13),
            AlumnModel(name = "Luis Martínez", age = 14),
            AlumnModel(name = "Laura López", age = 15),
            AlumnModel(name = "José García", age = 16),
            AlumnModel(name = "Carmen Fernández", age = 17),
            AlumnModel(name = "Miguel Díaz", age = 18),
            AlumnModel(name = "Sofía Jiménez", age = 19),
            AlumnModel(name = "David Ruiz", age = 20),
            AlumnModel(name = "Patricia Torres", age = 10),
            AlumnModel(name = "Pedro Sánchez", age = 11),
            AlumnModel(name = "Marta González", age = 12),
            AlumnModel(name = "Alberto Hernández", age = 13),
            AlumnModel(name = "Elena Pérez", age = 14),
            AlumnModel(name = "Antonio García", age = 15),
            AlumnModel(name = "Isabel Martínez", age = 16),
            AlumnModel(name = "Fernando López", age = 17),
            AlumnModel(name = "Raquel Sánchez", age = 18),
            AlumnModel(name = "Juan Carlos Díaz", age = 19),
            AlumnModel(name = "Paula Ruiz", age = 20),
            AlumnModel(name = "Javier Jiménez", age = 10),
            AlumnModel(name = "Lucía Torres", age = 11),
            AlumnModel(name = "Ricardo Fernández", age = 12),
            AlumnModel(name = "Beatriz González", age = 13),
            AlumnModel(name = "Francisco Hernández", age = 14),
            AlumnModel(name = "Verónica Pérez", age = 15),
            AlumnModel(name = "Tomás Sánchez", age = 16),
            AlumnModel(name = "Mónica García", age = 17),
            AlumnModel(name = "José Luis Díaz", age = 18),
            AlumnModel(name = "Nuria Ruiz", age = 19),
            AlumnModel(name = "Sergio Fernández", age = 20),
            AlumnModel(name = "Cristina López", age = 10),
            AlumnModel(name = "Raúl Sánchez", age = 11),
            AlumnModel(name = "Teresa Martínez", age = 12),
            AlumnModel(name = "Oscar Jiménez", age = 13),
            AlumnModel(name = "Inés Pérez", age = 14),
            AlumnModel(name = "Julio Ruiz", age = 15),
            AlumnModel(name = "Antonio López", age = 16),
            AlumnModel(name = "Lorena Sánchez", age = 17),
            AlumnModel(name = "Pablo García", age = 18)
        )
    }
}

