import gg.rsmod.game.model.priv.Privilege

on_command("yell") {

    val rank: String

    if (player.privilege.id.equals(1))
        rank = "Donator"
    else if (player.privilege.id.equals(2))
        rank = "Admin"
    else if (player.privilege.id.equals(3))
        rank = "Developer"
    else if (player.username.equals("fritz", ignoreCase = true))
        rank = "Owner"
    else
        rank = "Player"

    val args = player.getCommandArgs()
    val name = player.username
    val text = args[0].toString()
    player.message("[${rank}]${name}:${text}", ChatMessageType.ENGINE)

}

