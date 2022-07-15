import gg.rsmod.game.model.priv.Privilege

on_command("broadcast", Privilege.ADMIN_POWER) {
    val args = player.getCommandArgs()
    val text = args[0].toString()
        player.message("${text}.", ChatMessageType.BROADCAST)
}