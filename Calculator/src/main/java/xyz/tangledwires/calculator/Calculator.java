package xyz.tangledwires.calculator;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class Calculator extends JavaPlugin {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("add")) { 
			if (args.length < 2) {
				sender.sendMessage("Not enough arguments!");
			}
			else {
				int num1 = Integer.parseInt(args[0]);
				int num2 = Integer.parseInt(args[1]);
				int sum = num1 + num2;
				String sumStr = Integer.toString(sum);
				sender.sendMessage(sumStr);
			}
			return true;
		} 
		else if (cmd.getName().equalsIgnoreCase("subtract")) {
			if (args.length < 2) {
				sender.sendMessage("Not enough arguments!");
			}
			else {
				int num1 = Integer.parseInt(args[0]);
				int num2 = Integer.parseInt(args[1]);
				int sub = num1 - num2;
				String subStr = Integer.toString(sub);
				sender.sendMessage(subStr);
			}
			return true;
		}
		return false; 
	}
}