fun main(args: Array<String>) {
    MyPage("qwe").title
    val inner = Outer().Inner()
    val staticInner = Outer.StaticInner()

    val coffeeMachine = Machine.CoffeeMachine(ECoffee.AMERICANO)
    //val unknownMachine = UnknownMachine()

    doAction(coffeeMachine)
    //doAction(unknownMachine)

    val robot = Robot()
    println(robot.isInTheCentre)
    robot.x = 25
    robot.y = 30
    println(robot.isInTheCentre)

    val robot2 = Robot()
    val robot3 = Robot()
    val robot4 = robot3
    println(robot.toString())
    println(robot2.toString())

//    println(robot2.equals(robot3))
    //println(robot2.hashCode() == robot3.hashCode())
//    println(robot4.hashCode() == robot3.hashCode())
//    println(robot4 == robot3)
//    println(robot2.hashCode())
//    println("qwe" == "qwe")

    val dataClass = DataClass("Jim", 2300)
    val dataClass2 = DataClass("Jim", 2300)

    println(dataClass == dataClass2)
    println(dataClass.hashCode() == dataClass2.hashCode())

    println(Singleton.hashCode() == Singleton.hashCode())
    println(Singleton == Singleton)

    println(Cat.getInstance("Charli", 5))
}

class MyPage(title: String): Page(title)

//class UnknownMachine2: Machine()