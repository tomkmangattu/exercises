package exercises1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Browser {
	private static List<String> urlList;
	
	Browser(){
		urlList = new ArrayList<String>();
	}
	
	Browser(String[] urls){
		setHistory(urls);
	}
	
	void setHistory(String[] urls) {
		for(String url: urls) {
			urlList.add(url);
		}
	}
	
	void addUrl(String url) {
		urlList.add(url);
	}
	
	void showHistory() {
		for(String url : urlList) {
			System.out.println(url);
		}
	}
}

public class Test{
	public static void main(String args[]) {
		Browser chrome = new Browser();
		String[] urls = {"www.google.com", "web.whatsapp.com"};
		String input = "";
		chrome.setHistory(urls);
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Enter url: ");
			input = scan.nextLine();
			chrome.addUrl(input);
			
			System.out.println("Do you want to continue (y/n) :");
			input = scan.nextLine();
			
		}while(input.equalsIgnoreCase("Y"));
		
		System.out.println("\tShowing history");
		chrome.showHistory();
		
		scan.close();
	}
}
