sealed class Machine {

// allows use only spicial inheritor(successor, heir) only in class
    class CoffeeMachine(private val type: ECoffee) : Machine() {
        fun makeCoffee(): Boolean {
            return when (type) {
                ECoffee.AMERICANO -> {println("your ${ECoffee.AMERICANO}"); true}
                ECoffee.CAPPUCHINO -> {println("your ${ECoffee.CAPPUCHINO}"); true}
            }
        }
    }

    class MicrowaveOvn(private val action: EMicrowaveOvn) : Machine() {
        fun makeCoffee(): Boolean {
            return when (action) {
                EMicrowaveOvn.UNFREEZE -> {println("unfreezed"); true}
                EMicrowaveOvn.WARM_UP -> {println("warmed up"); true}
            }
        }
    }
}

fun doAction(machine: Machine) = when (machine) {
        is Machine.CoffeeMachine -> {machine.makeCoffee(); true}
        is Machine.MicrowaveOvn -> {machine.makeCoffee(); true}
		is UnknownMachine ->{false}
    }


//class UnknownMachine: Machine()