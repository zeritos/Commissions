package org.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class CommissionBaseAPP {

	public static void main(String[] args) {
		
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                SwingPanel.createAndShowGUI();
            }
        });


		String inProd = "338";
		String inCover = "BULD";
		String inDate = "15-12-2017";
		String inRate = "50.00";
		
		BaseStruct rateFile1;
		BaseStruct rateFile2;

		// Input file
		String filename = "PARAM_COMI2.txt";
		File file = new File(filename);

		// Output file

		// List<String> lines = Arrays.asList("The first line", "The second line");
		// Path fileOut = Paths.get("PARAM_COMI_OUT.txt");
		PrintWriter writer;

		try {
			writer = new PrintWriter("PARAM_COMI_OUT.txt", "UTF-8");

			try {

				Scanner inputStream = new Scanner(file);

				while (inputStream.hasNext()) {

					String data = inputStream.nextLine();
					System.out.println(data);

					String[] values = data.split(";");

					rateFile1 = new BaseStruct(values[0], values[1], values[2], values[3], values[4], values[5],
							values[6], values[7], values[8], values[9]);

					// Localizamos el producto de la entrada if
					if (inProd.equals(rateFile1.getProduct())) {
						if (inCover.equals(rateFile1.getCodCover().trim())) {

							rateFile2 = new BaseStruct(rateFile1);

							rateFile2.setEndDate("2017-11-27");
							rateFile2.setRate(inRate);

							rateFile1.setEndDate("2017-12-01");
							

							// System.out.println("*****" + rateFile2);

							// Files.write(fileOut, "Test", Charset.forName("UTF-8"));
							writer.println(rateFile1.escribeSalida());
							writer.println(rateFile2.escribeSalida());

						} else {
							writer.println(rateFile1.escribeSalida());
						}

					}

				}

				writer.close();
				inputStream.close();

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();

		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}

	}

}
