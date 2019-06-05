package manage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class VIP_manage {
	private static String[] user_list;
	private static int[] user_visit_num;
	private static int user_num;
	
	public static int vip_discount(String car_num) {
		int visit_num = find(car_num);
		System.out.println(visit_num + "번 방문으로 할인되었습니다.");
		return (visit_num / 3) + 1;
	}
	
	public static int find(String car_num) {
		for (int i = 0; i < user_num; i++) {
			if (user_list[i].equals(car_num)) {
				return i;
			}
		}
		return -1;
	}
	
	public static void read() {
		try (Scanner sc = new Scanner(new File("user_list.txt"))) {
			user_num = sc.nextInt();
			user_list = new String[user_num];
			user_visit_num = new int[user_num];
			
			for (int i = 0; i < user_num; i++) {
				user_list[i] = sc.next();
				user_visit_num[i] = sc.nextInt();
			}
		} catch (FileNotFoundException e) {
			System.out.println("[VIP_manage.txt 파일이 없습니다]");
		}
	}
	
	public static void write(String car_num) {
		read();
		try (PrintStream out = new PrintStream(new FileOutputStream("user_list.txt"))) {
			boolean newUser;
			int user_index = find(car_num);
			newUser = find(car_num) == -1 ? true : false;
			if (newUser) user_num++;
			else user_visit_num[user_index]++;
			
			out.println(user_num);
			for (int i = 0; i < user_list.length; i++)
				out.println(user_list[i] + " " + user_visit_num[i]);
			if (newUser) {
				out.println(car_num + " " + 1);
			}
			out.flush();
		} catch (IOException e) {
			System.out.println("[입출력 오류가 있습니다]");
		}
	}

	public static void print_list() {
		read();
		for (int i = 0; i < user_num; i++) {
			System.out.println(user_list[i] + " " + user_visit_num[i]);
		}
	}
}
