/*
 ================================================================
 Author:     Alex Kim
 Date:       10/11/17
 Description:Display percentage of each nucleotide in DNA sequence and total from given file containing sequence.
 ================================================================
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GeneScanner {

	public static void main(String[] args) throws FileNotFoundException {

		// Declare variables
		int aCount = 0, cCount = 0, tCount = 0, gCount = 0, total = 0, lineCounter = 1;
		double aPerc = 0, cPerc = 0, tPerc = 0, gPerc = 0;
		
		// Read file
		File fasta = new File("gene.fasta");
		Scanner sc = new Scanner(fasta);
		
		// Save file to array
		// Determine how many lines exist in file
		while (sc.hasNextLine()) {
			sc.nextLine();
			lineCounter++;
		}
		// Declare array
		String sequences[] = new String[lineCounter];
		// Reread file
		sc = new Scanner(fasta);
		// Save file to array
		for (int i = 0; i < sequences.length - 1 && sc.hasNextLine(); i++) {
			sequences[i] = sc.nextLine();
		}
		
		// Count instances of nucleotide in sequence
		for (int i = 1; i < sequences.length - 1; i++) {
			aCount += sequences[i].length() - sequences[i].toLowerCase().replaceAll("a", "").length();
			cCount += sequences[i].length() - sequences[i].toLowerCase().replaceAll("c", "").length();
			tCount += sequences[i].length() - sequences[i].toLowerCase().replaceAll("t", "").length();
			gCount += sequences[i].length() - sequences[i].toLowerCase().replaceAll("g", "").length();
			// Count total nucleotides
			total += sequences[i].length();
		}
		
		// Determine percentage each nucleotide takes up of sequence
		aPerc = Math.round(((double)aCount / total) * 100.0) / 100.0;
		cPerc = Math.round(((double)cCount / total) * 100.0) / 100.0;
		tPerc = Math.round(((double)tCount / total) * 100.0) / 100.0;
		gPerc = Math.round(((double)gCount / total) * 100.0) / 100.0;
		
		// Print output
		System.out.println("Stats for gene: " + sequences[0]);
		System.out.println("Nucleotide representation in this gene by relative frequency.");
		System.out.println("Percent A: " + aPerc);
		System.out.println("Percent C: " + cPerc);
		System.out.println("Percent T: " + tPerc);
		System.out.println("Percent G: " + gPerc);
		System.out.println("Total number of nucleotides is " + total + ".");
	}
}
