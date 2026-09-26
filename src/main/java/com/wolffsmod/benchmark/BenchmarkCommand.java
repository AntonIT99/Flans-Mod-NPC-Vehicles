package com.wolffsmod.benchmark;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;

public final class BenchmarkCommand extends CommandBase {
    @Override public String getCommandName() { return "wolffbenchmark"; }
    @Override public String getCommandUsage(ICommandSender sender) {
        return "/wolffbenchmark [seconds 1-600] [warmup 0-60] [label] | stop | status | mark <label>";
    }
    @Override public int getRequiredPermissionLevel() { return 0; }
    @Override public boolean canCommandSenderUseCommand(ICommandSender sender) { return true; }

    @Override public void processCommand(ICommandSender sender, String[] args) {
        if (args.length > 0 && args[0].equalsIgnoreCase("stop")) { VehicleBenchmark.stop(); return; }
        if (args.length > 0 && args[0].equalsIgnoreCase("status")) { VehicleBenchmark.status(); return; }
        if (args.length > 0 && args[0].equalsIgnoreCase("mark")) {
            VehicleBenchmark.mark(join(args, 1)); return;
        }
        try {
            int seconds = args.length == 0 ? 30 : Integer.parseInt(args[0]);
            int warmup = 5, labelStart = 1;
            if (args.length > 1 && args[1].matches("[0-9]+")) {
                warmup = Integer.parseInt(args[1]); labelStart = 2;
            }
            if (seconds < 1 || seconds > 600 || warmup < 0 || warmup > 60) throw new NumberFormatException();
            VehicleBenchmark.start(seconds, warmup, join(args, labelStart));
        } catch (NumberFormatException failure) {
            VehicleBenchmark.chat(getCommandUsage(sender));
        }
    }

    private static String join(String[] args, int start) {
        StringBuilder label = new StringBuilder();
        for (int i = start; i < args.length && label.length() < 120; i++) {
            if (label.length() > 0) label.append(' ');
            label.append(args[i]);
        }
        return label.length() > 120 ? label.substring(0, 120) : label.toString();
    }
}
