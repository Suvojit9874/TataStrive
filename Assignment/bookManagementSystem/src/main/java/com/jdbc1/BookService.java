package com.jdbc1;

import java.util.Scanner;

public class BookService {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("        Welcome To Book Management System         \n");
			do {
				System.out.println("\n1.Show All Books \n2.Show Book By Id \n3.Insert New Book"
						+ "\n4.Delete Book \n5.Update Book By Id \n6.Exit\n");
			System.out.println("Enter you choise");
			int key =sc.nextInt();
			sc.nextLine();
			switch (key) {
			case 1:FetchingData.showBook();
				break;
			case 2:FetchingData.showBookByID();
			    break;
			case 3:InsertRecordUsingPS.InsertBook();
			    break;
			case 4: Delete.removeBook();
			    break;
			case 5:UpdateEx.updateTable();    
			    break;
			case 6:System.out.println("Thank You");
				System.exit(0);
			default: System.out.println("Select a Valid Option");
				break;
			}
			}while (true);
			
		}
}
