package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Lesson> lessonList = new ArrayList<>();

		System.out.print("Quantas aulas tem o curso? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Dados da  " + i + "a aula:");
			System.out.print("Conte�do ou tarefa (c/t)? ");
			sc.nextLine();
			char ch = sc.nextLine().charAt(0);
			System.out.print("T�tulo: ");
			String title = sc.nextLine();

			if (ch == 'c') {
				System.out.print("URL do v�deo: ");
				String url = sc.nextLine();
				System.out.print("Dura��o em segundos: ");
				Integer seconds = sc.nextInt();

				lessonList.add(new Video(title, url, seconds));

			} else {
				System.out.print("Descri��o: ");
				String description = sc.nextLine();
				System.out.print("Dura��o em segundos: ");
				Integer questionCount = sc.nextInt();

				lessonList.add(new Task(title, description, questionCount));
			}

		}
		System.out.println();
		int sum = 0;
		for (Lesson l : lessonList) {
			sum += l.duration();
		}
		System.out.println("DURA��O TOTAL DO CURSO = " + sum + " segundos");

		sc.close();

	}

}
