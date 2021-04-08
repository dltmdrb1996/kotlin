package command

fun main(){
    // 각각의 동작들과 // Command
    // 동작을 관리하는 커맨드센터 // CommandKit
    // 동작을 하는 주체를 모듈화 // Robot

    val optimus = Robot()
    val commandKit = CommandKit(optimus)

    commandKit.addCommand(MoveForwardCommand(2))
    commandKit.addCommand(TurnCommand(Robot.Direction.RIGHT))
    commandKit.addCommand(TurnCommand(Robot.Direction.RIGHT))
    commandKit.addCommand(MoveForwardCommand(3))
    commandKit.addCommand(TurnCommand(Robot.Direction.LEFT))
    commandKit.addCommand(MoveForwardCommand(1))
    commandKit.addCommand(PickupCommand())

    commandKit.startCommand()
}
