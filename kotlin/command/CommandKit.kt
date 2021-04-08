package command

class CommandKit(private val robot: Robot) {
    private val commands = ArrayList<Command>()

    fun addCommand(command: Command){
        this.commands.add(command)
    }

    fun startCommand(){
        for(command in commands){
            command.equipRobot(robot)
            command.execute()
        }
    }

}