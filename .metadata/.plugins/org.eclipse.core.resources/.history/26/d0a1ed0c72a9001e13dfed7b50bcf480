package net.vac.jtl.commandutils.validcommandutils;

import Exceptions.ValidCountException;

public class ValidCommands {

	public static int valid;

	public static void AddToValidCommandsList() {
		if (valid < 1) {
			valid++;
		} else {
			throw new ValidCountException();
		}
	}

	public static void CheckValidCommandsList() {
		if (valid < 1) {
			System.out.println("Unknown Command...");
		}
	}

}
