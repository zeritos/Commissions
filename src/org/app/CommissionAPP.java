package org.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CommissionAPP {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/*
		 * Temporary input
		 */

		String inProd = "338";
		String inCover = "LEVI";
		String inDate = "15-12-2017";
		String inRate = "50.00";

		RateFile rateFile;
		RateFile rateFileOut;

		String filename = "base.txt";
		File file = new File(filename);
		try {
			Scanner inputStream = new Scanner(file);

			while (inputStream.hasNext()) {

				String data = inputStream.next();

				String[] values = data.split(":");

				rateFile = new RateFile(values[0], values[1], values[2], values[3], values[4], values[5]);

				System.out.println(rateFile);

				// Localizamos el producto de la entrada
				if (inProd.equals(rateFile.getProd())) {
					if (inCover.equals(rateFile.getCover())) {
						
						rateFileOut = new RateFile(rateFile);
						
						rateFile.setEndDate("25-11-2017");
						rateFile.setRate(inRate);
						
						System.out.println("*****" + rateFileOut);

					}
				}

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
