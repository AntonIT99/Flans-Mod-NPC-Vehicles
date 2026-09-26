package com.wolffsmod.benchmark;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

public final class ServerBenchmarkCommand extends CommandBase {
    @Override public String getCommandName() { return "wolffserverbenchmark"; }
    @Override public String getCommandUsage(ICommandSender sender) {
        return "/wolffserverbenchmark [seconds 1-600] [warmup 0-60] [label] | stop | status";
    }
    @Override public int getRequiredPermissionLevel() { return 2; }
    @Override public void processCommand(ICommandSender sender, String[] args) {
        if (args.length > 0 && args[0].equalsIgnoreCase("stop")) { ServerBenchmark.stop("PARTIAL: stopped by command"); return; }
        if (args.length > 0 && args[0].equalsIgnoreCase("status")) { ServerBenchmark.status(sender); return; }
        try {
            int seconds = args.length == 0 ? 30 : Integer.parseInt(args[0]), warmup = 5, labelStart = 1;
            if (args.length > 1 && args[1].matches("[0-9]+")) { warmup = Integer.parseInt(args[1]); labelStart = 2; }
            if (seconds < 1 || seconds > 600 || warmup < 0 || warmup > 60) throw new NumberFormatException();
            StringBuilder label = new StringBuilder();
            for (int i = labelStart; i < args.length && label.length() < 120; i++) {
                if (label.length() > 0) label.append(' ');
                label.append(args[i]);
            }
            ServerBenchmark.start(sender, seconds, warmup, label.substring(0, Math.min(120, label.length())));
        } catch (NumberFormatException failure) { sender.addChatMessage(new ChatComponentText(getCommandUsage(sender))); }
    }
}
