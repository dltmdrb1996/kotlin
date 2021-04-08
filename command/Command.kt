package command

import kotlin.properties.Delegates

abstract class Command {
    protected lateinit var robot: Robot

    fun equipRobot(robot: Robot) {
        this.robot = robot
    }

    abstract fun execute()
}

class MoveForwardCommand(val space: Int) : Command() {

    override fun execute() {
        robot.moveForward(space)
    }
}

class TurnCommand(val direction: Robot.Direction) : Command() {

    override fun execute() {
        robot.turn(direction)
    }
}

class PickupCommand() : Command() {

    override fun execute() {
        robot.pickup()
    }
}