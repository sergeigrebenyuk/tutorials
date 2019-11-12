/*
 * To the extent possible under law, the ImageJ developers have waived
 * all copyright and related or neighboring rights to this tutorial code.
 *
 * See the CC0 1.0 Universal license for details:
 *     http://creativecommons.org/publicdomain/zero/1.0/
 *
 * This work was supported by the German Research Foundation (DFG) under the code JU3110/1-1 (Fiji Software Sustainability).
 */

package howto.headless;

import net.imagej.ImageJ;

/**
 * How to start {@link ImageJ} in headless mode
 *
 * @author Deborah Schmidt
 */
public class StartImageJHeadless {

	private static void run() {
		ImageJ ij = new ImageJ();
		ij.ui().setHeadless(true);
		System.out.println("headless: " + ij.ui().isHeadless());
	}

	public static void main(String...args) {
		run();
	}

}