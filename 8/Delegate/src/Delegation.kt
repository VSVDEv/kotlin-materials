interface Car{
    fun move()
    fun stop()
    fun turn(dir: EDirection)
}

enum class EDirection {
    LEFT, RIGHT
}

class MyCar: Car {
    var isMoving = false
    private set(value) {
        field = value
        println("is moving = $field")
    }

    override fun move() {
        isMoving = true
    }

    override fun stop() {
        isMoving = false
    }

    override fun turn(dir: EDirection) {
        when(dir){
            EDirection.LEFT -> turnLeft()
            EDirection.RIGHT -> turnRight()
        }
    }

    private fun turnLeft() = println("turned left")
    private fun turnRight() = println("turned right")

}

class DelegationCar(): Car {
    private val myCar = MyCar()

    override fun move() {
        myCar.move()
    }

    override fun stop() {
        myCar.stop()
    }

    override fun turn(dir: EDirection) {
        if (myCar.isMoving) {
            myCar.turn(dir)
        } else println("car is stopped")
    }
}

class DelegationCar2(private val myCar: MyCar = MyCar()): Car by myCar {

    override fun turn(dir: EDirection) {
        if (myCar.isMoving) {
            myCar.turn(dir)
        } else println("car is stopped")
    }
}